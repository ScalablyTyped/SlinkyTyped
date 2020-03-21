package typingsSlinky.officeUiFabricReact.shimmerGapTypesMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.std.HTMLElement
import typingsSlinky.uifabricMergeStyles.istyleMod.IRawStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerGapProps extends AllHTMLAttributes[HTMLElement] {
  /**
    * Use to set custom styling of the shimmerGap borders.
    * @deprecated Use `styles` prop to leverage mergeStyle API.
    */
  var borderStyle: js.UndefOr[IRawStyle] = js.undefined
  /**
    * Optional callback to access the IShimmerGap interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IShimmerGap]] = js.undefined
  /**
    * Sets the height of the gap.
    * @defaultvalue 16px
    */
  @JSName("height")
  var height_IShimmerGapProps: js.UndefOr[Double] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IShimmerGapStyleProps, IShimmerGapStyles]] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IShimmerGapProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    borderStyle: IRawStyle = null,
    componentRef: IRefObject[IShimmerGap] = null,
    height: Int | Double = null,
    styles: IStyleFunctionOrObject[IShimmerGapStyleProps, IShimmerGapStyles] = null,
    theme: ITheme = null
  ): IShimmerGapProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerGapProps]
  }
}

