package typingsSlinky.jsNacl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BoxPublicKey = scala.scalajs.js.typedarray.Uint8Array
  type BoxSecretKey = scala.scalajs.js.typedarray.Uint8Array
  type CipherText = scala.scalajs.js.typedarray.Uint8Array
  type Message = scala.scalajs.js.typedarray.Uint8Array
  type MessageWithSignature = scala.scalajs.js.typedarray.Uint8Array
  type NaclCallback = js.Function1[/* nacl */ typingsSlinky.jsNacl.mod.Nacl, scala.Unit]
  type NaclOpts = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Nonce = scala.scalajs.js.typedarray.Uint8Array
  type Signature = scala.scalajs.js.typedarray.Uint8Array
  type SignerPublicKey = scala.scalajs.js.typedarray.Uint8Array
  type SignerSecretKey = scala.scalajs.js.typedarray.Uint8Array
  type Stream = scala.scalajs.js.typedarray.Uint8Array
  type StreamKey = scala.scalajs.js.typedarray.Uint8Array
}
