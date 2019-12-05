package typingsSlinky.jestDashEnvironmentDashNode.jestDashEnvironmentDashNodeMod

import typingsSlinky.atJestEnvironment.atJestEnvironmentMod.JestEnvironment
import typingsSlinky.atJestFakeDashTimers.atJestFakeDashTimersMod.JestFakeTimers
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

