package typingsSlinky.antd.uploadInterfaceMod

import typingsSlinky.antd.anon.Percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadChangeParam[T /* <: js.Object */] extends js.Object {
  var event: js.UndefOr[Percent] = js.native
  var file: T = js.native
  var fileList: js.Array[UploadFile[_]] = js.native
}

object UploadChangeParam {
  @scala.inline
  def apply[T](file: T, fileList: js.Array[UploadFile[_]]): UploadChangeParam[T] = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadChangeParam[T]]
  }
  @scala.inline
  implicit class UploadChangeParamOps[Self[t] <: UploadChangeParam[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFile(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileList(value: js.Array[UploadFile[_]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: Percent): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
  }
  
}

