package typingsSlinky.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryObjectsParameterType extends js.Object {
  /**
    * Identifier of the prototype to return objects for.
    */
  var prototypeObjectId: RemoteObjectId = js.native
}

object QueryObjectsParameterType {
  @scala.inline
  def apply(prototypeObjectId: RemoteObjectId): QueryObjectsParameterType = {
    val __obj = js.Dynamic.literal(prototypeObjectId = prototypeObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryObjectsParameterType]
  }
  @scala.inline
  implicit class QueryObjectsParameterTypeOps[Self <: QueryObjectsParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrototypeObjectId(value: RemoteObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prototypeObjectId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

