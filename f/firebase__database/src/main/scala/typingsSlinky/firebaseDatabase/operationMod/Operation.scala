package typingsSlinky.firebaseDatabase.operationMod

import typingsSlinky.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operation extends js.Object {
  /**
    * @type {!Path}
    */
  var path: Path = js.native
  /**
    * @type {!OperationSource}
    */
  var source: OperationSource = js.native
  /**
    * @type {!OperationType}
    */
  var `type`: OperationType = js.native
  /**
    * @param {string} childName
    * @return {?Operation}
    */
  def operationForChild(childName: String): Operation | Null = js.native
}

object Operation {
  @scala.inline
  def apply(
    operationForChild: String => Operation | Null,
    path: Path,
    source: OperationSource,
    `type`: OperationType
  ): Operation = {
    val __obj = js.Dynamic.literal(operationForChild = js.Any.fromFunction1(operationForChild), path = path.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperationForChild(value: String => Operation | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationForChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: OperationSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: OperationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

