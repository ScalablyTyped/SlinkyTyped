package typingsSlinky.ink.boxMod

import typingsSlinky.ink.inkStrings.`column-reverse`
import typingsSlinky.ink.inkStrings.`flex-end`
import typingsSlinky.ink.inkStrings.`flex-start`
import typingsSlinky.ink.inkStrings.`row-reverse`
import typingsSlinky.ink.inkStrings.`space-around`
import typingsSlinky.ink.inkStrings.`space-between`
import typingsSlinky.ink.inkStrings.absolute
import typingsSlinky.ink.inkStrings.auto
import typingsSlinky.ink.inkStrings.bold
import typingsSlinky.ink.inkStrings.center
import typingsSlinky.ink.inkStrings.classic
import typingsSlinky.ink.inkStrings.column
import typingsSlinky.ink.inkStrings.double
import typingsSlinky.ink.inkStrings.doubleSingle
import typingsSlinky.ink.inkStrings.flex
import typingsSlinky.ink.inkStrings.none
import typingsSlinky.ink.inkStrings.relative
import typingsSlinky.ink.inkStrings.round
import typingsSlinky.ink.inkStrings.row
import typingsSlinky.ink.inkStrings.single
import typingsSlinky.ink.inkStrings.singleDouble
import typingsSlinky.ink.inkStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined type-fest.type-fest.Except<ink.ink/build/styles.Styles, 'textWrap'> & { readonly margin :number | undefined,  readonly marginX :number | undefined,  readonly marginY :number | undefined,  readonly padding :number | undefined,  readonly paddingX :number | undefined,  readonly paddingY :number | undefined} */
@js.native
trait Props extends js.Object {
  
  var alignItems: js.UndefOr[`flex-start` | center | `flex-end` | stretch] = js.native
  
  var alignSelf: js.UndefOr[`flex-start` | center | `flex-end` | auto] = js.native
  
  var borderColor: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ js.Any
  ] = js.native
  
  var borderStyle: js.UndefOr[single | double | round | bold | singleDouble | doubleSingle | classic] = js.native
  
  var display: js.UndefOr[flex | none] = js.native
  
  var flexBasis: js.UndefOr[Double | String] = js.native
  
  var flexDirection: js.UndefOr[row | column | `row-reverse` | `column-reverse`] = js.native
  
  var flexGrow: js.UndefOr[Double] = js.native
  
  var flexShrink: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var justifyContent: js.UndefOr[`flex-start` | `flex-end` | `space-between` | `space-around` | center] = js.native
  
  /**
    * Margin on all sides. Equivalent to setting `marginTop`, `marginBottom`, `marginLeft` and `marginRight`.
    *
    * @default 0
    */
  val margin: js.UndefOr[Double] = js.native
  
  var marginBottom: js.UndefOr[Double] = js.native
  
  var marginLeft: js.UndefOr[Double] = js.native
  
  var marginRight: js.UndefOr[Double] = js.native
  
  var marginTop: js.UndefOr[Double] = js.native
  
  /**
    * Horizontal margin. Equivalent to setting `marginLeft` and `marginRight`.
    *
    * @default 0
    */
  val marginX: js.UndefOr[Double] = js.native
  
  /**
    * Vertical margin. Equivalent to setting `marginTop` and `marginBottom`.
    *
    * @default 0
    */
  val marginY: js.UndefOr[Double] = js.native
  
  var minHeight: js.UndefOr[Double | String] = js.native
  
  var minWidth: js.UndefOr[Double | String] = js.native
  
  /**
    * Padding on all sides. Equivalent to setting `paddingTop`, `paddingBottom`, `paddingLeft` and `paddingRight`.
    *
    * @default 0
    */
  val padding: js.UndefOr[Double] = js.native
  
  var paddingBottom: js.UndefOr[Double] = js.native
  
  var paddingLeft: js.UndefOr[Double] = js.native
  
  var paddingRight: js.UndefOr[Double] = js.native
  
  var paddingTop: js.UndefOr[Double] = js.native
  
  /**
    * Horizontal padding. Equivalent to setting `paddingLeft` and `paddingRight`.
    *
    * @default 0
    */
  val paddingX: js.UndefOr[Double] = js.native
  
  /**
    * Vertical padding. Equivalent to setting `paddingTop` and `paddingBottom`.
    *
    * @default 0
    */
  val paddingY: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[absolute | relative] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlignItems(value: `flex-start` | center | `flex-end` | stretch): Self = this.set("alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignItems: Self = this.set("alignItems", js.undefined)
    
    @scala.inline
    def setAlignSelf(value: `flex-start` | center | `flex-end` | auto): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    
    @scala.inline
    def setBorderColor(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ js.Any
    ): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderStyle(value: single | double | round | bold | singleDouble | doubleSingle | classic): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderStyle: Self = this.set("borderStyle", js.undefined)
    
    @scala.inline
    def setDisplay(value: flex | none): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setFlexBasis(value: Double | String): Self = this.set("flexBasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexBasis: Self = this.set("flexBasis", js.undefined)
    
    @scala.inline
    def setFlexDirection(value: row | column | `row-reverse` | `column-reverse`): Self = this.set("flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexDirection: Self = this.set("flexDirection", js.undefined)
    
    @scala.inline
    def setFlexGrow(value: Double): Self = this.set("flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexGrow: Self = this.set("flexGrow", js.undefined)
    
    @scala.inline
    def setFlexShrink(value: Double): Self = this.set("flexShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexShrink: Self = this.set("flexShrink", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setJustifyContent(value: `flex-start` | `flex-end` | `space-between` | `space-around` | center): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustifyContent: Self = this.set("justifyContent", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMarginBottom(value: Double): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: Double): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    
    @scala.inline
    def setMarginX(value: Double): Self = this.set("marginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginX: Self = this.set("marginX", js.undefined)
    
    @scala.inline
    def setMarginY(value: Double): Self = this.set("marginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginY: Self = this.set("marginY", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double | String): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double | String): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPaddingBottom(value: Double): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    
    @scala.inline
    def setPaddingLeft(value: Double): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    
    @scala.inline
    def setPaddingRight(value: Double): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    
    @scala.inline
    def setPaddingTop(value: Double): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingTop: Self = this.set("paddingTop", js.undefined)
    
    @scala.inline
    def setPaddingX(value: Double): Self = this.set("paddingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingX: Self = this.set("paddingX", js.undefined)
    
    @scala.inline
    def setPaddingY(value: Double): Self = this.set("paddingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingY: Self = this.set("paddingY", js.undefined)
    
    @scala.inline
    def setPosition(value: absolute | relative): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
