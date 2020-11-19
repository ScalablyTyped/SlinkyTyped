package typingsSlinky.cordovaPluginStatusbar

import org.scalajs.dom.raw.Event
import typingsSlinky.cordovaPluginStatusbar.cordovaPluginStatusbarStrings.statusTap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  var StatusBar: typingsSlinky.cordovaPluginStatusbar.StatusBar = js.native
  
  @JSName("addEventListener")
  def addEventListener_statusTap(`type`: statusTap, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusTap(`type`: statusTap, listener: js.Function1[/* ev */ Event, _], useCapture: Boolean): Unit = js.native
}
