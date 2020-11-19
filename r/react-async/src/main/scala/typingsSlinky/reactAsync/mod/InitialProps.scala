package typingsSlinky.reactAsync.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialProps[T] extends js.Object {
  
  var children: js.UndefOr[InitialChildren[T]] = js.native
  
  var persist: js.UndefOr[Boolean] = js.native
}
object InitialProps {
  
  @scala.inline
  def apply[T](): InitialProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialProps[T]]
  }
  
  @scala.inline
  implicit class InitialPropsOps[Self <: InitialProps[_], T] (val x: Self with InitialProps[T]) extends AnyVal {
    
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
    def setChildrenFunction1(value: /* state */ AsyncInitial[T, AbstractState[T]] => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: InitialChildren[T]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
  }
}
