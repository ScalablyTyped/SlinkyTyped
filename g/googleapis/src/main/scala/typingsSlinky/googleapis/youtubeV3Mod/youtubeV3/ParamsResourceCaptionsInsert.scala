package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import typingsSlinky.googleapis.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCaptionsInsert extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.native
  
  /**
    * ID of the Google+ Page for the channel that the request is be on behalf
    * of
    */
  var onBehalfOf: js.UndefOr[String] = js.native
  
  /**
    * Note: This parameter is intended exclusively for YouTube content
    * partners.  The onBehalfOfContentOwner parameter indicates that the
    * request's authorization credentials identify a YouTube CMS user who is
    * acting on behalf of the content owner specified in the parameter value.
    * This parameter is intended for YouTube content partners that own and
    * manage many different YouTube channels. It allows content owners to
    * authenticate once and get access to all their video and channel data,
    * without having to provide authentication credentials for each individual
    * channel. The actual CMS account that the user authenticates with must be
    * linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  
  /**
    * The part parameter specifies the caption resource parts that the API
    * response will include. Set the parameter value to snippet.
    */
  var part: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCaption] = js.native
  
  /**
    * The sync parameter indicates whether YouTube should automatically
    * synchronize the caption file with the audio track of the video. If you
    * set the value to true, YouTube will disregard any time codes that are in
    * the uploaded caption file and generate new time codes for the captions.
    * You should set the sync parameter to true if you are uploading a
    * transcript, which has no time codes, or if you suspect the time codes in
    * your file are incorrect and want YouTube to try to fix them.
    */
  var sync: js.UndefOr[Boolean] = js.native
}
object ParamsResourceCaptionsInsert {
  
  @scala.inline
  def apply(): ParamsResourceCaptionsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCaptionsInsert]
  }
  
  @scala.inline
  implicit class ParamsResourceCaptionsInsertOps[Self <: ParamsResourceCaptionsInsert] (val x: Self) extends AnyVal {
    
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
    def setMedia(value: Body): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setOnBehalfOf(value: String): Self = this.set("onBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBehalfOf: Self = this.set("onBehalfOf", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = this.set("onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBehalfOfContentOwner: Self = this.set("onBehalfOfContentOwner", js.undefined)
    
    @scala.inline
    def setPart(value: String): Self = this.set("part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePart: Self = this.set("part", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaCaption): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
  }
}
