package typingsSlinky.reactNativeImageGallery.mod

import typingsSlinky.reactNativeImageGallery.anon.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNativeImageGallery.mod.LocalImage
  - typingsSlinky.reactNativeImageGallery.mod.RemoteImage
*/
trait Image extends js.Object
object Image {
  
  @scala.inline
  def LocalImage(dimensions: ImageDimensions, source: Double): Image = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  def RemoteImage(source: Uri): Image = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}
