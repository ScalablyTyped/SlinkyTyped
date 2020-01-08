package typingsSlinky.forgeDashDi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.forgeDashDi.distFrameworkConstructorMod.Constructor
import typingsSlinky.forgeDashDi.distFrameworkPredicateMod.Predicate
import typingsSlinky.forgeDashDi.distLifecyclesLifecycleMod.Lifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/framework/Binding", JSImport.Namespace)
@js.native
object distFrameworkBindingMod extends js.Object {
  @js.native
  trait Binding extends js.Object {
    var arguments: StringDictionary[js.Any] = js.native
    val as: this.type = js.native
    var forge: typingsSlinky.forgeDashDi.distForgeMod.default = js.native
    var lifecycle: Lifecycle = js.native
    var name: String = js.native
    @JSName("predicate")
    var predicate_Original: Predicate = js.native
    var resolver: typingsSlinky.forgeDashDi.distResolversResolverMod.default = js.native
    val to: this.type = js.native
    def function(target: js.Function): this.type = js.native
    def instance(target: js.Any): this.type = js.native
    def matches(hint: js.Any): Boolean = js.native
    def predicate(hint: js.Any): Boolean = js.native
    def resolve(context: js.Any, hint: js.Any): js.Any = js.native
    def resolve(context: js.Any, hint: js.Any, args: js.Object): js.Any = js.native
    def singleton(): this.type = js.native
    def transient(): this.type = js.native
    def `type`(target: Constructor): this.type = js.native
    def when(condition: js.Any): this.type = js.native
    def when(condition: Predicate): this.type = js.native
    def `with`(args: js.Any): this.type = js.native
  }
  
  @js.native
  class default protected () extends Binding {
    def this(forge: typingsSlinky.forgeDashDi.distForgeMod.default, name: String) = this()
  }
  
}

