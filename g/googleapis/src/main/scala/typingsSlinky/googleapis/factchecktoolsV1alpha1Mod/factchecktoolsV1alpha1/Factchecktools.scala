package typingsSlinky.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fact Check Tools API
  *
  *
  *
  * @example
  * const {google} = require('googleapis');
  * const factchecktools = google.factchecktools('v1alpha1');
  *
  * @namespace factchecktools
  * @type {Function}
  * @version v1alpha1
  * @variation v1alpha1
  * @param {object=} options Options for Factchecktools
  */
@JSImport("googleapis/build/src/apis/factchecktools/v1alpha1", "factchecktools_v1alpha1.Factchecktools")
@js.native
class Factchecktools protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var claims: ResourceClaims = js.native
  
  var context: APIRequestContext = js.native
  
  var pages: ResourcePages = js.native
}
