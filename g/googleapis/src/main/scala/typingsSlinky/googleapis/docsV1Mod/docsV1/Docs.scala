package typingsSlinky.googleapis.docsV1Mod.docsV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Docs API
  *
  * Reads and writes Google Docs documents.
  *
  * @example
  * const {google} = require('googleapis');
  * const docs = google.docs('v1');
  *
  * @namespace docs
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Docs
  */
@JSImport("googleapis/build/src/apis/docs/v1", "docs_v1.Docs")
@js.native
class Docs protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var documents: ResourceDocuments = js.native
}
