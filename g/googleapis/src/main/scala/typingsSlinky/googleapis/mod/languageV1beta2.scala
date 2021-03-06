package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object languageV1beta2 {
  
  /**
    * Cloud Natural Language API
    *
    * Provides natural language understanding technologies, such as sentiment
    * analysis, entity recognition, entity sentiment analysis, and other text
    * annotations, to developers.
    *
    * @example
    * const {google} = require('googleapis');
    * const language = google.language('v1beta2');
    *
    * @namespace language
    * @type {Function}
    * @version v1beta2
    * @variation v1beta2
    * @param {object=} options Options for Language
    */
  @JSImport("googleapis", "language_v1beta2.Language")
  @js.native
  class Language protected ()
    extends typingsSlinky.googleapis.languageV1beta2Mod.languageV1beta2.Language {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "language_v1beta2.Resource$Documents")
  @js.native
  class ResourceDocuments protected ()
    extends typingsSlinky.googleapis.languageV1beta2Mod.languageV1beta2.ResourceDocuments {
    def this(context: APIRequestContext) = this()
  }
}
