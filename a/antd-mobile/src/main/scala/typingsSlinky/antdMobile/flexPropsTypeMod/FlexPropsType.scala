package typingsSlinky.antdMobile.flexPropsTypeMod

import typingsSlinky.antdMobile.antdMobileStrings.`column-reverse`
import typingsSlinky.antdMobile.antdMobileStrings.`row-reverse`
import typingsSlinky.antdMobile.antdMobileStrings.`wrap-reverse`
import typingsSlinky.antdMobile.antdMobileStrings.around
import typingsSlinky.antdMobile.antdMobileStrings.baseline
import typingsSlinky.antdMobile.antdMobileStrings.between
import typingsSlinky.antdMobile.antdMobileStrings.center
import typingsSlinky.antdMobile.antdMobileStrings.column
import typingsSlinky.antdMobile.antdMobileStrings.end
import typingsSlinky.antdMobile.antdMobileStrings.nowrap
import typingsSlinky.antdMobile.antdMobileStrings.row
import typingsSlinky.antdMobile.antdMobileStrings.start
import typingsSlinky.antdMobile.antdMobileStrings.stretch
import typingsSlinky.antdMobile.antdMobileStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexPropsType extends js.Object {
  
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.native
  
  var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var justify: js.UndefOr[start | end | center | between | around] = js.native
  
  var wrap: js.UndefOr[nowrap | typingsSlinky.antdMobile.antdMobileStrings.wrap | `wrap-reverse`] = js.native
}
object FlexPropsType {
  
  @scala.inline
  def apply(): FlexPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexPropsType]
  }
  
  @scala.inline
  implicit class FlexPropsTypeOps[Self <: FlexPropsType] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: start | center | end | baseline | stretch): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setDirection(value: row | `row-reverse` | column | `column-reverse`): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setJustify(value: start | end | center | between | around): Self = this.set("justify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustify: Self = this.set("justify", js.undefined)
    
    @scala.inline
    def setWrap(value: nowrap | wrap | `wrap-reverse`): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
