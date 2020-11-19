package typingsSlinky.reactDiv100vh.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Div100vhProps
  extends HTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  
  var as: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
}
object Div100vhProps {
  
  @scala.inline
  def apply(): Div100vhProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Div100vhProps]
  }
  
  @scala.inline
  implicit class Div100vhPropsOps[Self <: Div100vhProps] (val x: Self) extends AnyVal {
    
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
    def setAs(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
  }
}
