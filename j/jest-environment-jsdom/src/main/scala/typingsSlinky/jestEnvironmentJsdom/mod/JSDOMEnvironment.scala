package typingsSlinky.jestEnvironmentJsdom.mod

import typingsSlinky.jestEnvironment.mod.JestEnvironment
import typingsSlinky.jestEnvironmentJsdom.anon.EventerrorError
import typingsSlinky.jestFakeTimers.mod.JestFakeTimers
import typingsSlinky.jsdom.mod.JSDOM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSDOMEnvironment extends JestEnvironment {
  var dom: JSDOM | Null = js.native
  var errorEventListener: (js.Function1[/* event */ EventerrorError, Unit]) | Null = js.native
  @JSName("fakeTimers")
  var fakeTimers_JSDOMEnvironment: JestFakeTimers[Double] | Null = js.native
  @JSName("global")
  var global_JSDOMEnvironment: Win = js.native
}

