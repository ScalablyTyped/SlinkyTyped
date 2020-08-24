package typingsSlinky.jestEnvironmentPuppeteer.mod

import typingsSlinky.jestEnvironment.mod.JestEnvironment
import typingsSlinky.jestFakeTimers.mod.JestFakeTimers
import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.circusMod.State
import typingsSlinky.node.vmMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Note: TestEnvironment is sandboxed. Each test suite will trigger setup/teardown in their own TestEnvironment. */
@js.native
trait PuppeteerEnvironment extends JestEnvironment {
  var context: Context | Null = js.native
  @JSName("fakeTimers")
  var fakeTimers_PuppeteerEnvironment: JestFakeTimers[Timer] | Null = js.native
  @JSName("global")
  var global_PuppeteerEnvironment: Global_ = js.native
  @JSName("handleTestEvent")
  var handleTestEvent_PuppeteerEnvironment: js.UndefOr[js.Function2[/* event */ Event, /* state */ State, Unit]] = js.native
}

