package typingsSlinky.minecraftScriptingTypesServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServer extends StObject {
  
  def log(message: String): Unit = js.native
  
  def registerSystem[TSystem /* <: IServerSystem[TSystem] */](majorVersion: Double, minorVersion: Double): TSystem = js.native
}
object IServer {
  
  @scala.inline
  def apply(log: String => Unit, registerSystem: (Double, Double) => js.Any): IServer = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log), registerSystem = js.Any.fromFunction2(registerSystem))
    __obj.asInstanceOf[IServer]
  }
  
  @scala.inline
  implicit class IServerMutableBuilder[Self <: IServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterSystem(value: (Double, Double) => js.Any): Self = StObject.set(x, "registerSystem", js.Any.fromFunction2(value))
  }
}
