package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingV1 {
  
  @JSImport("googleapis", "testing_v1.Resource$Applicationdetailservice")
  @js.native
  class ResourceApplicationdetailservice protected ()
    extends typingsSlinky.googleapis.testingV1Mod.testingV1.ResourceApplicationdetailservice {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "testing_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typingsSlinky.googleapis.testingV1Mod.testingV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "testing_v1.Resource$Projects$Testmatrices")
  @js.native
  class ResourceProjectsTestmatrices protected ()
    extends typingsSlinky.googleapis.testingV1Mod.testingV1.ResourceProjectsTestmatrices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "testing_v1.Resource$Testenvironmentcatalog")
  @js.native
  class ResourceTestenvironmentcatalog protected ()
    extends typingsSlinky.googleapis.testingV1Mod.testingV1.ResourceTestenvironmentcatalog {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Testing API
    *
    * Allows developers to run automated tests for their mobile applications on
    * Google infrastructure.
    *
    * @example
    * const {google} = require('googleapis');
    * const testing = google.testing('v1');
    *
    * @namespace testing
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Testing
    */
  @JSImport("googleapis", "testing_v1.Testing")
  @js.native
  class Testing protected ()
    extends typingsSlinky.googleapis.testingV1Mod.testingV1.Testing {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
