package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object speechV1 {
  
  @JSImport("googleapis", "speech_v1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typingsSlinky.googleapis.speechV1Mod.speechV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "speech_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typingsSlinky.googleapis.speechV1Mod.speechV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "speech_v1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typingsSlinky.googleapis.speechV1Mod.speechV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "speech_v1.Resource$Projects$Locations$Operations")
  @js.native
  class ResourceProjectsLocationsOperations protected ()
    extends typingsSlinky.googleapis.speechV1Mod.speechV1.ResourceProjectsLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "speech_v1.Resource$Projects$Operations")
  @js.native
  class ResourceProjectsOperations protected ()
    extends typingsSlinky.googleapis.speechV1Mod.speechV1.ResourceProjectsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "speech_v1.Resource$Projects$Operations$Manualrecognitiontasks")
  @js.native
  class ResourceProjectsOperationsManualrecognitiontasks protected ()
    extends typingsSlinky.googleapis.speechV1Mod.speechV1.ResourceProjectsOperationsManualrecognitiontasks {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "speech_v1.Resource$Speech")
  @js.native
  class ResourceSpeech protected ()
    extends typingsSlinky.googleapis.speechV1Mod.speechV1.ResourceSpeech {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Speech-to-Text API
    *
    * Converts audio to text by applying powerful neural network models.
    *
    * @example
    * const {google} = require('googleapis');
    * const speech = google.speech('v1');
    *
    * @namespace speech
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Speech
    */
  @JSImport("googleapis", "speech_v1.Speech")
  @js.native
  class Speech protected ()
    extends typingsSlinky.googleapis.speechV1Mod.speechV1.Speech {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
