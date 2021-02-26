package typingsSlinky.googleapis.composerV1beta1Mod.composerV1beta1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Composer API
  *
  * Manages Apache Airflow environments on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const composer = google.composer('v1beta1');
  *
  * @namespace composer
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Composer
  */
@JSImport("googleapis/build/src/apis/composer/v1beta1", "composer_v1beta1.Composer")
@js.native
class Composer protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
