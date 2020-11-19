package typingsSlinky.apolloServerEnv.fetchMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloServerEnv.apolloServerEnvBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestInit extends js.Object {
  
  var agent: js.UndefOr[RequestAgent | `false`] = js.native
  
  var body: js.UndefOr[BodyInit] = js.native
  
  var cache: js.UndefOr[RequestCache] = js.native
  
  // Cloudflare Workers accept a `cf` property to control Cloudflare features
  // See https://developers.cloudflare.com/workers/reference/cloudflare-features/
  var cf: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var compress: js.UndefOr[Boolean] = js.native
  
  var credentials: js.UndefOr[RequestCredentials] = js.native
  
  // The following properties are node-fetch extensions
  var follow: js.UndefOr[Double] = js.native
  
  var headers: js.UndefOr[HeadersInit] = js.native
  
  var integrity: js.UndefOr[String] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[RequestMode] = js.native
  
  var redirect: js.UndefOr[RequestRedirect] = js.native
  
  var referrer: js.UndefOr[String] = js.native
  
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object RequestInit {
  
  @scala.inline
  def apply(): RequestInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestInit]
  }
  
  @scala.inline
  implicit class RequestInitOps[Self <: RequestInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgent(value: RequestAgent | `false`): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setBodyArrayBufferView(value: js.typedarray.ArrayBufferView): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: BodyInit): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCache(value: RequestCache): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCf(value: StringDictionary[js.Any]): Self = this.set("cf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCf: Self = this.set("cf", js.undefined)
    
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setCredentials(value: RequestCredentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setFollow(value: Double): Self = this.set("follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: js.Array[String]*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: HeadersInit): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMode(value: RequestMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setRedirect(value: RequestRedirect): Self = this.set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    
    @scala.inline
    def setReferrerPolicy(value: ReferrerPolicy): Self = this.set("referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferrerPolicy: Self = this.set("referrerPolicy", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
