package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudassetV1 {
  
  /**
    * Cloud Asset API
    *
    * The cloud asset API manages the history and inventory of cloud resources.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudasset = google.cloudasset('v1');
    *
    * @namespace cloudasset
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Cloudasset
    */
  @JSImport("googleapis", "cloudasset_v1.Cloudasset")
  @js.native
  class Cloudasset protected ()
    extends typingsSlinky.googleapis.cloudassetV1Mod.cloudassetV1.Cloudasset {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudasset_v1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typingsSlinky.googleapis.cloudassetV1Mod.cloudassetV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudasset_v1.Resource$V1")
  @js.native
  class ResourceV1 protected ()
    extends typingsSlinky.googleapis.cloudassetV1Mod.cloudassetV1.ResourceV1 {
    def this(context: APIRequestContext) = this()
  }
}
