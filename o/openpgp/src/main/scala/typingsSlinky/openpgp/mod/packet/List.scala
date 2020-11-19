package typingsSlinky.openpgp.mod.packet

import typingsSlinky.openpgp.mod.Integer
import typingsSlinky.openpgp.mod.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "packet.List")
@js.native
/**
  * This class represents a list of openpgp packets.
  * Take care when iterating over it - the packets themselves
  * are stored as numerical indices.
  */
class List () extends js.Object {
  
  /**
    * Concatenates packetlist or array of packets
    */
  def concat(): Unit = js.native
  
  /**
    * Creates a new PacketList with all packets from the given types
    */
  def filterByTag(): Unit = js.native
  
  /**
    * Traverses packet tree and returns first matching packet
    * @param type The packet type
    * @returns
    */
  def findPacket(`type`: typingsSlinky.openpgp.mod.enums.packet): js.UndefOr[List] = js.native
  
  /**
    * Returns array of found indices by tag
    */
  def indexOfTag(): Unit = js.native
  
  /**
    * The number of packets contained within the list.
    */
  val length: Integer = js.native
  
  /**
    * Adds a packet to the list. This is the only supported method of doing so;
    * writing to packetlist[i] directly will result in an error.
    * @param packet Packet to push
    */
  def push(packet: js.Object): Unit = js.native
  
  def read(A: ReadableStream[js.typedarray.Uint8Array]): Unit = js.native
  /**
    * Reads a stream of binary data and interprents it as a list of packets.
    * @param A Uint8Array of bytes.
    */
  def read(A: js.typedarray.Uint8Array): Unit = js.native
  
  /**
    * Creates a binary representation of openpgp objects contained within the
    * class instance.
    * @returns A Uint8Array containing valid openpgp packets.
    */
  def write(): js.typedarray.Uint8Array | ReadableStream[js.typedarray.Uint8Array] = js.native
}
/* static members */
@JSImport("openpgp", "packet.List")
@js.native
object List extends js.Object {
  
  /**
    * Allocate a new packetlist from structured packetlist clone
    * See {@link https://w3c.github.io/html/infrastructure.html#safe-passing-of-structured-data}
    * @param packetClone packetlist clone
    * @returns new packetlist object with data from packetlist clone
    */
  def fromStructuredClone(packetClone: js.Object): js.Object = js.native
}
