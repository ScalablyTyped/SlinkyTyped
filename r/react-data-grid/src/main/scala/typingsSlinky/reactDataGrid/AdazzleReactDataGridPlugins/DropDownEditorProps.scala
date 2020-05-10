package typingsSlinky.reactDataGrid.AdazzleReactDataGridPlugins

import typingsSlinky.reactDataGrid.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDownEditorProps extends js.Object {
  var options: js.Array[String | AnonText] = js.native
}

object DropDownEditorProps {
  @scala.inline
  def apply(options: js.Array[String | AnonText]): DropDownEditorProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownEditorProps]
  }
  @scala.inline
  implicit class DropDownEditorPropsOps[Self <: DropDownEditorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Array[String | AnonText]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

