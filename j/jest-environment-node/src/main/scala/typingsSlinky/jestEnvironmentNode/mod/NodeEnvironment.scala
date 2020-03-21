package typingsSlinky.jestEnvironmentNode.mod

import typingsSlinky.jestEnvironment.mod.JestEnvironment
import typingsSlinky.jestFakeTimers.mod.JestFakeTimers
import typingsSlinky.node.vmMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeEnvironment extends JestEnvironment {
  var context: Context | Null = js.native
  @JSName("fakeTimers")
  var fakeTimers_NodeEnvironment: JestFakeTimers[Timer] | Null = js.native
}

