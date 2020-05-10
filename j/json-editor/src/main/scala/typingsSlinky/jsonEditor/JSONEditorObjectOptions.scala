package typingsSlinky.jsonEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditorObjectOptions extends js.Object {
  /**
    * If set to true, the editor will start collapsed
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the collapse button will be hidden
    */
  var disable_collapse: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the Edit JSON button will be hidden
    */
  var disable_edit_json: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the Edit Properties button will be hidden
    */
  var disable_properties: js.UndefOr[Boolean] = js.native
}

object JSONEditorObjectOptions {
  @scala.inline
  def apply(): JSONEditorObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorObjectOptions]
  }
  @scala.inline
  implicit class JSONEditorObjectOptionsOps[Self <: JSONEditorObjectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_collapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_collapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_collapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_edit_json(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_edit_json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_edit_json: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_edit_json")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_properties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_properties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_properties")(js.undefined)
        ret
    }
  }
  
}

