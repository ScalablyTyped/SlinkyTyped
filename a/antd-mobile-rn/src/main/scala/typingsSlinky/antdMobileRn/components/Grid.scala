package typingsSlinky.antdMobileRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.antdMobileRn.carouselIndexNativeMod.CarouselProps
import typingsSlinky.antdMobileRn.gridIndexNativeMod.GridProps
import typingsSlinky.antdMobileRn.gridPropsTypeMod.DataItem
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Grid
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antdMobileRn.mod.Grid] {
  @JSImport("antd-mobile-rn", "Grid")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    carouselMaxRow: Int | Double = null,
    carouselProps: CarouselProps = null,
    columnNum: Int | Double = null,
    data: js.Array[js.UndefOr[DataItem]] = null,
    hasLine: js.UndefOr[Boolean] = js.undefined,
    isCarousel: js.UndefOr[Boolean] = js.undefined,
    itemStyle: StyleProp[ViewStyle] = null,
    onClick: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Unit = null,
    renderItem: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => ReactElement = null,
    styles: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.Grid] = {
    val __obj = js.Dynamic.literal()
    if (carouselMaxRow != null) __obj.updateDynamic("carouselMaxRow")(carouselMaxRow.asInstanceOf[js.Any])
    if (carouselProps != null) __obj.updateDynamic("carouselProps")(carouselProps.asInstanceOf[js.Any])
    if (columnNum != null) __obj.updateDynamic("columnNum")(columnNum.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLine)) __obj.updateDynamic("hasLine")(hasLine.asInstanceOf[js.Any])
    if (!js.isUndefined(isCarousel)) __obj.updateDynamic("isCarousel")(isCarousel.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction2(renderItem))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.Grid] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antdMobileRn.mod.Grid](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = GridProps
}

