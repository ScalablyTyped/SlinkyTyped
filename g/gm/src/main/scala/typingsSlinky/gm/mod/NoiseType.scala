package typingsSlinky.gm.mod

import typingsSlinky.gm.gmStrings.gaussian_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gm.gmStrings.uniform
  - typingsSlinky.gm.gmStrings.gaussian_
  - typingsSlinky.gm.gmStrings.multiplicative
  - typingsSlinky.gm.gmStrings.impulse
  - typingsSlinky.gm.gmStrings.laplacian
  - typingsSlinky.gm.gmStrings.poisson
*/
trait NoiseType extends js.Object

object NoiseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gaussian: gaussian_ = this.cast("gaussian")
  @scala.inline
  def impulse: typingsSlinky.gm.gmStrings.impulse = this.cast("impulse")
  @scala.inline
  def laplacian: typingsSlinky.gm.gmStrings.laplacian = this.cast("laplacian")
  @scala.inline
  def multiplicative: typingsSlinky.gm.gmStrings.multiplicative = this.cast("multiplicative")
  @scala.inline
  def poisson: typingsSlinky.gm.gmStrings.poisson = this.cast("poisson")
  @scala.inline
  def uniform: typingsSlinky.gm.gmStrings.uniform = this.cast("uniform")
}

