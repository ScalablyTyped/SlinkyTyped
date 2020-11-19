package typingsSlinky.interpret

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.interpret.anon.Dictkey
import typingsSlinky.interpret.anon.Extensions
import typingsSlinky.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("interpret", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val extensions: Extensions_ = js.native
  
  val jsVariants: Extensions_ = js.native
  
  @js.native
  trait ExtensionDescriptor extends js.Object {
    
    var module: String = js.native
    
    def register(hook: Hook): Unit = js.native
    @JSName("register")
    var register_Original: RegisterFn = js.native
  }
  
  @js.native
  trait Hook extends js.Object {
    
    def apply(m: Extensions): js.Any = js.native
    def apply(m: NodeModule): js.Any = js.native
    
    def install(): Unit = js.native
    def install(m: Dictkey): Unit = js.native
  }
  
  type Extension = String | ExtensionDescriptor | (js.Array[String | ExtensionDescriptor])
  
  type Extensions_ = StringDictionary[Extension | Null]
  
  type RegisterFn = js.Function1[/* hook */ Hook, Unit]
}
