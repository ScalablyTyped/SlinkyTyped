package typingsSlinky.jestEnvironmentNode.mod

import typingsSlinky.jestEnvironment.mod.JestEnvironment
import typingsSlinky.node.vmMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeEnvironment extends JestEnvironment {
  var context: Context | Null = js.native
  @JSName("getVmContext")
  def getVmContext_MNodeEnvironment(): Context | Null = js.native
}

