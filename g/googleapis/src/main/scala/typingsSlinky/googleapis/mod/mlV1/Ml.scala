package typingsSlinky.googleapis.mod.mlV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Machine Learning Engine
  *
  * An API to enable creating and using machine learning models.
  *
  * @example
  * const {google} = require('googleapis');
  * const ml = google.ml('v1');
  *
  * @namespace ml
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Ml
  */
@JSImport("googleapis", "ml_v1.Ml")
@js.native
class Ml protected ()
  extends typingsSlinky.googleapis.mlV1Mod.mlV1.Ml {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
