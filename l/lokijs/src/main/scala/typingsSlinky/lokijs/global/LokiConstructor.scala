package typingsSlinky.lokijs.global

import typingsSlinky.lokijs.anon.PartialLokiConstructorOpt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LokiJS
  * A lightweight document oriented javascript database
  * @author Joe Minichino <joe.minichino@gmail.com>
  */
@JSGlobal("LokiConstructor")
@js.native
class LokiConstructor protected ()
  extends typingsSlinky.lokijs.Loki {
  def this(filename: String) = this()
  def this(filename: String, options: PartialLokiConstructorOpt) = this()
}
@JSGlobal("LokiConstructor")
@js.native
object LokiConstructor extends js.Object {
  
  var LokiOps: typingsSlinky.lokijs.LokiOps = js.native
  
  def aeq(prop1: js.Any, prop2: js.Any): Boolean = js.native
  
  def gt(prop1: js.Any, prop2: js.Any): Boolean = js.native
  def gt(prop1: js.Any, prop2: js.Any, equal: Boolean): Boolean = js.native
  
  def lt(prop1: js.Any, prop2: js.Any): Boolean = js.native
  def lt(prop1: js.Any, prop2: js.Any, equal: Boolean): Boolean = js.native
  
  @js.native
  class Collection[E /* <: js.Object */] ()
    extends typingsSlinky.lokijs.Collection[E]
  
  @js.native
  class KeyValueStore ()
    extends typingsSlinky.lokijs.KeyValueStore
  
  @js.native
  class LokiFsAdapter ()
    extends typingsSlinky.lokijs.LokiFsAdapter
  
  @js.native
  class LokiLocalStorageAdapter ()
    extends typingsSlinky.lokijs.LokiLocalStorageAdapter
  
  @js.native
  class LokiMemoryAdapter ()
    extends typingsSlinky.lokijs.LokiMemoryAdapter
  
  @js.native
  class LokiPartitioningAdapter ()
    extends typingsSlinky.lokijs.LokiPartitioningAdapter
  
  @js.native
  object persistenceAdapters extends js.Object {
    
    var fs: typingsSlinky.lokijs._LokiFsAdapter = js.native
    
    var localStorage: typingsSlinky.lokijs._LokiLocalStorageAdapter = js.native
  }
}
