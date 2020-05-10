package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.custom
import typingsSlinky.electron.electronStrings.frequent
import typingsSlinky.electron.electronStrings.recent
import typingsSlinky.electron.electronStrings.tasks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JumpListCategory extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/jump-list-category
  /**
    * Array of objects if type is tasks or custom, otherwise it should be omitted.
    */
  var items: js.UndefOr[js.Array[JumpListItem]] = js.native
  /**
    * Must be set if type is custom, otherwise it should be omitted.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * One of the following:
    */
  var `type`: js.UndefOr[tasks | frequent | recent | custom] = js.native
}

object JumpListCategory {
  @scala.inline
  def apply(): JumpListCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JumpListCategory]
  }
  @scala.inline
  implicit class JumpListCategoryOps[Self <: JumpListCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[JumpListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: tasks | frequent | recent | custom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

