package typingsSlinky.reactConfirm

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-confirm", "confirmable")
  @js.native
  def confirmable[P](component: ReactComponentClass[ReactConfirmProps with P]): ReactComponentClass[P] = js.native
  
  @JSImport("react-confirm", "createConfirmation")
  @js.native
  def createConfirmation(component: ReactComponentClass[_]): js.Function1[/* props */ js.Any, js.Promise[String]] = js.native
  @JSImport("react-confirm", "createConfirmation")
  @js.native
  def createConfirmation(component: ReactComponentClass[_], unmountDelay: Double): js.Function1[/* props */ js.Any, js.Promise[String]] = js.native
  
  @js.native
  trait ReactConfirmProps extends StObject {
    
    def cancel(): Unit = js.native
    def cancel(value: String): Unit = js.native
    
    var confirmation: String | ReactElement = js.native
    
    def dismiss(): Unit = js.native
    
    def proceed(): Unit = js.native
    def proceed(value: String): Unit = js.native
    
    var show: Boolean = js.native
  }
}
