package typingsSlinky.reactAriaMenubutton.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactAriaMenubutton.anon.IsOpen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuProps[T /* <: HTMLElement */]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  
  @JSName("children")
  var children_MenuProps: ReactElement | (js.Function1[/* hasIsOpen */ IsOpen, ReactElement]) = js.native
  
  /**
    * The HTML tag for this element. Default: 'span'.
    */
  var tag: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any
  ] = js.native
}
object MenuProps {
  
  @scala.inline
  def apply[T /* <: HTMLElement */](children: ReactElement | (js.Function1[/* hasIsOpen */ IsOpen, ReactElement])): MenuProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps[T]]
  }
  
  @scala.inline
  implicit class MenuPropsOps[Self <: MenuProps[_], T /* <: HTMLElement */] (val x: Self with MenuProps[T]) extends AnyVal {
    
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
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* hasIsOpen */ IsOpen => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: ReactElement | (js.Function1[/* hasIsOpen */ IsOpen, ReactElement])): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
