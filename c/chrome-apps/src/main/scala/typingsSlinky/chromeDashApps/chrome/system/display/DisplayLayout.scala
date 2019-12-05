package typingsSlinky.chromeDashApps.chrome.system.display

import typingsSlinky.chromeDashApps.Anon_BOTTOM
import typingsSlinky.chromeDashApps.chrome.ToStringLiteral
import typingsSlinky.chromeDashApps.chrome.integer
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.bottom
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.left
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.right
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.top
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since Chrome 53
  */
trait DisplayLayout extends js.Object {
  /** The unique identifier of the display. */
  var id: String
  /** The offset of the display along the connected edge. 0 indicates that the topmost or leftmost corners are aligned. */
  var offset: integer
  /** The unique identifier of the parent display. Empty if this is the root. */
  var parentId: String
  /**
    * The layout position of this display relative to the parent.
    * This will be ignored for the root.
    * @see enum DisplayPosition
    */
  var position: ToStringLiteral[Anon_BOTTOM, String, Exclude[String, top | right | bottom | left]]
}

object DisplayLayout {
  @scala.inline
  def apply(
    id: String,
    offset: integer,
    parentId: String,
    position: ToStringLiteral[Anon_BOTTOM, String, Exclude[String, top | right | bottom | left]]
  ): DisplayLayout = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisplayLayout]
  }
}

