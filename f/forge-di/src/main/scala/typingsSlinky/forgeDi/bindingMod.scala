package typingsSlinky.forgeDi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.forgeDi.constructorMod.Constructor
import typingsSlinky.forgeDi.lifecycleMod.Lifecycle
import typingsSlinky.forgeDi.predicateMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingMod {
  
  @JSImport("forge-di/dist/framework/Binding", JSImport.Default)
  @js.native
  class default protected () extends Binding {
    def this(forge: typingsSlinky.forgeDi.forgeMod.default, name: String) = this()
  }
  
  @js.native
  trait Binding extends StObject {
    
    var arguments: StringDictionary[js.Any] = js.native
    
    val as: this.type = js.native
    
    var forge: typingsSlinky.forgeDi.forgeMod.default = js.native
    
    def function(target: js.Function): this.type = js.native
    
    def instance(target: js.Any): this.type = js.native
    
    var lifecycle: Lifecycle = js.native
    
    def matches(hint: js.Any): Boolean = js.native
    
    var name: String = js.native
    
    def predicate(hint: js.Any): Boolean = js.native
    @JSName("predicate")
    var predicate_Original: Predicate = js.native
    
    def resolve(context: js.Any, hint: js.Any): js.Any = js.native
    def resolve(context: js.Any, hint: js.Any, args: js.Object): js.Any = js.native
    
    var resolver: typingsSlinky.forgeDi.resolverMod.default = js.native
    
    def singleton(): this.type = js.native
    
    val to: this.type = js.native
    
    def transient(): this.type = js.native
    
    def `type`(target: Constructor): this.type = js.native
    
    def when(condition: js.Any): this.type = js.native
    def when(condition: Predicate): this.type = js.native
    
    def `with`(args: js.Any): this.type = js.native
  }
}
