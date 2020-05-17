package typingsSlinky.papaparse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The possible values for the ParseConfig property delimitersToGuess
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.papaparse.papaparseStrings.Comma
  - typingsSlinky.papaparse.papaparseStrings.Charactertabulation
  - typingsSlinky.papaparse.papaparseStrings.Verticalline
  - typingsSlinky.papaparse.papaparseStrings.Semicolon
  - typingsSlinky.papaparse.mod.RECORD_SEP_TYPE
  - typingsSlinky.papaparse.mod.UNIT_SEP_TYPE
*/
trait GuessableDelimiters extends js.Object

object GuessableDelimiters {
  @scala.inline
  def Comma: typingsSlinky.papaparse.papaparseStrings.Comma = ",".asInstanceOf[typingsSlinky.papaparse.papaparseStrings.Comma]
  @scala.inline
  def Charactertabulation: typingsSlinky.papaparse.papaparseStrings.Charactertabulation = "\t".asInstanceOf[typingsSlinky.papaparse.papaparseStrings.Charactertabulation]
  @scala.inline
  def Verticalline: typingsSlinky.papaparse.papaparseStrings.Verticalline = "|".asInstanceOf[typingsSlinky.papaparse.papaparseStrings.Verticalline]
  @scala.inline
  def Semicolon: typingsSlinky.papaparse.papaparseStrings.Semicolon = ";".asInstanceOf[typingsSlinky.papaparse.papaparseStrings.Semicolon]
  @scala.inline
  implicit def apply(value: RECORD_SEP_TYPE): GuessableDelimiters = value.asInstanceOf[GuessableDelimiters]
  @scala.inline
  implicit def apply(value: UNIT_SEP_TYPE): GuessableDelimiters = value.asInstanceOf[GuessableDelimiters]
}

