package typingsSlinky.gaeaModel.FitGaea

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any]
     with /**
  * 渲染编辑回调
  */
// renderEditer?:(React.ComponentClass<FitGaea.ComponentProps>,{})=>void
/* x */ StringDictionary[js.Any] {
  /**
    * 是否可以拖入子元素
    */
  var canDragIn: js.UndefOr[Boolean] = js.native
  /**
    * 父组件传递的数据
    */
  var gaeaData: js.UndefOr[js.Any] = js.native
  /**
    * 编辑信息
    */
  var gaeaEdit: js.UndefOr[js.Array[ComponentPropsGaeaEdit]] = js.native
  /**
    * 事件定义
    */
  var gaeaEvent: js.UndefOr[GaeaEvent] = js.native
  /**
    * 存储事件设置
    */
  var gaeaEventData: js.UndefOr[js.Array[EventData]] = js.native
  /**
    * 组件图标,为 fontAwesome
    */
  var gaeaIcon: js.UndefOr[String] = js.native
  /**
    * 组件的中文名
    */
  var gaeaName: String = js.native
  /**
    * 存储native事件设置
    */
  var gaeaNativeEventData: js.UndefOr[js.Array[EventData]] = js.native
  /**
    * 是否在预览模式，preivew 会传入 true
    */
  var gaeaPreview: js.UndefOr[Boolean] = js.native
  /**
    * 唯一的 key,用来唯一标识这个组件,所有盖亚内部组件都以 gaea- 为前缀
    */
  var gaeaUniqueKey: String = js.native
  /**
    * 存储变量信息
    */
  var gaeaVariables: js.UndefOr[StringDictionary[VariableData]] = js.native
}

object ComponentProps {
  @scala.inline
  def apply(gaeaName: String, gaeaUniqueKey: String): ComponentProps = {
    val __obj = js.Dynamic.literal(gaeaName = gaeaName.asInstanceOf[js.Any], gaeaUniqueKey = gaeaUniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProps]
  }
  @scala.inline
  implicit class ComponentPropsOps[Self <: ComponentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGaeaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGaeaUniqueKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaUniqueKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanDragIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDragIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanDragIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDragIn")(js.undefined)
        ret
    }
    @scala.inline
    def withGaeaData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaeaData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaData")(js.undefined)
        ret
    }
    @scala.inline
    def withGaeaEdit(value: js.Array[ComponentPropsGaeaEdit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaeaEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withGaeaEvent(value: GaeaEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaeaEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withGaeaEventData(value: js.Array[EventData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaEventData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaeaEventData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaEventData")(js.undefined)
        ret
    }
    @scala.inline
    def withGaeaIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaeaIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withGaeaNativeEventData(value: js.Array[EventData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaNativeEventData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaeaNativeEventData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaNativeEventData")(js.undefined)
        ret
    }
    @scala.inline
    def withGaeaPreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaPreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaeaPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaPreview")(js.undefined)
        ret
    }
    @scala.inline
    def withGaeaVariables(value: StringDictionary[VariableData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaeaVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaeaVariables")(js.undefined)
        ret
    }
  }
  
}

