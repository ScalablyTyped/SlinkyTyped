package typingsSlinky.jsNacl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BoxPublicKey = js.typedarray.Uint8Array
  type BoxSecretKey = js.typedarray.Uint8Array
  type CipherText = js.typedarray.Uint8Array
  type Message = js.typedarray.Uint8Array
  type MessageWithSignature = js.typedarray.Uint8Array
  type NaclCallback = js.Function1[/* nacl */ typingsSlinky.jsNacl.mod.Nacl, scala.Unit]
  type NaclOpts = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Nonce = js.typedarray.Uint8Array
  type Signature = js.typedarray.Uint8Array
  type SignerPublicKey = js.typedarray.Uint8Array
  type SignerSecretKey = js.typedarray.Uint8Array
  type Stream = js.typedarray.Uint8Array
  type StreamKey = js.typedarray.Uint8Array
}
