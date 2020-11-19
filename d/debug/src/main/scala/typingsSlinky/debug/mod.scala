package typingsSlinky.debug

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("debug", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(namespace: String): Debugger = js.native
  
  def coerce(`val`: js.Any): js.Any = js.native
  
  def debug(namespace: String): Debugger = js.native
  @JSName("debug")
  var debug_Original: Debug = js.native
  
  def default(namespace: String): Debugger = js.native
  @JSName("default")
  var default_Original: Debug = js.native
  
  def disable(): String = js.native
  
  def enable(namespaces: String): Unit = js.native
  
  def enabled(namespaces: String): Boolean = js.native
  
  var formatters: Formatters = js.native
  
  def log(args: js.Any*): js.Any = js.native
  
  var names: js.Array[js.RegExp] = js.native
  
  var skips: js.Array[js.RegExp] = js.native
  
  @js.native
  trait Debug extends js.Object {
    
    def apply(namespace: String): Debugger = js.native
    
    def coerce(`val`: js.Any): js.Any = js.native
    
    def disable(): String = js.native
    
    def enable(namespaces: String): Unit = js.native
    
    def enabled(namespaces: String): Boolean = js.native
    
    var formatters: Formatters = js.native
    
    def log(args: js.Any*): js.Any = js.native
    
    var names: js.Array[js.RegExp] = js.native
    
    var skips: js.Array[js.RegExp] = js.native
  }
  
  @js.native
  trait Debugger extends js.Object {
    
    def apply(formatter: js.Any, args: js.Any*): Unit = js.native
    
    var color: String = js.native
    
    def destroy(): Boolean = js.native
    
    var enabled: Boolean = js.native
    
    def extend(namespace: String): Debugger = js.native
    def extend(namespace: String, delimiter: String): Debugger = js.native
    
    def log(args: js.Any*): js.Any = js.native
    
    var namespace: String = js.native
  }
  
  type Formatters = StringDictionary[js.Function1[/* v */ js.Any, String]]
  
  type IDebug = Debug
  
  type IDebugger = Debugger
}
