package typingsSlinky.eslintPluginPrettier

import typingsSlinky.eslint.mod.Linter.Config
import typingsSlinky.eslint.mod.Rule.RuleModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eslint-plugin-prettier", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object configs extends js.Object {
    
    var recommended: Config = js.native
  }
  
  @js.native
  object rules extends js.Object {
    
    var prettier: RuleModule = js.native
  }
}
