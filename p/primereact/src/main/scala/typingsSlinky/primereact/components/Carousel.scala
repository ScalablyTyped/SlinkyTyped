package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.Anon_Page
import typingsSlinky.primereact.componentsCarouselCarouselMod.CarouselProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Carousel
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.carouselMod.Carousel] {
  @JSImport("primereact/carousel", "Carousel")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    autoplayInterval: Int | Double = null,
    circular: js.UndefOr[Boolean] = js.undefined,
    containerClassName: String = null,
    contentClassName: String = null,
    dotsContainerClassName: String = null,
    footer: js.Any = null,
    header: js.Any = null,
    itemTemplate: js.Any = null,
    numScroll: Int | Double = null,
    numVisible: Int | Double = null,
    onPageChange: /* e */ Anon_Page => Unit = null,
    orientation: String = null,
    page: Int | Double = null,
    responsiveOptions: js.Any = null,
    style: js.Object = null,
    value: js.Any = null,
    verticalViewPortHeight: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.carouselMod.Carousel] = {
    val __obj = js.Dynamic.literal()
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (dotsContainerClassName != null) __obj.updateDynamic("dotsContainerClassName")(dotsContainerClassName.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (numScroll != null) __obj.updateDynamic("numScroll")(numScroll.asInstanceOf[js.Any])
    if (numVisible != null) __obj.updateDynamic("numVisible")(numVisible.asInstanceOf[js.Any])
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (responsiveOptions != null) __obj.updateDynamic("responsiveOptions")(responsiveOptions.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (verticalViewPortHeight != null) __obj.updateDynamic("verticalViewPortHeight")(verticalViewPortHeight.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.carouselMod.Carousel] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.carouselMod.Carousel](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CarouselProps
}

