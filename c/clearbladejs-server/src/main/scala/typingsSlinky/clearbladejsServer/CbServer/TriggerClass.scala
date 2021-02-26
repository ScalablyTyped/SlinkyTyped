package typingsSlinky.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerClass extends StObject {
  
  def Create(name: String, options: TriggerCreateOptions, callback: CbCallback): Unit = js.native
  
  def Fetch(name: String, callback: CbCallback): Unit = js.native
}
object TriggerClass {
  
  @scala.inline
  def apply(Create: (String, TriggerCreateOptions, CbCallback) => Unit, Fetch: (String, CbCallback) => Unit): TriggerClass = {
    val __obj = js.Dynamic.literal(Create = js.Any.fromFunction3(Create), Fetch = js.Any.fromFunction2(Fetch))
    __obj.asInstanceOf[TriggerClass]
  }
  
  @scala.inline
  implicit class TriggerClassMutableBuilder[Self <: TriggerClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (String, TriggerCreateOptions, CbCallback) => Unit): Self = StObject.set(x, "Create", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFetch(value: (String, CbCallback) => Unit): Self = StObject.set(x, "Fetch", js.Any.fromFunction2(value))
  }
}
