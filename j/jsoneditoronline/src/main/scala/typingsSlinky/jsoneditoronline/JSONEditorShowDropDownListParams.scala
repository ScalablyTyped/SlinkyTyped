package typingsSlinky.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditorShowDropDownListParams extends js.Object {
  var node: JSONEditorNode = js.native
  var optionClassName: String = js.native
  var optionSelectedClassName: String = js.native
  var value: String = js.native
  var values: js.Array[js.Object] = js.native
  var x: Double = js.native
  var y: Double = js.native
  def callback(value: js.Any): Unit = js.native
}

object JSONEditorShowDropDownListParams {
  @scala.inline
  def apply(
    callback: js.Any => Unit,
    node: JSONEditorNode,
    optionClassName: String,
    optionSelectedClassName: String,
    value: String,
    values: js.Array[js.Object],
    x: Double,
    y: Double
  ): JSONEditorShowDropDownListParams = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), node = node.asInstanceOf[js.Any], optionClassName = optionClassName.asInstanceOf[js.Any], optionSelectedClassName = optionSelectedClassName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEditorShowDropDownListParams]
  }
  @scala.inline
  implicit class JSONEditorShowDropDownListParamsOps[Self <: JSONEditorShowDropDownListParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNode(value: JSONEditorNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionSelectedClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionSelectedClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

