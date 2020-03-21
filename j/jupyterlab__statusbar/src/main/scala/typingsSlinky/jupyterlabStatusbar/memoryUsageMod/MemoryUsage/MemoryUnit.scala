package typingsSlinky.jupyterlabStatusbar.memoryUsageMod.MemoryUsage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The type of unit used for reporting memory usage.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.B
  - typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.KB
  - typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.MB
  - typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.GB
  - typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.TB
  - typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.PB
*/
trait MemoryUnit extends js.Object

object MemoryUnit {
  @scala.inline
  def B: typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.B = this.cast("B")
  @scala.inline
  def GB: typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.GB = this.cast("GB")
  @scala.inline
  def KB: typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.KB = this.cast("KB")
  @scala.inline
  def MB: typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.MB = this.cast("MB")
  @scala.inline
  def PB: typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.PB = this.cast("PB")
  @scala.inline
  def TB: typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.TB = this.cast("TB")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

