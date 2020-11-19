package typingsSlinky.reactAudioPlayer.mod

import org.scalajs.dom.raw.HTMLAudioElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactAudioPlayer
  extends Component[ReactAudioPlayerProps, js.Any, js.Any] {
  
  var audioEl: HTMLAudioElement = js.native
  
  def clearListenTrack(): Unit = js.native
  
  def setListenTrack(): Unit = js.native
  
  def updateVolume(volume: Double): Unit = js.native
}
