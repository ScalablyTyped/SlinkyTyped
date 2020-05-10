package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureRename extends js.Object {
  var newName: js.UndefOr[String] = js.native
}

object FeatureRename {
  @scala.inline
  def apply(): FeatureRename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureRename]
  }
  @scala.inline
  implicit class FeatureRenameOps[Self <: FeatureRename] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newName")(js.undefined)
        ret
    }
  }
  
}

