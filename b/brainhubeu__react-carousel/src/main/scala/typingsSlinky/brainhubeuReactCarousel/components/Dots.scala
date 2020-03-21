package typingsSlinky.brainhubeuReactCarousel.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.brainhubeuReactCarousel.mod.DotsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dots
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.brainhubeuReactCarousel.mod.Dots] {
  @JSImport("@brainhubeu/react-carousel", "Dots")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    number: Int | Double = null,
    onChange: /* value */ Double => Unit = null,
    thumbnails: js.Array[ReactElement] = null,
    value: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.brainhubeuReactCarousel.mod.Dots] = {
    val __obj = js.Dynamic.literal()
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.brainhubeuReactCarousel.mod.Dots] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.brainhubeuReactCarousel.mod.Dots](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DotsProps
}

