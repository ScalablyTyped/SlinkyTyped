package typingsSlinky.jestEnvironmentJsdom.mod

import typingsSlinky.jestEnvironment.mod.JestEnvironment
import typingsSlinky.jestEnvironmentJsdom.anon.EventerrorError
import typingsSlinky.node.vmMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSDOMEnvironment extends JestEnvironment {
  
  var dom: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSDOM */ js.Any) | Null = js.native
  
  var errorEventListener: (js.Function1[/* event */ EventerrorError, Unit]) | Null = js.native
  
  @JSName("getVmContext")
  def getVmContext_MJSDOMEnvironment(): Context | Null = js.native
  
  @JSName("global")
  var global_JSDOMEnvironment: Win = js.native
}
