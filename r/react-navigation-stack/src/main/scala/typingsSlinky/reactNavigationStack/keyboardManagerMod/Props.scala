package typingsSlinky.reactNavigationStack.keyboardManagerMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNavigationStack.anon.OnPageChangeCancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  def children(props: OnPageChangeCancel): ReactElement = js.native
  
  var enabled: Boolean = js.native
}
object Props {
  
  @scala.inline
  def apply(children: OnPageChangeCancel => ReactElement, enabled: Boolean): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), enabled = enabled.asInstanceOf[js.Any])
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
    def setChildren(value: OnPageChangeCancel => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
  }
}
