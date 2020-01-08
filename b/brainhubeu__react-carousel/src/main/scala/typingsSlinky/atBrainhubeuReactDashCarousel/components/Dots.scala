package typingsSlinky.atBrainhubeuReactDashCarousel.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atBrainhubeuReactDashCarousel.atBrainhubeuReactDashCarouselMod.DotsProps
import typingsSlinky.atBrainhubeuReactDashCarousel.atBrainhubeuReactDashCarouselMod.ImgProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dots
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.atBrainhubeuReactDashCarousel.atBrainhubeuReactDashCarouselMod.Dots
    ] {
  @JSImport("@brainhubeu/react-carousel", "Dots")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onChange */
  def apply(
    number: Int | Double = null,
    thumbnails: js.Array[ImgProps] = null,
    value: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.atBrainhubeuReactDashCarousel.atBrainhubeuReactDashCarouselMod.Dots
  ] = {
    val __obj = js.Dynamic.literal()
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.atBrainhubeuReactDashCarousel.atBrainhubeuReactDashCarouselMod.Dots
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atBrainhubeuReactDashCarousel.atBrainhubeuReactDashCarouselMod.Dots](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DotsProps
}

