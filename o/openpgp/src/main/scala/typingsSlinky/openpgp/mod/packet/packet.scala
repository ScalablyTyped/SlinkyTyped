package typingsSlinky.openpgp.mod.packet

import typingsSlinky.openpgp.mod.Integer
import typingsSlinky.openpgp.mod.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "packet.packet")
@js.native
object packet extends js.Object {
  
  def read(input: ReadableStream[js.typedarray.Uint8Array], callback: js.Function): Boolean = js.native
  /**
    * Generic static Packet Parser function
    * @param input Input stream as string
    * @param callback Function to call with the parsed packet
    * @returns Returns false if the stream was empty and parsing is done, and true otherwise.
    */
  def read(input: js.typedarray.Uint8Array, callback: js.Function): Boolean = js.native
  
  /**
    * Whether the packet type supports partial lengths per RFC4880
    * @param tag_type Tag type
    * @returns String of the header
    */
  def supportsStreaming(tag_type: Integer): Boolean = js.native
  
  /**
    * Writes a packet header version 4 with the given tag_type and length to a
    * string
    * @param tag_type Tag type
    * @param length Length of the payload
    * @returns String of the header
    */
  def writeHeader(tag_type: Integer, length: Integer): String = js.native
  
  /**
    * Writes a packet header Version 3 with the given tag_type and length to a
    * string
    * @param tag_type Tag type
    * @param length Length of the payload
    * @returns String of the header
    */
  def writeOldHeader(tag_type: Integer, length: Integer): String = js.native
  
  /**
    * Encodes a given integer of length to the openpgp length specifier to a
    * string
    * @param length The length to encode
    * @returns String with openpgp length representation
    */
  def writeSimpleLength(length: Integer): js.typedarray.Uint8Array = js.native
}
