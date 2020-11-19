package typingsSlinky.googleapis.mod.containeranalysisV1alpha1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container Analysis API
  *
  * An implementation of the Grafeas API, which stores, and enables querying
  * and retrieval of critical metadata about all of your software artifacts.
  *
  * @example
  * const {google} = require('googleapis');
  * const containeranalysis = google.containeranalysis('v1alpha1');
  *
  * @namespace containeranalysis
  * @type {Function}
  * @version v1alpha1
  * @variation v1alpha1
  * @param {object=} options Options for Containeranalysis
  */
@JSImport("googleapis", "containeranalysis_v1alpha1.Containeranalysis")
@js.native
class Containeranalysis protected ()
  extends typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.Containeranalysis {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
