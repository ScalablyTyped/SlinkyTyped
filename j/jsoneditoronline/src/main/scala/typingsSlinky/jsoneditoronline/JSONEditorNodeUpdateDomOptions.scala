package typingsSlinky.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditorNodeUpdateDomOptions extends js.Object {
  var recurse: js.UndefOr[Boolean] = js.native
  var updateIndexes: js.UndefOr[Boolean] = js.native
}

object JSONEditorNodeUpdateDomOptions {
  @scala.inline
  def apply(): JSONEditorNodeUpdateDomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorNodeUpdateDomOptions]
  }
  @scala.inline
  implicit class JSONEditorNodeUpdateDomOptionsOps[Self <: JSONEditorNodeUpdateDomOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecurse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurse")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateIndexes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateIndexes")(js.undefined)
        ret
    }
  }
  
}

