package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "translate_v2")
@js.native
object translate_v2 extends js.Object {
  @js.native
  class Resource$Detections protected ()
    extends typingsSlinky.googleapis.buildSrcApisTranslateV2Mod.translate_v2.Resource$Detections {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Languages protected ()
    extends typingsSlinky.googleapis.buildSrcApisTranslateV2Mod.translate_v2.Resource$Languages {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Translations protected ()
    extends typingsSlinky.googleapis.buildSrcApisTranslateV2Mod.translate_v2.Resource$Translations {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Google Cloud Translation API
    *
    * The Google Cloud Translation API lets websites and programs integrate with
    * Google Translate programmatically.
    *
    * @example
    * const {google} = require('googleapis');
    * const translate = google.translate('v2');
    *
    * @namespace translate
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Translate
    */
  @js.native
  class Translate protected ()
    extends typingsSlinky.googleapis.buildSrcApisTranslateV2Mod.translate_v2.Translate {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

