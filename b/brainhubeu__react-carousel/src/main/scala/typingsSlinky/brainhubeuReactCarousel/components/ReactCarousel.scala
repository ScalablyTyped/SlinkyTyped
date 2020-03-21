package typingsSlinky.brainhubeuReactCarousel.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.brainhubeuReactCarousel.mod.CarouselProps
import typingsSlinky.brainhubeuReactCarousel.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCarousel
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@brainhubeu/react-carousel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: draggable */
  def apply(
    addArrowClickHandler: js.UndefOr[Boolean] = js.undefined,
    animationSpeed: Int | Double = null,
    arrowLeft: ReactElement = null,
    arrowRight: ReactElement = null,
    arrows: js.UndefOr[Boolean] = js.undefined,
    autoPlay: Int | Double = null,
    breakpoints: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    clickToChange: js.UndefOr[Boolean] = js.undefined,
    dots: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    itemWidth: Int | Double = null,
    keepDirectionWhenDragging: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    onChange: /* value */ Double => Unit = null,
    slides: js.Array[ReactElement] = null,
    slidesPerPage: Int | Double = null,
    slidesPerScroll: Int | Double = null,
    stopAutoPlayOnHover: js.UndefOr[Boolean] = js.undefined,
    value: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addArrowClickHandler)) __obj.updateDynamic("addArrowClickHandler")(addArrowClickHandler.asInstanceOf[js.Any])
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
    if (arrowLeft != null) __obj.updateDynamic("arrowLeft")(arrowLeft.asInstanceOf[js.Any])
    if (arrowRight != null) __obj.updateDynamic("arrowRight")(arrowRight.asInstanceOf[js.Any])
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (autoPlay != null) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToChange)) __obj.updateDynamic("clickToChange")(clickToChange.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(keepDirectionWhenDragging)) __obj.updateDynamic("keepDirectionWhenDragging")(keepDirectionWhenDragging.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (slides != null) __obj.updateDynamic("slides")(slides.asInstanceOf[js.Any])
    if (slidesPerPage != null) __obj.updateDynamic("slidesPerPage")(slidesPerPage.asInstanceOf[js.Any])
    if (slidesPerScroll != null) __obj.updateDynamic("slidesPerScroll")(slidesPerScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(stopAutoPlayOnHover)) __obj.updateDynamic("stopAutoPlayOnHover")(stopAutoPlayOnHover.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.brainhubeuReactCarousel.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CarouselProps
}

