package typingsSlinky.googleapis.mod.runtimeconfigV1

import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Runtime Configuration API
  *
  * The Runtime Configurator allows you to dynamically configure and expose
  * variables through Google Cloud Platform. In addition, you can also set
  * Watchers and Waiters that will watch for changes to your data and return
  * based on certain conditions.
  *
  * @example
  * const {google} = require('googleapis');
  * const runtimeconfig = google.runtimeconfig('v1');
  *
  * @namespace runtimeconfig
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Runtimeconfig
  */
@JSImport("googleapis", "runtimeconfig_v1.Runtimeconfig")
@js.native
class Runtimeconfig protected ()
  extends typingsSlinky.googleapis.runtimeconfigV1Mod.runtimeconfigV1.Runtimeconfig {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
