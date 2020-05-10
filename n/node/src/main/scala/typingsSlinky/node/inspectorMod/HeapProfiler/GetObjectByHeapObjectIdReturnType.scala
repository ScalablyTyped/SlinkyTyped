package typingsSlinky.node.inspectorMod.HeapProfiler

import typingsSlinky.node.inspectorMod.Runtime.RemoteObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectByHeapObjectIdReturnType extends js.Object {
  /**
    * Evaluation result.
    */
  var result: RemoteObject = js.native
}

object GetObjectByHeapObjectIdReturnType {
  @scala.inline
  def apply(result: RemoteObject): GetObjectByHeapObjectIdReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectByHeapObjectIdReturnType]
  }
  @scala.inline
  implicit class GetObjectByHeapObjectIdReturnTypeOps[Self <: GetObjectByHeapObjectIdReturnType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: RemoteObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

