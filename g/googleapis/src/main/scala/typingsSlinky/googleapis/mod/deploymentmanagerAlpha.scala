package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deploymentmanagerAlpha {
  
  /**
    * Google Cloud Deployment Manager Alpha API
    *
    * The Deployment Manager API allows users to declaratively configure, deploy
    * and run complex solutions on the Google Cloud Platform.
    *
    * @example
    * const {google} = require('googleapis');
    * const deploymentmanager = google.deploymentmanager('alpha');
    *
    * @namespace deploymentmanager
    * @type {Function}
    * @version alpha
    * @variation alpha
    * @param {object=} options Options for Deploymentmanager
    */
  @JSImport("googleapis", "deploymentmanager_alpha.Deploymentmanager")
  @js.native
  class Deploymentmanager protected ()
    extends typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.Deploymentmanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_alpha.Resource$Compositetypes")
  @js.native
  class ResourceCompositetypes protected ()
    extends typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.ResourceCompositetypes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_alpha.Resource$Deployments")
  @js.native
  class ResourceDeployments protected ()
    extends typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.ResourceDeployments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_alpha.Resource$Manifests")
  @js.native
  class ResourceManifests protected ()
    extends typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.ResourceManifests {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_alpha.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_alpha.Resource$Resources")
  @js.native
  class ResourceResources protected ()
    extends typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.ResourceResources {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_alpha.Resource$Typeproviders")
  @js.native
  class ResourceTypeproviders protected ()
    extends typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.ResourceTypeproviders {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_alpha.Resource$Types")
  @js.native
  class ResourceTypes protected ()
    extends typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.ResourceTypes {
    def this(context: APIRequestContext) = this()
  }
}
