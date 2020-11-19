package typingsSlinky.jsSha256.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hmac extends js.Object {
  
  /**
    * Computes a Hash-based message authentication code (HMAC) using a secret key
    *
    * @param secretKey The Secret Key
    * @param message The message you want to hash.
    */
  def apply(secretKey: String, message: Message): String = js.native
  
  /**
    * Return hash in integer array.
    *
    * @param secretKey The Secret Key
    * @param message The message you want to hash.
    */
  def array(secretKey: String, message: Message): js.Array[Double] = js.native
  
  /**
    * Return hash in ArrayBuffer.
    *
    * @param secretKey The Secret Key
    * @param message The message you want to hash.
    */
  def arrayBuffer(secretKey: String, message: Message): js.typedarray.ArrayBuffer = js.native
  
  /**
    * Create a hash object using a secret key.
    *
    * @param secretKey The Secret Key
    */
  def create(secretKey: String): Hasher = js.native
  
  /**
    * Return hash in integer array.
    *
    * @param secretKey The Secret Key
    * @param message The message you want to hash.
    */
  def digest(secretKey: String, message: Message): js.Array[Double] = js.native
  
  /**
    * Return hash in hex string.
    *
    * @param secretKey The Secret Key
    * @param message The message you want to hash.
    */
  def hex(secretKey: String, message: Message): String = js.native
  
  /**
    * Create a hash object and hash message using a secret key
    *
    * @param secretKey The Secret Key
    * @param message The message you want to hash.
    */
  def update(secretKey: String, message: Message): Hasher = js.native
}
