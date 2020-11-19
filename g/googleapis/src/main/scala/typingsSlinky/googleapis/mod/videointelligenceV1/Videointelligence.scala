package typingsSlinky.googleapis.mod.videointelligenceV1

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
  * const videointelligence = google.videointelligence('v1');
  *
  * @namespace videointelligence
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Videointelligence
  */
@JSImport("googleapis", "videointelligence_v1.Videointelligence")
@js.native
class Videointelligence protected ()
  extends typingsSlinky.googleapis.videointelligenceV1Mod.videointelligenceV1.Videointelligence {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
