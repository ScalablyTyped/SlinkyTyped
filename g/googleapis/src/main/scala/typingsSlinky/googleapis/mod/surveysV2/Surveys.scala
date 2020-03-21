package typingsSlinky.googleapis.mod.surveysV2

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Surveys API
  *
  * Creates and conducts surveys, lists the surveys that an authenticated user
  * owns, and retrieves survey results and information about specified surveys.
  *
  * @example
  * const {google} = require('googleapis');
  * const surveys = google.surveys('v2');
  *
  * @namespace surveys
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Surveys
  */
@JSImport("googleapis", "surveys_v2.Surveys")
@js.native
class Surveys protected ()
  extends typingsSlinky.googleapis.surveysV2Mod.surveysV2.Surveys {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

