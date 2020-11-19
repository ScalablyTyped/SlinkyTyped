package typingsSlinky.reactAriaMenubutton.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonProps[T /* <: HTMLElement */]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  
  /**
    * The HTML tag for this element. Default: 'span'.
    */
  var tag: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any
  ] = js.native
}
object ButtonProps {
  
  @scala.inline
  def apply[T /* <: HTMLElement */](): ButtonProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps[T]]
  }
  
  @scala.inline
  implicit class ButtonPropsOps[Self <: ButtonProps[_], T /* <: HTMLElement */] (val x: Self with ButtonProps[T]) extends AnyVal {
    
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
    def setTag(value: /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
