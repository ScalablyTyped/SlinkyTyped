package typingsSlinky.interpret

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.interpret.anon.Dictkey
import typingsSlinky.interpret.anon.Extensions
import typingsSlinky.node.NodeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("interpret", "extensions")
  @js.native
  val extensions: Extensions_ = js.native
  
  @JSImport("interpret", "jsVariants")
  @js.native
  val jsVariants: Extensions_ = js.native
  
  type Extension = String | ExtensionDescriptor | (js.Array[String | ExtensionDescriptor])
  
  @js.native
  trait ExtensionDescriptor extends StObject {
    
    var module: String = js.native
    
    def register(hook: Hook): Unit = js.native
    @JSName("register")
    var register_Original: RegisterFn = js.native
  }
  
  type Extensions_ = StringDictionary[Extension | Null]
  
  @js.native
  trait Hook extends StObject {
    
    def apply(m: Extensions): js.Any = js.native
    def apply(m: NodeModule): js.Any = js.native
    
    def install(): Unit = js.native
    def install(m: Dictkey): Unit = js.native
  }
  
  type RegisterFn = js.Function1[/* hook */ Hook, Unit]
}
