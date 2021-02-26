package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containeranalysisV1alpha1 {
  
  /**
    * Container Analysis API
    *
    * An implementation of the Grafeas API, which stores, and enables querying
    * and retrieval of critical metadata about all of your software artifacts.
    *
    * @example
    * const {google} = require('googleapis');
    * const containeranalysis = google.containeranalysis('v1alpha1');
    *
    * @namespace containeranalysis
    * @type {Function}
    * @version v1alpha1
    * @variation v1alpha1
    * @param {object=} options Options for Containeranalysis
    */
  @JSImport("googleapis", "containeranalysis_v1alpha1.Containeranalysis")
  @js.native
  class Containeranalysis protected ()
    extends typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.Containeranalysis {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "containeranalysis_v1alpha1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "containeranalysis_v1alpha1.Resource$Projects$Notes")
  @js.native
  class ResourceProjectsNotes protected ()
    extends typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProjectsNotes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "containeranalysis_v1alpha1.Resource$Projects$Notes$Occurrences")
  @js.native
  class ResourceProjectsNotesOccurrences protected ()
    extends typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProjectsNotesOccurrences {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "containeranalysis_v1alpha1.Resource$Projects$Occurrences")
  @js.native
  class ResourceProjectsOccurrences protected ()
    extends typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProjectsOccurrences {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "containeranalysis_v1alpha1.Resource$Projects$Operations")
  @js.native
  class ResourceProjectsOperations protected ()
    extends typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProjectsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "containeranalysis_v1alpha1.Resource$Projects$Scanconfigs")
  @js.native
  class ResourceProjectsScanconfigs protected ()
    extends typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProjectsScanconfigs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "containeranalysis_v1alpha1.Resource$Providers")
  @js.native
  class ResourceProviders protected ()
    extends typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProviders {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "containeranalysis_v1alpha1.Resource$Providers$Notes")
  @js.native
  class ResourceProvidersNotes protected ()
    extends typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProvidersNotes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "containeranalysis_v1alpha1.Resource$Providers$Notes$Occurrences")
  @js.native
  class ResourceProvidersNotesOccurrences protected ()
    extends typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProvidersNotesOccurrences {
    def this(context: APIRequestContext) = this()
  }
}
