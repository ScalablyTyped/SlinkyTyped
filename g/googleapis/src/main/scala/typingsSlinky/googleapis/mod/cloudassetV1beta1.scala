package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudassetV1beta1 {
  
  /**
    * Cloud Asset API
    *
    * The cloud asset API manages the history and inventory of cloud resources.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudasset = google.cloudasset('v1beta1');
    *
    * @namespace cloudasset
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Cloudasset
    */
  @JSImport("googleapis", "cloudasset_v1beta1.Cloudasset")
  @js.native
  class Cloudasset protected ()
    extends typingsSlinky.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1.Cloudasset {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudasset_v1beta1.Resource$Folders")
  @js.native
  class ResourceFolders protected ()
    extends typingsSlinky.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1.ResourceFolders {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudasset_v1beta1.Resource$Folders$Operations")
  @js.native
  class ResourceFoldersOperations protected ()
    extends typingsSlinky.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1.ResourceFoldersOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudasset_v1beta1.Resource$Organizations")
  @js.native
  class ResourceOrganizations protected ()
    extends typingsSlinky.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1.ResourceOrganizations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudasset_v1beta1.Resource$Organizations$Operations")
  @js.native
  class ResourceOrganizationsOperations protected ()
    extends typingsSlinky.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1.ResourceOrganizationsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudasset_v1beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typingsSlinky.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudasset_v1beta1.Resource$Projects$Operations")
  @js.native
  class ResourceProjectsOperations protected ()
    extends typingsSlinky.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1.ResourceProjectsOperations {
    def this(context: APIRequestContext) = this()
  }
}
