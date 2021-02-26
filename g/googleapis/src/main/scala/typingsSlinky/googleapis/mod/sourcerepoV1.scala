package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcerepoV1 {
  
  @JSImport("googleapis", "sourcerepo_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typingsSlinky.googleapis.sourcerepoV1Mod.sourcerepoV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "sourcerepo_v1.Resource$Projects$Repos")
  @js.native
  class ResourceProjectsRepos protected ()
    extends typingsSlinky.googleapis.sourcerepoV1Mod.sourcerepoV1.ResourceProjectsRepos {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Source Repositories API
    *
    * Accesses source code repositories hosted by Google.
    *
    * @example
    * const {google} = require('googleapis');
    * const sourcerepo = google.sourcerepo('v1');
    *
    * @namespace sourcerepo
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Sourcerepo
    */
  @JSImport("googleapis", "sourcerepo_v1.Sourcerepo")
  @js.native
  class Sourcerepo protected ()
    extends typingsSlinky.googleapis.sourcerepoV1Mod.sourcerepoV1.Sourcerepo {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
