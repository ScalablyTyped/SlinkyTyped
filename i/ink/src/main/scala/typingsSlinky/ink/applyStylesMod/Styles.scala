package typingsSlinky.ink.applyStylesMod

import typingsSlinky.ink.inkStrings.`column-reverse`
import typingsSlinky.ink.inkStrings.`flex-end`
import typingsSlinky.ink.inkStrings.`flex-start`
import typingsSlinky.ink.inkStrings.`row-reverse`
import typingsSlinky.ink.inkStrings.`space-around`
import typingsSlinky.ink.inkStrings.`space-between`
import typingsSlinky.ink.inkStrings.`truncate-end`
import typingsSlinky.ink.inkStrings.`truncate-middle`
import typingsSlinky.ink.inkStrings.`truncate-start`
import typingsSlinky.ink.inkStrings.absolute
import typingsSlinky.ink.inkStrings.center
import typingsSlinky.ink.inkStrings.column
import typingsSlinky.ink.inkStrings.end
import typingsSlinky.ink.inkStrings.flex
import typingsSlinky.ink.inkStrings.middle
import typingsSlinky.ink.inkStrings.none
import typingsSlinky.ink.inkStrings.relative
import typingsSlinky.ink.inkStrings.row
import typingsSlinky.ink.inkStrings.stretch
import typingsSlinky.ink.inkStrings.truncate
import typingsSlinky.ink.inkStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Styles extends js.Object {
  
  var alignItems: js.UndefOr[`flex-start` | center | `flex-end` | stretch] = js.native
  
  var display: js.UndefOr[flex | none] = js.native
  
  var flexBasis: js.UndefOr[Double | String] = js.native
  
  var flexDirection: js.UndefOr[row | column | `row-reverse` | `column-reverse`] = js.native
  
  var flexGrow: js.UndefOr[Double] = js.native
  
  var flexShrink: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var justifyContent: js.UndefOr[`flex-start` | `flex-end` | `space-between` | `space-around` | center] = js.native
  
  var marginBottom: js.UndefOr[Double] = js.native
  
  var marginLeft: js.UndefOr[Double] = js.native
  
  var marginRight: js.UndefOr[Double] = js.native
  
  var marginTop: js.UndefOr[Double] = js.native
  
  var minHeight: js.UndefOr[Double | String] = js.native
  
  var minWidth: js.UndefOr[Double | String] = js.native
  
  var paddingBottom: js.UndefOr[Double] = js.native
  
  var paddingLeft: js.UndefOr[Double] = js.native
  
  var paddingRight: js.UndefOr[Double] = js.native
  
  var paddingTop: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[absolute | relative] = js.native
  
  var textWrap: js.UndefOr[
    wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`
  ] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object Styles {
  
  @scala.inline
  def apply(): Styles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Styles]
  }
  
  @scala.inline
  implicit class StylesOps[Self <: Styles] (val x: Self) extends AnyVal {
    
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
    def setMinHeight(value: Double | String): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double | String): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
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
    def setPosition(value: absolute | relative): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTextWrap(value: wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`): Self = this.set("textWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextWrap: Self = this.set("textWrap", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
