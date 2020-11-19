package typingsSlinky.reactConfirm

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-confirm", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def confirmable[P](component: ReactComponentClass[ReactConfirmProps with P]): ReactComponentClass[P] = js.native
  
  def createConfirmation(component: ReactComponentClass[_]): js.Function1[/* props */ js.Any, js.Promise[String]] = js.native
  def createConfirmation(component: ReactComponentClass[_], unmountDelay: Double): js.Function1[/* props */ js.Any, js.Promise[String]] = js.native
  
  @js.native
  trait ReactConfirmProps extends js.Object {
    
    def cancel(): Unit = js.native
    def cancel(value: String): Unit = js.native
    
    var confirmation: String | ReactElement = js.native
    
    def dismiss(): Unit = js.native
    
    def proceed(): Unit = js.native
    def proceed(value: String): Unit = js.native
    
    var show: Boolean = js.native
  }
}
