package typingsSlinky.cassanknex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cassanknex.cassanknexStrings.Equalssign
  - typingsSlinky.cassanknex.cassanknexStrings.Lessthansign
  - typingsSlinky.cassanknex.cassanknexStrings.Greaterthansign
  - typingsSlinky.cassanknex.cassanknexStrings.LessthansignEqualssign
  - typingsSlinky.cassanknex.cassanknexStrings.GreaterthansignEqualssign
*/
trait ComparisonRestriction extends js.Object

object ComparisonRestriction {
  @scala.inline
  def Equalssign: typingsSlinky.cassanknex.cassanknexStrings.Equalssign = this.cast("=")
  @scala.inline
  def Greaterthansign: typingsSlinky.cassanknex.cassanknexStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsSlinky.cassanknex.cassanknexStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsSlinky.cassanknex.cassanknexStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsSlinky.cassanknex.cassanknexStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

