package typingsSlinky.googleapis.v2alpha1Mod.genomicsV2alpha1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Genomics API
  *
  * Uploads, processes, queries, and searches Genomics data in the cloud.
  *
  * @example
  * const {google} = require('googleapis');
  * const genomics = google.genomics('v2alpha1');
  *
  * @namespace genomics
  * @type {Function}
  * @version v2alpha1
  * @variation v2alpha1
  * @param {object=} options Options for Genomics
  */
@JSImport("googleapis/build/src/apis/genomics/v2alpha1", "genomics_v2alpha1.Genomics")
@js.native
class Genomics protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var pipelines: ResourcePipelines = js.native
  
  var projects: ResourceProjects = js.native
  
  var workers: ResourceWorkers = js.native
}
