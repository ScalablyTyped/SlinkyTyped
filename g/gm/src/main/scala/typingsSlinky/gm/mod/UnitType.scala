package typingsSlinky.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gm.gmStrings.Undefined
  - typingsSlinky.gm.gmStrings.PixelsPerInch
  - typingsSlinky.gm.gmStrings.PixelsPerCentimeter
*/
trait UnitType extends js.Object

object UnitType {
  @scala.inline
  def PixelsPerCentimeter: typingsSlinky.gm.gmStrings.PixelsPerCentimeter = this.cast("PixelsPerCentimeter")
  @scala.inline
  def PixelsPerInch: typingsSlinky.gm.gmStrings.PixelsPerInch = this.cast("PixelsPerInch")
  @scala.inline
  def Undefined: typingsSlinky.gm.gmStrings.Undefined = this.cast("Undefined")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

