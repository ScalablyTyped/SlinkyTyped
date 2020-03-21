package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.knex.knexStrings.Equalssign
  - typingsSlinky.knex.knexStrings.Greaterthansign
  - typingsSlinky.knex.knexStrings.GreaterthansignEqualssign
  - typingsSlinky.knex.knexStrings.Lessthansign
  - typingsSlinky.knex.knexStrings.LessthansignEqualssign
  - typingsSlinky.knex.knexStrings.LessthansignGreaterthansign
*/
trait ComparisionOperator extends js.Object

object ComparisionOperator {
  @scala.inline
  def Equalssign: typingsSlinky.knex.knexStrings.Equalssign = this.cast("=")
  @scala.inline
  def Greaterthansign: typingsSlinky.knex.knexStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsSlinky.knex.knexStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsSlinky.knex.knexStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsSlinky.knex.knexStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  def LessthansignGreaterthansign: typingsSlinky.knex.knexStrings.LessthansignGreaterthansign = this.cast("<>")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

