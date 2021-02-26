package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Spanner API
  *
  * Cloud Spanner is a managed, mission-critical, globally consistent and
  * scalable relational database service.
  *
  * @example
  * const {google} = require('googleapis');
  * const spanner = google.spanner('v1');
  *
  * @namespace spanner
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Spanner
  */
@JSImport("googleapis/build/src/apis/spanner/v1", "spanner_v1.Spanner")
@js.native
class Spanner protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
