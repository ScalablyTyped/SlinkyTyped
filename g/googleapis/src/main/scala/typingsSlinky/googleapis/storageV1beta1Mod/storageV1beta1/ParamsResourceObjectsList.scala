package typingsSlinky.googleapis.storageV1beta1Mod.storageV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceObjectsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Name of the bucket in which to look for objects.
    */
  var bucket: js.UndefOr[String] = js.native
  
  /**
    * Returns results in a directory-like mode. items will contain only objects
    * whose names, aside from the prefix, do not contain delimiter. Objects
    * whose names, aside from the prefix, contain delimiter will have their
    * name, truncated after the delimiter, returned in prefixes. Duplicate
    * prefixes are omitted.
    */
  var delimiter: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of items plus prefixes to return. As duplicate prefixes
    * are omitted, fewer total results may be returned than requested.
    */
  var `max-results`: js.UndefOr[Double] = js.native
  
  /**
    * A previously-returned page token representing part of the larger set of
    * results to view.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Filter results to objects whose names begin with this prefix.
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    * Set of properties to return. Defaults to no_acl.
    */
  var projection: js.UndefOr[String] = js.native
}
object ParamsResourceObjectsList {
  
  @scala.inline
  def apply(): ParamsResourceObjectsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceObjectsList]
  }
  
  @scala.inline
  implicit class ParamsResourceObjectsListOps[Self <: ParamsResourceObjectsList] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def `setMax-results`(value: Double): Self = this.set("max-results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-results`: Self = this.set("max-results", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
  }
}
