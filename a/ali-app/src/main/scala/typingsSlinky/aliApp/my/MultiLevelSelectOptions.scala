package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.anon.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiLevelSelectOptions
  extends BaseOptions[js.Any, js.Any] {
  						// 标题
  var list: js.UndefOr[js.Array[MultiLevelSelectItem]] = js.native
  		// 选择数据列表
  var name: js.UndefOr[String] = js.native
  						// 条目名称
  var subList: js.UndefOr[js.Array[MultiLevelSelectItem]] = js.native
  	// 子条目列表
  @JSName("success")
  var success_MultiLevelSelectOptions: js.UndefOr[js.Function1[/* res */ Result, Unit]] = js.native
  var title: js.UndefOr[String] = js.native
}

object MultiLevelSelectOptions {
  @scala.inline
  def apply(): MultiLevelSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiLevelSelectOptions]
  }
  @scala.inline
  implicit class MultiLevelSelectOptionsOps[Self <: MultiLevelSelectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: js.Array[MultiLevelSelectItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
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
    def withSubList(value: js.Array[MultiLevelSelectItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subList")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ Result => Unit): Self = {
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

