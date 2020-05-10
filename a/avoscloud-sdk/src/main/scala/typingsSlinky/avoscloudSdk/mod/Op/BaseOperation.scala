package typingsSlinky.avoscloudSdk.mod.Op

import typingsSlinky.avoscloudSdk.mod.IBaseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOperation extends IBaseObject {
  def objects(): js.Array[_] = js.native
}

object BaseOperation {
  @scala.inline
  def apply(objects: () => js.Array[_], toJSON: () => js.Any): BaseOperation = {
    val __obj = js.Dynamic.literal(objects = js.Any.fromFunction0(objects), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[BaseOperation]
  }
  @scala.inline
  implicit class BaseOperationOps[Self <: BaseOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjects(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

