package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.custom
import typingsSlinky.electron.electronStrings.frequent
import typingsSlinky.electron.electronStrings.recent
import typingsSlinky.electron.electronStrings.tasks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JumpListCategory extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/jump-list-category
  /**
    * Array of objects if type is tasks or custom, otherwise it should be omitted.
    */
  var items: js.UndefOr[js.Array[JumpListItem]] = js.undefined
  /**
    * Must be set if type is custom, otherwise it should be omitted.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * One of the following:
    */
  var `type`: js.UndefOr[tasks | frequent | recent | custom] = js.undefined
}

object JumpListCategory {
  @scala.inline
  def apply(
    items: js.Array[JumpListItem] = null,
    name: String = null,
    `type`: tasks | frequent | recent | custom = null
  ): JumpListCategory = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumpListCategory]
  }
}

