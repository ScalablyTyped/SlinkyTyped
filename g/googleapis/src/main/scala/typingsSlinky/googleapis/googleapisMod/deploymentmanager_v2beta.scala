package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "deploymentmanager_v2beta")
@js.native
object deploymentmanager_v2beta extends js.Object {
  /**
    * Google Cloud Deployment Manager API V2Beta Methods
    *
    * The Deployment Manager API allows users to declaratively configure, deploy
    * and run complex solutions on the Google Cloud Platform.
    *
    * @example
    * const {google} = require('googleapis');
    * const deploymentmanager = google.deploymentmanager('v2beta');
    *
    * @namespace deploymentmanager
    * @type {Function}
    * @version v2beta
    * @variation v2beta
    * @param {object=} options Options for Deploymentmanager
    */
  @js.native
  class Deploymentmanager protected ()
    extends typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Deploymentmanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Compositetypes protected ()
    extends typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Resource$Compositetypes {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Deployments protected ()
    extends typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Resource$Deployments {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Manifests protected ()
    extends typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Resource$Manifests {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Operations protected ()
    extends typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Resource$Operations {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Resources protected ()
    extends typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Resource$Resources {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Typeproviders protected ()
    extends typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Resource$Typeproviders {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Types protected ()
    extends typingsSlinky.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Resource$Types {
    def this(context: APIRequestContext) = this()
  }
  
}

