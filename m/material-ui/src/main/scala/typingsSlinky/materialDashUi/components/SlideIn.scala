package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.propTypes.direction
import typingsSlinky.materialDashUi.internalSlideInMod.SlideInProps
import typingsSlinky.materialDashUi.internalSlideInMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SlideIn
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/internal/SlideIn", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    childStyle: CSSProperties = null,
    direction: direction = null,
    enterDelay: Int | Double = null,
    style: CSSProperties = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (childStyle != null) __obj.updateDynamic("childStyle")(childStyle.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SlideInProps
}

