package typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOperation extends js.Object {
  /**
    * Operation id
    */
  var id: String = js.native
  /**
    * Operation name
    */
  var name: String = js.native
  /**
    * Parent operation id
    */
  var parentId: String = js.native
  /**
    * Root operation id
    */
  var rootId: String = js.native
  /**
    * Synthetic source of the operation
    */
  var syntheticSource: String = js.native
}

object IOperation {
  @scala.inline
  def apply(id: String, name: String, parentId: String, rootId: String, syntheticSource: String): IOperation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any], syntheticSource = syntheticSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOperation]
  }
  @scala.inline
  implicit class IOperationOps[Self <: IOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyntheticSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syntheticSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

