package typingsSlinky.googleapis.mod.languageV1beta1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Natural Language API
  *
  * Provides natural language understanding technologies, such as sentiment
  * analysis, entity recognition, entity sentiment analysis, and other text
  * annotations, to developers.
  *
  * @example
  * const {google} = require('googleapis');
  * const language = google.language('v1beta1');
  *
  * @namespace language
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Language
  */
@JSImport("googleapis", "language_v1beta1.Language")
@js.native
class Language protected ()
  extends typingsSlinky.googleapis.languageV1beta1Mod.languageV1beta1.Language {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
