package typingsSlinky.openpgp.mod.packet

import typingsSlinky.openpgp.mod.ReadableStream
import typingsSlinky.openpgp.openpgpStrings.binary
import typingsSlinky.openpgp.openpgpStrings.mime
import typingsSlinky.openpgp.openpgpStrings.text
import typingsSlinky.openpgp.openpgpStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "packet.Literal")
@js.native
class Literal protected () extends js.Object {
  /**
    * Implementation of the Literal Data Packet (Tag 11)
    * {@link https://tools.ietf.org/html/rfc4880#section-5.9|RFC4880 5.9}:
    * A Literal Data packet contains the body of a message; data that is not to be
    * further interpreted.
    * @param date the creation date of the literal package
    */
  def this(date: js.Date) = this()
  /**
    * Get the byte sequence representing the literal packet data
    * @param clone (optional) Whether to return a clone so that getBytes/getText can be called again
    * @returns A sequence of bytes
    */
  def getBytes(clone: Boolean): js.typedarray.Uint8Array | ReadableStream[js.typedarray.Uint8Array] = js.native
  /**
    * Get the filename of the literal packet data
    * @returns filename
    */
  def getFilename(): String = js.native
  /**
    * Returns literal data packets as native JavaScript string
    * with normalized end of line to \n
    * @param clone (optional) Whether to return a clone so that getBytes/getText can be called again
    * @returns literal data as text
    */
  def getText(clone: Boolean): String | ReadableStream[String] = js.native
  def read(input: ReadableStream[js.typedarray.Uint8Array]): Literal = js.native
  /**
    * Parsing function for a literal data packet (tag 11).
    * @param input Payload of a tag 11 packet
    * @returns object representation
    */
  def read(input: js.typedarray.Uint8Array): Literal = js.native
  @JSName("setBytes")
  def setBytes_binary(bytes: ReadableStream[js.typedarray.Uint8Array], format: binary): Unit = js.native
  @JSName("setBytes")
  def setBytes_binary(bytes: js.typedarray.Uint8Array, format: binary): Unit = js.native
  @JSName("setBytes")
  def setBytes_mime(bytes: ReadableStream[js.typedarray.Uint8Array], format: mime): Unit = js.native
  @JSName("setBytes")
  def setBytes_mime(bytes: js.typedarray.Uint8Array, format: mime): Unit = js.native
  @JSName("setBytes")
  def setBytes_text(bytes: ReadableStream[js.typedarray.Uint8Array], format: text): Unit = js.native
  @JSName("setBytes")
  def setBytes_text(bytes: js.typedarray.Uint8Array, format: text): Unit = js.native
  @JSName("setBytes")
  def setBytes_utf8(bytes: ReadableStream[js.typedarray.Uint8Array], format: utf8): Unit = js.native
  /**
    * Set the packet data to value represented by the provided string of bytes.
    * @param bytes The string of bytes
    * @param format The format of the string of bytes
    */
  @JSName("setBytes")
  def setBytes_utf8(bytes: js.typedarray.Uint8Array, format: utf8): Unit = js.native
  /**
    * Sets the filename of the literal packet data
    * @param filename Any native javascript string
    */
  def setFilename(filename: String): Unit = js.native
  /**
    * Set the packet data to a javascript native string, end of line
    * will be normalized to \r\n and by default text is converted to UTF8
    * @param text Any native javascript string
    * @param format (optional) The format of the string of bytes
    */
  def setText(text: String): Unit = js.native
  def setText(text: ReadableStream[String]): Unit = js.native
  @JSName("setText")
  def setText_binary(text: String, format: binary): Unit = js.native
  @JSName("setText")
  def setText_binary(text: ReadableStream[String], format: binary): Unit = js.native
  @JSName("setText")
  def setText_mime(text: String, format: mime): Unit = js.native
  @JSName("setText")
  def setText_mime(text: ReadableStream[String], format: mime): Unit = js.native
  @JSName("setText")
  def setText_text(text: String, format: text): Unit = js.native
  @JSName("setText")
  def setText_text(text: ReadableStream[String], format: text): Unit = js.native
  @JSName("setText")
  def setText_utf8(text: String, format: utf8): Unit = js.native
  @JSName("setText")
  def setText_utf8(text: ReadableStream[String], format: utf8): Unit = js.native
  /**
    * Creates a string representation of the packet
    * @returns Uint8Array representation of the packet
    */
  def write(): js.typedarray.Uint8Array | ReadableStream[js.typedarray.Uint8Array] = js.native
}

