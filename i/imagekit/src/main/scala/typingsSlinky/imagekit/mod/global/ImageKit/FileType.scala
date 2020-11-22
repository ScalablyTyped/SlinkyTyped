package typingsSlinky.imagekit.mod.global.ImageKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Type of files to include in result set. Accepts three values:
  * all - include all types of files in result set
  * image - only search in image type files
  * non-image - only search in files which are not image, e.g., JS or CSS or video files.
  *
  * @see {@link https://docs.imagekit.io/api-reference/media-api/list-and-search-files}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.imagekit.imagekitStrings.all
  - typingsSlinky.imagekit.imagekitStrings.image
  - typingsSlinky.imagekit.imagekitStrings.`non-image`
*/
trait FileType extends js.Object
object FileType {
  
  @scala.inline
  def all: typingsSlinky.imagekit.imagekitStrings.all = "all".asInstanceOf[typingsSlinky.imagekit.imagekitStrings.all]
  
  @scala.inline
  def image: typingsSlinky.imagekit.imagekitStrings.image = "image".asInstanceOf[typingsSlinky.imagekit.imagekitStrings.image]
  
  @scala.inline
  def `non-image`: typingsSlinky.imagekit.imagekitStrings.`non-image` = "non-image".asInstanceOf[typingsSlinky.imagekit.imagekitStrings.`non-image`]
}
