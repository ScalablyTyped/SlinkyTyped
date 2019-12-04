package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.SnackbarProps
import typingsSlinky.materialDashUi.snackbarMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Snackbar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/Snackbar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, open */
  def apply(
    message: TagMod[Any],
    action: TagMod[Any] = null,
    autoHideDuration: Int | Double = null,
    bodyStyle: CSSProperties = null,
    contentStyle: CSSProperties = null,
    onActionClick: SyntheticMouseEvent[js.Object] => Unit = null,
    onRequestClose: /* reason */ String => Unit = null,
    style: CSSProperties = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction1(onActionClick))
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1(onRequestClose))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SnackbarProps
}

