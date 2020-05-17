package typingsSlinky.gaeaModel.FitGaea

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.gaeaModel.anon.CurrentUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentPropsGaeaEdit extends js.Object {
  /**
    * 当 editor 为 array 时的数组配置
    * 数组中的 key,和填入的值,会作为 Array<key:value> 填入到 value 中
    */
  var array: js.UndefOr[js.Array[ComponentPropsOptionsArrayValue]] = js.native
  /**
    * 是否可被编辑
    */
  var editable: Boolean = js.native
  /**
    * 编辑器类型
    */
  var editor: String = js.native
  /**
    * 为空时的值，默认为 null
    */
  var emptyValue: js.UndefOr[js.Any] = js.native
  /**
    * 对应字段名
    */
  var field: String = js.native
  /**
    * 是否隐藏编辑工具
    */
  var hideTool: Boolean = js.native
  /**
    * 枚举实例
    */
  var instance: js.UndefOr[js.Array[StringDictionary[ComponentPropsOptionValue]]] = js.native
  /**
    * 选项名称
    */
  var label: String = js.native
  /**
    * 控制 number 单位
    */
  var number: js.UndefOr[CurrentUnit] = js.native
  /**
    * 当 editor 为 selector 时的数组配置
    */
  var selector: js.UndefOr[js.Array[ComponentPropsOptionsSelector]] = js.native
  /**
    * 值类型, 默认为字符串
    */
  var `type`: js.UndefOr[String] = js.native
}

object ComponentPropsGaeaEdit {
  @scala.inline
  def apply(editable: Boolean, editor: String, field: String, hideTool: Boolean, label: String): ComponentPropsGaeaEdit = {
    val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hideTool = hideTool.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPropsGaeaEdit]
  }
  @scala.inline
  implicit class ComponentPropsGaeaEditOps[Self <: ComponentPropsGaeaEdit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideTool(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArray(value: js.Array[ComponentPropsOptionsArrayValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyValue")(js.undefined)
        ret
    }
    @scala.inline
    def withInstance(value: js.Array[StringDictionary[ComponentPropsOptionValue]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: CurrentUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: js.Array[ComponentPropsOptionsSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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

