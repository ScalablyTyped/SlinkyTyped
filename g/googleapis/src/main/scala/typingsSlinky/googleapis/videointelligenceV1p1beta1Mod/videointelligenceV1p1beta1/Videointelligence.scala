package typingsSlinky.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Video Intelligence API
  *
  * Detects objects, explicit content, and scene changes in videos. It also
  * specifies the region for annotation and transcribes speech to text.
  * Supports both asynchronous API and streaming API.
  *
  * @example
  * const {google} = require('googleapis');
  * const videointelligence = google.videointelligence('v1p1beta1');
  *
  * @namespace videointelligence
  * @type {Function}
  * @version v1p1beta1
  * @variation v1p1beta1
  * @param {object=} options Options for Videointelligence
  */
@JSImport("googleapis/build/src/apis/videointelligence/v1p1beta1", "videointelligence_v1p1beta1.Videointelligence")
@js.native
class Videointelligence protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var videos: ResourceVideos = js.native
}
