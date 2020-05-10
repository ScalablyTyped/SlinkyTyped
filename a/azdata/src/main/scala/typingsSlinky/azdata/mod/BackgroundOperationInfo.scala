package typingsSlinky.azdata.mod

import typingsSlinky.azdata.mod.connection.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundOperationInfo extends js.Object {
  /**
  		 * Connection information
  		 */
  var connection: js.UndefOr[Connection] = js.native
  /**
  		 * Operation Description
  		 */
  var description: String = js.native
  /**
  		 * Operation Display Name
  		 */
  var displayName: String = js.native
  /**
  		 * True if the operation is cancelable
  		 */
  var isCancelable: Boolean = js.native
  /**
  		 * The operation id. A unique id will be assigned to it If not specified a
  		 */
  var operationId: js.UndefOr[String] = js.native
  /**
  		 * The actual operation to execute
  		 */
  def operation(operation: BackgroundOperation): Unit = js.native
}

object BackgroundOperationInfo {
  @scala.inline
  def apply(
    description: String,
    displayName: String,
    isCancelable: Boolean,
    operation: BackgroundOperation => Unit
  ): BackgroundOperationInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], isCancelable = isCancelable.asInstanceOf[js.Any], operation = js.Any.fromFunction1(operation))
    __obj.asInstanceOf[BackgroundOperationInfo]
  }
  @scala.inline
  implicit class BackgroundOperationInfoOps[Self <: BackgroundOperationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: BackgroundOperation => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConnection(value: Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(js.undefined)
        ret
    }
  }
  
}

