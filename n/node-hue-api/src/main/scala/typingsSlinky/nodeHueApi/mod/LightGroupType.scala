package typingsSlinky.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeHueApi.nodeHueApiStrings.LightGroup
  - typingsSlinky.nodeHueApi.nodeHueApiStrings.Room
  - typingsSlinky.nodeHueApi.nodeHueApiStrings.Luminaire
  - typingsSlinky.nodeHueApi.nodeHueApiStrings.LightSource
*/
trait LightGroupType extends js.Object

object LightGroupType {
  @scala.inline
  def LightGroup: typingsSlinky.nodeHueApi.nodeHueApiStrings.LightGroup = this.cast("LightGroup")
  @scala.inline
  def LightSource: typingsSlinky.nodeHueApi.nodeHueApiStrings.LightSource = this.cast("LightSource")
  @scala.inline
  def Luminaire: typingsSlinky.nodeHueApi.nodeHueApiStrings.Luminaire = this.cast("Luminaire")
  @scala.inline
  def Room: typingsSlinky.nodeHueApi.nodeHueApiStrings.Room = this.cast("Room")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

