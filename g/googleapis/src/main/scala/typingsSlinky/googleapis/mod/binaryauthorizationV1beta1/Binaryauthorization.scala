package typingsSlinky.googleapis.mod.binaryauthorizationV1beta1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Binary Authorization API
  *
  * The management interface for Binary Authorization, a system providing
  * policy control for images deployed to Kubernetes Engine clusters.
  *
  * @example
  * const {google} = require('googleapis');
  * const binaryauthorization = google.binaryauthorization('v1beta1');
  *
  * @namespace binaryauthorization
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Binaryauthorization
  */
@JSImport("googleapis", "binaryauthorization_v1beta1.Binaryauthorization")
@js.native
class Binaryauthorization protected ()
  extends typingsSlinky.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1.Binaryauthorization {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
