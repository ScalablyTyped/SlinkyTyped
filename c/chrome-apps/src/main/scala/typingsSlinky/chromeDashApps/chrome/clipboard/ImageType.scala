package typingsSlinky.chromeDashApps.chrome.clipboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Image type */
/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.png
  - typings.chromeDashApps.chromeDashAppsStrings.jpeg
*/
trait ImageType extends js.Object

object ImageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def jpeg: typingsSlinky.chromeDashApps.chromeDashAppsStrings.jpeg = this.cast("jpeg")
  @scala.inline
  def png: typingsSlinky.chromeDashApps.chromeDashAppsStrings.png = this.cast("png")
}

