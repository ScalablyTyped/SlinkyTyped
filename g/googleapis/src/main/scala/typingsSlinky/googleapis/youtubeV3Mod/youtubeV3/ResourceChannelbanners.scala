package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Channelbanners")
@js.native
class ResourceChannelbanners protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * youtube.channelBanners.insert
    * @desc Uploads a channel banner image to YouTube. This method represents
    * the first two steps in a three-step process to update the banner image
    * for a channel:  - Call the channelBanners.insert method to upload the
    * binary image data to YouTube. The image must have a 16:9 aspect ratio and
    * be at least 2120x1192 pixels. - Extract the url property's value from the
    * response that the API returns for step 1. - Call the channels.update
    * method to update the channel's branding settings. Set the
    * brandingSettings.image.bannerExternalUrl property's value to the URL
    * obtained in step 2.
    * @alias youtube.channelBanners.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.channelId The channelId parameter identifies the YouTube channel to which the banner is uploaded. The channelId parameter was introduced as a required parameter in May 2017. As this was a backward-incompatible change, channelBanners.insert requests that do not specify this parameter will not return an error until six months have passed from the time that the parameter was introduced. Please see the API Terms of Service for the official policy regarding backward incompatible changes and the API revision history for the exact date that the parameter was introduced.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaChannelBannerResource] = js.native
  def insert(callback: BodyResponseCallback[SchemaChannelBannerResource]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChannelBannerResource] = js.native
  def insert(params: ParamsResourceChannelbannersInsert): GaxiosPromise[SchemaChannelBannerResource] = js.native
  def insert(
    params: ParamsResourceChannelbannersInsert,
    callback: BodyResponseCallback[SchemaChannelBannerResource]
  ): Unit = js.native
  def insert(
    params: ParamsResourceChannelbannersInsert,
    options: BodyResponseCallback[SchemaChannelBannerResource],
    callback: BodyResponseCallback[SchemaChannelBannerResource]
  ): Unit = js.native
  def insert(params: ParamsResourceChannelbannersInsert, options: MethodOptions): GaxiosPromise[SchemaChannelBannerResource] = js.native
  def insert(
    params: ParamsResourceChannelbannersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannelBannerResource]
  ): Unit = js.native
}
