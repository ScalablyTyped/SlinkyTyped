package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxListobjectExpressionDef extends js.Object {
  var qExpr: String = js.native
  var qLibraryId: String = js.native
}

object NxListobjectExpressionDef {
  @scala.inline
  def apply(qExpr: String, qLibraryId: String): NxListobjectExpressionDef = {
    val __obj = js.Dynamic.literal(qExpr = qExpr.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxListobjectExpressionDef]
  }
  @scala.inline
  implicit class NxListobjectExpressionDefOps[Self <: NxListobjectExpressionDef] (val x: Self) extends AnyVal {
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

