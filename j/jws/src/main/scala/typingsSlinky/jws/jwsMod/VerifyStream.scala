package typingsSlinky.jws.jwsMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyStream extends EventEmitter {
  /**
    * Key.  Can be a string, buffer, or object.
    */
  var key: js.Any = js.native
  /**
    * A Writable Stream that expects a public key or secret.
    * Do not use if you passed a key or secret option to the
    * constructor.
    */
  var publicKey: Writable = js.native
  /**
    * Secret.  Can be a string, buffer, or object.
    */
  var secret: js.Any = js.native
  /**
    * A Writable Stream that expects a JWS Signature. Do not
    * use if you passed a signature option to the constructor.
    */
  var signature: Writable = js.native
}

