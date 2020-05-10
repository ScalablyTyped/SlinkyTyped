package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAttrExprDef...
  */
@js.native
trait INxAttrExprDef extends js.Object {
  /**
    * Definition of the attribute expression.
    * Example: "Max(OrderID)"
    */
  var qExpression: String = js.native
  /**
    * Definition of the attribute expression stored in the library..
    * Example: "MyGenericMeasure"
    */
  var qLibraryId_ : String = js.native
}

object INxAttrExprDef {
  @scala.inline
  def apply(qExpression: String, qLibraryId_ : String): INxAttrExprDef = {
    val __obj = js.Dynamic.literal(qExpression = qExpression.asInstanceOf[js.Any], qLibraryId_ = qLibraryId_.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttrExprDef]
  }
  @scala.inline
  implicit class INxAttrExprDefOps[Self <: INxAttrExprDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLibraryId_(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLibraryId_")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

