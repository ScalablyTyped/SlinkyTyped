package typingsSlinky.pulumiAws.outputMod.storagegateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmbFileShareCacheAttributes extends js.Object {
  
  /**
    * Refreshes a file share's cache by using Time To Live (TTL).
    * TTL is the length of time since the last refresh after which access to the directory would cause the file gateway
    * to first refresh that directory's contents from the Amazon S3 bucket. Valid Values: 300 to 2,592,000 seconds (5 minutes to 30 days)
    */
  var cacheStaleTimeoutInSeconds: js.UndefOr[Double] = js.native
}
object SmbFileShareCacheAttributes {
  
  @scala.inline
  def apply(): SmbFileShareCacheAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmbFileShareCacheAttributes]
  }
  
  @scala.inline
  implicit class SmbFileShareCacheAttributesOps[Self <: SmbFileShareCacheAttributes] (val x: Self) extends AnyVal {
    
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
    def setCacheStaleTimeoutInSeconds(value: Double): Self = this.set("cacheStaleTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheStaleTimeoutInSeconds: Self = this.set("cacheStaleTimeoutInSeconds", js.undefined)
  }
}
