package typingsSlinky.glaze.ruleManagerMod

import typingsSlinky.glaze.styleInjectorMod.StyleInjector
import typingsSlinky.std.Map
import typingsSlinky.treat.typesMod.ClassRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("glaze/dist-types/RuleManager", "OptimizedRuleManager")
@js.native
class OptimizedRuleManager protected () extends RuleManager {
  def this(injector: StyleInjector, initialRuleIndexesByClassName: Map[ClassRef, Double]) = this()
  
  var injector: js.Any = js.native
  
  var ruleIndexesByClassName: js.Any = js.native
  
  var usageCountsByClassName: js.Any = js.native
}
