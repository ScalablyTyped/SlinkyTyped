package typingsSlinky.googleapis.googleapisMod.testing_v1

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends typingsSlinky.googleapis.buildSrcApisTestingV1Mod.testing_v1.Testing {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

