package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxListObjectExpressionDef...
  */
@js.native
trait INxListObjectExpressionDef extends js.Object {
  /**
    * Value of the expression
    */
  var qExpr: String = js.native
  /**
    * Refers to an expression stored in the library.
    */
  var qLibraryId: String = js.native
}

object INxListObjectExpressionDef {
  @scala.inline
  def apply(qExpr: String, qLibraryId: String): INxListObjectExpressionDef = {
    val __obj = js.Dynamic.literal(qExpr = qExpr.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxListObjectExpressionDef]
  }
  @scala.inline
  implicit class INxListObjectExpressionDefOps[Self <: INxListObjectExpressionDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLibraryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLibraryId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

