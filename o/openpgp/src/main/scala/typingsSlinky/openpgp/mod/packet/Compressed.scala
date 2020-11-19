package typingsSlinky.openpgp.mod.packet

import typingsSlinky.openpgp.mod.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "packet.Compressed")
@js.native
/**
  * Implementation of the Compressed Data Packet (Tag 8)
  * {@link https://tools.ietf.org/html/rfc4880#section-5.6|RFC4880 5.6}:
  * The Compressed Data packet contains compressed data.  Typically,
  * this packet is found as the contents of an encrypted packet, or following
  * a Signature or One-Pass Signature packet, and contains a literal data packet.
  */
class Compressed () extends js.Object {
  
  /**
    * Compression algorithm
    */
  var algorithm: js.Any = js.native
  
  /**
    * Compress the packet data (member decompressedData)
    */
  def compress(): Unit = js.native
  
  /**
    * Compressed packet data
    */
  var compressed: js.typedarray.Uint8Array | ReadableStream[js.typedarray.Uint8Array] = js.native
  
  /**
    * Decompression method for decompressing the compressed data
    * read by read_packet
    */
  def decompress(): Unit = js.native
  
  /**
    * List of packets
    */
  var packets: List = js.native
  
  def read(bytes: ReadableStream[js.typedarray.Uint8Array]): Unit = js.native
  /**
    * Parsing function for the packet.
    * @param bytes Payload of a tag 8 packet
    */
  def read(bytes: js.typedarray.Uint8Array): Unit = js.native
  
  /**
    * Packet type
    */
  var tag: typingsSlinky.openpgp.mod.enums.packet = js.native
  
  /**
    * Return the compressed packet.
    * @returns binary compressed packet
    */
  def write(): js.typedarray.Uint8Array | ReadableStream[js.typedarray.Uint8Array] = js.native
}
