package typingsSlinky.papaparse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // The possible values for the ParseConfig property delimitersToGuess
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.papaparse.papaparseStrings.Comma
    - typingsSlinky.papaparse.papaparseStrings.Charactertabulation
    - typingsSlinky.papaparse.papaparseStrings.Verticalline
    - typingsSlinky.papaparse.papaparseStrings.Semicolon
    - typingsSlinky.papaparse.mod.RECORD_SEP_TYPE
    - typingsSlinky.papaparse.mod.UNIT_SEP_TYPE
  */
  type GuessableDelimiters = typingsSlinky.papaparse.mod._GuessableDelimiters | typingsSlinky.papaparse.mod.RECORD_SEP_TYPE | typingsSlinky.papaparse.mod.UNIT_SEP_TYPE
  // When passed to Papa Parse a Readable stream is returned.
  type NODE_STREAM_INPUT_TYPE = typingsSlinky.papaparse.papaparseNumbers.`1`
  // The true delimiter. Invisible. ASCII code 30. Should be doing the job we strangely rely upon commas and tabs for.
  type RECORD_SEP_TYPE = typingsSlinky.papaparse.papaparseStrings.Informationseparatortwo
  // Also sometimes used as a delimiting character. ASCII code 31.
  type UNIT_SEP_TYPE = typingsSlinky.papaparse.papaparseStrings.Informationseparatorone
}
