package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticTouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.ChipProps
import typingsSlinky.materialDashUi.chipMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, onClick */
object Chip
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.materialDashUi.chipMod.default].asInstanceOf[String | js.Object]
  def apply(
    backgroundColor: String = null,
    containerElement: TagMod[Any] | String = null,
    deleteIconStyle: CSSProperties = null,
    labelColor: String = null,
    labelStyle: CSSProperties = null,
    onRequestDelete: SyntheticTouchEvent[typingsSlinky.materialDashUi.__MaterialUI.Chip] => Unit = null,
    style: CSSProperties = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (deleteIconStyle != null) __obj.updateDynamic("deleteIconStyle")(deleteIconStyle.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (onRequestDelete != null) __obj.updateDynamic("onRequestDelete")(js.Any.fromFunction1(onRequestDelete))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ChipProps
}

