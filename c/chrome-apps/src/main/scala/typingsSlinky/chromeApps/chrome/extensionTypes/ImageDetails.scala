package typingsSlinky.chromeApps.chrome.extensionTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the format and quality of an image.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chrome.extensionTypes.ImageDetailsJpeg
  - typingsSlinky.chromeApps.chrome.extensionTypes.ImageDetailsPng
*/
trait ImageDetails extends js.Object

object ImageDetails {
  @scala.inline
  implicit def apply(value: ImageDetailsJpeg): ImageDetails = value.asInstanceOf[ImageDetails]
  @scala.inline
  implicit def apply(value: ImageDetailsPng): ImageDetails = value.asInstanceOf[ImageDetails]
}

