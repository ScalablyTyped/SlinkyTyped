package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Slides API
  *
  * Reads and writes Google Slides presentations.
  *
  * @example
  * const {google} = require('googleapis');
  * const slides = google.slides('v1');
  *
  * @namespace slides
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Slides
  */
@JSImport("googleapis/build/src/apis/slides/v1", "slides_v1.Slides")
@js.native
class Slides protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var presentations: ResourcePresentations = js.native
}

