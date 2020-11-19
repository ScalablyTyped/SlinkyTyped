package typingsSlinky.googleCloudStorage.signerMod

import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/storage/build/src/signer", "URLSigner")
@js.native
class URLSigner protected () extends js.Object {
  def this(authClient: AuthClient, bucket: BucketI) = this()
  def this(authClient: AuthClient, bucket: BucketI, file: FileI) = this()
  
  var authClient: js.Any = js.native
  
  var bucket: js.Any = js.native
  
  var file: js.Any = js.native
  
  /**
    * Create canonical headers for signing v4 url.
    *
    * The canonical headers for v4-signing a request demands header names are
    * first lowercased, followed by sorting the header names.
    * Then, construct the canonical headers part of the request:
    *  <lowercasedHeaderName> + ":" + Trim(<value>) + "\n"
    *  ..
    *  <lowercasedHeaderName> + ":" + Trim(<value>) + "\n"
    *
    * @param headers
    * @private
    */
  def getCanonicalHeaders(headers: OutgoingHttpHeaders): String = js.native
  
  def getCanonicalQueryParams(query: Query): String = js.native
  
  def getCanonicalRequest(method: String, path: String, query: String, headers: String, signedHeaders: String): String = js.native
  def getCanonicalRequest(
    method: String,
    path: String,
    query: String,
    headers: String,
    signedHeaders: String,
    contentSha256: String
  ): String = js.native
  
  def getResourcePath(cname: Boolean, bucket: String): String = js.native
  def getResourcePath(cname: Boolean, bucket: String, file: String): String = js.native
  
  def getSignedUrl(cfg: SignerGetSignedUrlConfig): js.Promise[SignerGetSignedUrlResponse] = js.native
  
  var getSignedUrlV2: js.Any = js.native
  
  var getSignedUrlV4: js.Any = js.native
  
  def parseExpires(expires: String): Double = js.native
  def parseExpires(expires: String, current: js.Date): Double = js.native
  def parseExpires(expires: Double): Double = js.native
  def parseExpires(expires: Double, current: js.Date): Double = js.native
  def parseExpires(expires: js.Date): Double = js.native
  def parseExpires(expires: js.Date, current: js.Date): Double = js.native
}
