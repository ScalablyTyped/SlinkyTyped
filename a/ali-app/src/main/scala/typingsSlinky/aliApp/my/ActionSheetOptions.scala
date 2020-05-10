package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.AnonIndex
import typingsSlinky.aliApp.PartialBadge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionSheetOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需飘红选项的数组，数组内部对象字段见下表
  		 */
  var badges: js.UndefOr[js.Array[PartialBadge]] = js.native
  /**
  		 * 取消按钮文案。默认为‘取消’。注：Android平台此字段无效，不会显示取消按钮。
  		 */
  var cancelButtonText: js.UndefOr[String] = js.native
  /**
  		 * （iOS特殊处理）指定按钮的索引号，从0开始，使用场景：需要删除或清除数据等类似场景，默认红色
  		 */
  var destructiveBtnIndex: js.UndefOr[Double] = js.native
  /**
  		 * 菜单按钮文字数组
  		 */
  var items: js.Array[String] = js.native
  /**
  		 * 接口调用成功的回调函数
  		 */
  @JSName("success")
  var success_ActionSheetOptions: js.UndefOr[js.Function1[/* res */ AnonIndex, Unit]] = js.native
  /** 菜单标题 */
  var title: js.UndefOr[String] = js.native
}

object ActionSheetOptions {
  @scala.inline
  def apply(items: js.Array[String]): ActionSheetOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetOptions]
  }
  @scala.inline
  implicit class ActionSheetOptionsOps[Self <: ActionSheetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadges(value: js.Array[PartialBadge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badges")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withDestructiveBtnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destructiveBtnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestructiveBtnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destructiveBtnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ AnonIndex => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

