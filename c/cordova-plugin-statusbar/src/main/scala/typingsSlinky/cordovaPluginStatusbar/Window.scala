package typingsSlinky.cordovaPluginStatusbar

import typingsSlinky.cordovaPluginStatusbar.cordovaPluginStatusbarStrings.statusTap
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var StatusBar: typingsSlinky.cordovaPluginStatusbar.StatusBar = js.native
  @JSName("addEventListener")
  def addEventListener_statusTap(`type`: statusTap, listener: js.Function1[/* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusTap(`type`: statusTap, listener: js.Function1[/* ev */ Event_, _], useCapture: Boolean): Unit = js.native
}

