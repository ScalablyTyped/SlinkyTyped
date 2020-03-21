package typingsSlinky.newrelic.mod

import typingsSlinky.newrelic.AnonModuleName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instrument_ extends js.Object {
  def apply(moduleName: String, onRequire: js.Function0[Unit]): Unit = js.native
  def apply(moduleName: String, onRequire: js.Function0[Unit], onError: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def apply(opts: AnonModuleName): Unit = js.native
}

