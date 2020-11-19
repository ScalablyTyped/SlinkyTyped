package typingsSlinky.antDesignReactNative.flexPropsTypeMod

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`column-reverse`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`row-reverse`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`wrap-reverse`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.around
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.baseline
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.between
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.center
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.column
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.end
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.nowrap
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.row
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.start
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.stretch
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexPropsType extends js.Object {
  
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var justify: js.UndefOr[start | end | center | between | around] = js.native
  
  var wrap: js.UndefOr[
    nowrap | typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.wrap | `wrap-reverse`
  ] = js.native
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
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
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
