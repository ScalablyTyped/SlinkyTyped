package typingsSlinky.antd

import typingsSlinky.antd.uploadInterfaceMod.UploadListType
import typingsSlinky.antd.uploadInterfaceMod.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccept extends js.Object {
  var accept: String = js.native
  var action: String = js.native
  var beforeUpload: js.Function0[Boolean] = js.native
  var className: String = js.native
  var disabled: Boolean = js.native
  var listType: UploadListType = js.native
  var multiple: Boolean = js.native
  var showUploadList: Boolean = js.native
  var supportServerRender: Boolean = js.native
  var `type`: UploadType = js.native
}

object AnonAccept {
  @scala.inline
  def apply(
    accept: String,
    action: String,
    beforeUpload: () => Boolean,
    className: String,
    disabled: Boolean,
    listType: UploadListType,
    multiple: Boolean,
    showUploadList: Boolean,
    supportServerRender: Boolean,
    `type`: UploadType
  ): AnonAccept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any], beforeUpload = js.Any.fromFunction0(beforeUpload), className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], listType = listType.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], showUploadList = showUploadList.asInstanceOf[js.Any], supportServerRender = supportServerRender.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccept]
  }
  @scala.inline
  implicit class AnonAcceptOps[Self <: AnonAccept] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeUpload(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUpload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListType(value: UploadListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowUploadList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showUploadList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportServerRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportServerRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: UploadType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

