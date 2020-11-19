package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.mod.packet.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "signature")
@js.native
object signature extends js.Object {
  
  def read(input: ReadableStream[js.typedarray.Uint8Array]): js.Promise[Signature] = js.native
  /**
    * reads an OpenPGP signature as byte array and returns a signature object
    * @param input binary signature
    * @returns new signature object
    */
  def read(input: js.typedarray.Uint8Array): js.Promise[Signature] = js.native
  
  /**
    * reads an OpenPGP armored signature and returns a signature object
    * @param armoredText text to be parsed
    * @returns new signature object
    */
  def readArmored(armoredText: String): js.Promise[Signature] = js.native
  def readArmored(armoredText: ReadableStream[String]): js.Promise[Signature] = js.native
  
  /**
    * Class that represents an OpenPGP signature.
    */
  @js.native
  class Signature protected () extends js.Object {
    /**
      * @param packetlist The signature packets
      */
    def this(packetlist: List) = this()
    
    /**
      * Returns ASCII armored text of signature
      * @returns ASCII armor
      */
    def armor(): ReadableStream[String] = js.native
  }
}
