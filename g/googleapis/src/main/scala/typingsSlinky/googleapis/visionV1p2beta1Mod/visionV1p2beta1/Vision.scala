package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Vision API
  *
  * Integrates Google Vision features, including image labeling, face, logo,
  * and landmark detection, optical character recognition (OCR), and detection
  * of explicit content, into applications.
  *
  * @example
  * const {google} = require('googleapis');
  * const vision = google.vision('v1p2beta1');
  *
  * @namespace vision
  * @type {Function}
  * @version v1p2beta1
  * @variation v1p2beta1
  * @param {object=} options Options for Vision
  */
@JSImport("googleapis/build/src/apis/vision/v1p2beta1", "vision_v1p2beta1.Vision")
@js.native
class Vision protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var files: ResourceFiles = js.native
  
  var images: ResourceImages = js.native
}
