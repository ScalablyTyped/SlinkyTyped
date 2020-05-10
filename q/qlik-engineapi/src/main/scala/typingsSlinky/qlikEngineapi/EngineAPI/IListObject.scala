package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renders the properties of a list object. Is the layout for ListObjectDef.
  * For more information about the definition of a list object, see Generic objects.
  *
  * Note: ListObject is used by the GetLayout method to display the properties of a list object.
  */
@js.native
trait IListObject extends js.Object {
  /**
    * Set of data.
    * Is empty if nothing has been defined in qInitialDataFetch in ListObjectDef.
    */
  var qDataPages: js.Array[INxDataPage] = js.native
  /**
    * Information about the dimension.
    */
  var qDimensionInfo: INxDimensionInfo = js.native
  /**
    * This parameter is optional and is displayed in case of error.
    */
  var qError: js.UndefOr[INxValidationError] = js.native
  /**
    * Lists the expressions in the list object.
    */
  var qExpressions: js.Array[INxListObjectExpression] = js.native
  /**
    * Defines the size of a list object.
    */
  var qSize: ISize = js.native
  /**
    * Name of the alternate state.
    * Default is current selections $.
    */
  var qStateName: String = js.native
}

object IListObject {
  @scala.inline
  def apply(
    qDataPages: js.Array[INxDataPage],
    qDimensionInfo: INxDimensionInfo,
    qExpressions: js.Array[INxListObjectExpression],
    qSize: ISize,
    qStateName: String
  ): IListObject = {
    val __obj = js.Dynamic.literal(qDataPages = qDataPages.asInstanceOf[js.Any], qDimensionInfo = qDimensionInfo.asInstanceOf[js.Any], qExpressions = qExpressions.asInstanceOf[js.Any], qSize = qSize.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListObject]
  }
  @scala.inline
  implicit class IListObjectOps[Self <: IListObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDataPages(value: js.Array[INxDataPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDataPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDimensionInfo(value: INxDimensionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDimensionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQExpressions(value: js.Array[INxListObjectExpression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSize(value: ISize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQStateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQError(value: INxValidationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qError")(js.undefined)
        ret
    }
  }
  
}

