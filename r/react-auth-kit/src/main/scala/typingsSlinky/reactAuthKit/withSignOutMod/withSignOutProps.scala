package typingsSlinky.reactAuthKit.withSignOutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait withSignOutProps extends js.Object {
  
  def signOut(): Boolean = js.native
}
object withSignOutProps {
  
  @scala.inline
  def apply(signOut: () => Boolean): withSignOutProps = {
    val __obj = js.Dynamic.literal(signOut = js.Any.fromFunction0(signOut))
    __obj.asInstanceOf[withSignOutProps]
  }
  
  @scala.inline
  implicit class withSignOutPropsOps[Self <: withSignOutProps] (val x: Self) extends AnyVal {
    
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
    def setSignOut(value: () => Boolean): Self = this.set("signOut", js.Any.fromFunction0(value))
  }
}
