package typingsSlinky.polymerTs.global

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.polymerTs.polymer.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("polymer")
@js.native
object polymer extends js.Object {
  
  def createClass[T /* <: typingsSlinky.polymerTs.polymer.Base */](element: Instantiable1[/* args (repeated) */ js.Any, T]): Instantiable1[/* args (repeated) */ js.Any, T] = js.native
  
  def createDomModule(definition: Element): Unit = js.native
  
  def createElement[T /* <: typingsSlinky.polymerTs.polymer.Base */](element: Instantiable1[/* args (repeated) */ js.Any, T]): Instantiable1[/* args (repeated) */ js.Any, T] = js.native
  
  def createEs6PolymerBase(): Unit = js.native
  
  def isRegistered(element: Element): Boolean = js.native
  
  def prepareForRegistration(elementClass: js.Function): Element = js.native
  
  @js.native
  class Base ()
    extends typingsSlinky.polymerTs.polymer.Base
  /* static members */
  @js.native
  object Base extends js.Object {
    
    def create[T /* <: typingsSlinky.polymerTs.polymer.Base */](args: js.Any*): T = js.native
    
    def register(): Unit = js.native
  }
  
  @js.native
  class PolymerBase ()
    extends typingsSlinky.polymerTs.polymer.PolymerBase
}
