package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typingsSlinky.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typingsSlinky.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * an error specifying the lack of parameters values
  *
  * Usually thrown if someone tries to execute an SQL statement containing parameters which can't be filled by the executing instance.
  */
@js.native
trait ParametersRequest extends ClassifiedInteractionRequest {
  /**
    * specifies the connection on which the statement is to be executed. Somebody handling the request could, e.g., use the connection for determining the
    * identifier quote string, etc.
    */
  var Connection: XConnection = js.native
  /**
    * is the list of parameters requested. The objects returned by the {@link com.sun.star.container.XIndexAccess} have to be property sets describing the
    * respective parameter. For this, the objects have to support the service {@link com.sun.star.sdbcx.Column} .
    */
  var Parameters: XIndexAccess = js.native
}

object ParametersRequest {
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Connection: XConnection,
    Context: XInterface,
    Message: String,
    Parameters: XIndexAccess
  ): ParametersRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Connection = Connection.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRequest]
  }
  @scala.inline
  implicit class ParametersRequestOps[Self <: ParametersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection(value: XConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

