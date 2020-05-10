package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INodeMaterialEditorOptions extends js.Object {
  /** Define the URl to load node editor script */
  var editorURL: js.UndefOr[String] = js.native
}

object INodeMaterialEditorOptions {
  @scala.inline
  def apply(): INodeMaterialEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeMaterialEditorOptions]
  }
  @scala.inline
  implicit class INodeMaterialEditorOptionsOps[Self <: INodeMaterialEditorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditorURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorURL")(js.undefined)
        ret
    }
  }
  
}

