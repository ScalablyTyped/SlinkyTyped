package typingsSlinky.neatDashCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object neatDashCsvMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.streamMod.Readable

  /** The CSV data to parse. */
  type Input = String | Buffer | Readable
  /** A representation of one row of the input CSV. */
  type Row = StringDictionary[String]
}
