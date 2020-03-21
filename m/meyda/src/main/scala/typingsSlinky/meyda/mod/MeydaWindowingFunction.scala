package typingsSlinky.meyda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.meyda.meydaStrings.blackman
  - typingsSlinky.meyda.meydaStrings.sine
  - typingsSlinky.meyda.meydaStrings.hanning
  - typingsSlinky.meyda.meydaStrings.hamming
*/
trait MeydaWindowingFunction extends js.Object

object MeydaWindowingFunction {
  @scala.inline
  def blackman: typingsSlinky.meyda.meydaStrings.blackman = this.cast("blackman")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hamming: typingsSlinky.meyda.meydaStrings.hamming = this.cast("hamming")
  @scala.inline
  def hanning: typingsSlinky.meyda.meydaStrings.hanning = this.cast("hanning")
  @scala.inline
  def sine: typingsSlinky.meyda.meydaStrings.sine = this.cast("sine")
}

