package typingsSlinky.maximMazurokGapiClientYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoryId extends js.Object {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /** Return the channels within the specified guide category ID. */
  var categoryId: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** Return the channel associated with a YouTube username. */
  var forUsername: js.UndefOr[String] = js.native
  
  /**
    * Stands for "host language". Specifies the localization language of the metadata to be filled into snippet.localized. The field is filled with the default metadata if there is no
    * localization in the specified language. The parameter value must be a language code included in the list returned by the i18nLanguages.list method (e.g. en_US, es_MX).
    */
  var hl: js.UndefOr[String] = js.native
  
  /** Return the channels with the specified IDs. */
  var id: js.UndefOr[String | js.Array[String]] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** Return the channels managed by the authenticated user. */
  var managedByMe: js.UndefOr[Boolean] = js.native
  
  /** The *maxResults* parameter specifies the maximum number of items that should be returned in the result set. */
  var maxResults: js.UndefOr[Double] = js.native
  
  /** Return the ids of channels owned by the authenticated user. */
  var mine: js.UndefOr[Boolean] = js.native
  
  /** Return the channels subscribed to the authenticated user */
  var mySubscribers: js.UndefOr[Boolean] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /**
    * *Note:* This parameter is intended exclusively for YouTube content partners. The *onBehalfOfContentOwner* parameter indicates that the request's authorization credentials
    * identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and
    * manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide
    * authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  
  /**
    * The *pageToken* parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other
    * pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The *part* parameter specifies a comma-separated list of one or more channel resource properties that the API response will include. If the parameter identifies a property that
    * contains child properties, the child properties will be included in the response. For example, in a channel resource, the contentDetails property contains other properties, such
    * as the uploads properties. As such, if you set *part=contentDetails*, the API response will also contain all of those nested properties.
    */
  var part: String | js.Array[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}
object CategoryId {
  
  @scala.inline
  def apply(part: String | js.Array[String]): CategoryId = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryId]
  }
  
  @scala.inline
  implicit class CategoryIdOps[Self <: CategoryId] (val x: Self) extends AnyVal {
    
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
    def setPartVarargs(value: String*): Self = this.set("part", js.Array(value :_*))
    
    @scala.inline
    def setPart(value: String | js.Array[String]): Self = this.set("part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$Dotxgafv(value: String): Self = this.set("$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$Dotxgafv: Self = this.set("$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCategoryId(value: String): Self = this.set("categoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryId: Self = this.set("categoryId", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setForUsername(value: String): Self = this.set("forUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForUsername: Self = this.set("forUsername", js.undefined)
    
    @scala.inline
    def setHl(value: String): Self = this.set("hl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHl: Self = this.set("hl", js.undefined)
    
    @scala.inline
    def setIdVarargs(value: String*): Self = this.set("id", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String | js.Array[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setManagedByMe(value: Boolean): Self = this.set("managedByMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedByMe: Self = this.set("managedByMe", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setMine(value: Boolean): Self = this.set("mine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMine: Self = this.set("mine", js.undefined)
    
    @scala.inline
    def setMySubscribers(value: Boolean): Self = this.set("mySubscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMySubscribers: Self = this.set("mySubscribers", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = this.set("onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBehalfOfContentOwner: Self = this.set("onBehalfOfContentOwner", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = this.set("upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload_protocol: Self = this.set("upload_protocol", js.undefined)
  }
}
