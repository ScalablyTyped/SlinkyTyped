package typingsSlinky.cordovaDashPluginDashStatusbar

import org.scalajs.dom.raw.Event
import typingsSlinky.cordovaDashPluginDashStatusbar.cordovaDashPluginDashStatusbarStrings.statusTap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var StatusBar: typingsSlinky.cordovaDashPluginDashStatusbar.StatusBar = js.native
  @JSName("addEventListener")
  def addEventListener_statusTap(`type`: statusTap, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusTap(`type`: statusTap, listener: js.Function1[/* ev */ Event, _], useCapture: Boolean): Unit = js.native
}

