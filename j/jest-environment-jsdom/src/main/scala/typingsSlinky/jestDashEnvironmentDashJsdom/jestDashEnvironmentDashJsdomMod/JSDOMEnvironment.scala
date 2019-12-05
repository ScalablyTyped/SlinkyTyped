package typingsSlinky.jestDashEnvironmentDashJsdom.jestDashEnvironmentDashJsdomMod

import org.scalajs.dom.raw.Event
import typingsSlinky.atJestEnvironment.atJestEnvironmentMod.JestEnvironment
import typingsSlinky.atJestFakeDashTimers.atJestFakeDashTimersMod.JestFakeTimers
import typingsSlinky.jestDashEnvironmentDashJsdom.Anon_Error_1933525888
import typingsSlinky.jsdom.jsdomMod.JSDOM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSDOMEnvironment extends JestEnvironment {
  var dom: JSDOM | Null = js.native
  var errorEventListener: (js.Function1[/* event */ Event with Anon_Error_1933525888, Unit]) | Null = js.native
  @JSName("fakeTimers")
  var fakeTimers_JSDOMEnvironment: JestFakeTimers[Double] | Null = js.native
  @JSName("global")
  var global_JSDOMEnvironment: Win = js.native
}

