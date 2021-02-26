package typingsSlinky.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DoubleClick Search API
  *
  * Reports and modifies your advertising data in DoubleClick Search (for
  * example, campaigns, ad groups, keywords, and conversions).
  *
  * @example
  * const {google} = require('googleapis');
  * const doubleclicksearch = google.doubleclicksearch('v2');
  *
  * @namespace doubleclicksearch
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Doubleclicksearch
  */
@JSImport("googleapis/build/src/apis/doubleclicksearch/v2", "doubleclicksearch_v2.Doubleclicksearch")
@js.native
class Doubleclicksearch protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var conversion: ResourceConversion = js.native
  
  var reports: ResourceReports = js.native
  
  var savedColumns: ResourceSavedcolumns = js.native
}
