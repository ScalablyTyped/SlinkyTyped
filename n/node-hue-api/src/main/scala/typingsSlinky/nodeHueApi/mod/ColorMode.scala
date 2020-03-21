package typingsSlinky.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeHueApi.nodeHueApiStrings.xy
  - typingsSlinky.nodeHueApi.nodeHueApiStrings.ct
  - typingsSlinky.nodeHueApi.nodeHueApiStrings.hs
*/
trait ColorMode extends js.Object

object ColorMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ct: typingsSlinky.nodeHueApi.nodeHueApiStrings.ct = this.cast("ct")
  @scala.inline
  def hs: typingsSlinky.nodeHueApi.nodeHueApiStrings.hs = this.cast("hs")
  @scala.inline
  def xy: typingsSlinky.nodeHueApi.nodeHueApiStrings.xy = this.cast("xy")
}

