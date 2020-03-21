package typingsSlinky.awsSdkAddGlacierChecksumHeadersNode

import typingsSlinky.awsSdkTypes.cryptoMod.HashConstructor
import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandler
import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandlerArguments
import typingsSlinky.awsSdkTypes.utilMod.Decoder
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/add-glacier-checksum-headers-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def addChecksumHeaders(Sha256: HashConstructor, fromUtf8: Decoder): js.Function1[
    /* next */ BuildHandler[_, _, Readable], 
    js.Function1[/* hasRequestRest */ BuildHandlerArguments[_, Readable], js.Promise[_]]
  ] = js.native
}

