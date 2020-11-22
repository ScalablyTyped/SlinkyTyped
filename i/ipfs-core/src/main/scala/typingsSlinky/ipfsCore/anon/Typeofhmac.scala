package typingsSlinky.ipfsCore.anon

import typingsSlinky.ipfsCore.ipfsCoreStrings.SHA1
import typingsSlinky.ipfsCore.ipfsCoreStrings.SHA256
import typingsSlinky.ipfsCore.ipfsCoreStrings.SHA512
import typingsSlinky.libp2pCrypto.mod.hmac.Digest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofhmac extends js.Object {
  
  def create(hash: String, secret: js.typedarray.Uint8Array): js.Promise[Digest] = js.native
  /**
    * Create a new HMAC Digest.
    */
  @JSName("create")
  def create_SHA1(hash: SHA1, secret: js.typedarray.Uint8Array): js.Promise[Digest] = js.native
  @JSName("create")
  def create_SHA256(hash: SHA256, secret: js.typedarray.Uint8Array): js.Promise[Digest] = js.native
  @JSName("create")
  def create_SHA512(hash: SHA512, secret: js.typedarray.Uint8Array): js.Promise[Digest] = js.native
}
