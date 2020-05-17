package typingsSlinky.csvStringify.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.csvStringify.csvStringifyStrings.auto
  - typingsSlinky.csvStringify.csvStringifyStrings.unix
  - typingsSlinky.csvStringify.csvStringifyStrings.mac
  - typingsSlinky.csvStringify.csvStringifyStrings.windows
  - typingsSlinky.csvStringify.csvStringifyStrings.ascii
  - typingsSlinky.csvStringify.csvStringifyStrings.unicode
*/
trait RecordDelimiter extends js.Object

object RecordDelimiter {
  @scala.inline
  def auto: typingsSlinky.csvStringify.csvStringifyStrings.auto = "auto".asInstanceOf[typingsSlinky.csvStringify.csvStringifyStrings.auto]
  @scala.inline
  def unix: typingsSlinky.csvStringify.csvStringifyStrings.unix = "unix".asInstanceOf[typingsSlinky.csvStringify.csvStringifyStrings.unix]
  @scala.inline
  def mac: typingsSlinky.csvStringify.csvStringifyStrings.mac = "mac".asInstanceOf[typingsSlinky.csvStringify.csvStringifyStrings.mac]
  @scala.inline
  def windows: typingsSlinky.csvStringify.csvStringifyStrings.windows = "windows".asInstanceOf[typingsSlinky.csvStringify.csvStringifyStrings.windows]
  @scala.inline
  def ascii: typingsSlinky.csvStringify.csvStringifyStrings.ascii = "ascii".asInstanceOf[typingsSlinky.csvStringify.csvStringifyStrings.ascii]
  @scala.inline
  def unicode: typingsSlinky.csvStringify.csvStringifyStrings.unicode = "unicode".asInstanceOf[typingsSlinky.csvStringify.csvStringifyStrings.unicode]
  @scala.inline
  implicit def apply(value: Buffer): RecordDelimiter = value.asInstanceOf[RecordDelimiter]
  @scala.inline
  implicit def apply(value: String): RecordDelimiter = value.asInstanceOf[RecordDelimiter]
}

