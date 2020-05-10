package typingsSlinky.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @experimental
  */
@js.native
trait CustomPreview extends js.Object {
  var bindRemoteObjectFunctionId: RemoteObjectId = js.native
  var configObjectId: js.UndefOr[RemoteObjectId] = js.native
  var formatterObjectId: RemoteObjectId = js.native
  var hasBody: Boolean = js.native
  var header: String = js.native
}

object CustomPreview {
  @scala.inline
  def apply(
    bindRemoteObjectFunctionId: RemoteObjectId,
    formatterObjectId: RemoteObjectId,
    hasBody: Boolean,
    header: String
  ): CustomPreview = {
    val __obj = js.Dynamic.literal(bindRemoteObjectFunctionId = bindRemoteObjectFunctionId.asInstanceOf[js.Any], formatterObjectId = formatterObjectId.asInstanceOf[js.Any], hasBody = hasBody.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPreview]
  }
  @scala.inline
  implicit class CustomPreviewOps[Self <: CustomPreview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindRemoteObjectFunctionId(value: RemoteObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindRemoteObjectFunctionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatterObjectId(value: RemoteObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigObjectId(value: RemoteObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configObjectId")(js.undefined)
        ret
    }
  }
  
}

