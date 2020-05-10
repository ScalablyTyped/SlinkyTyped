package typingsSlinky.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryTarget extends js.Object {
  var parent: js.UndefOr[String] = js.native
  var structuredQuery: js.UndefOr[StructuredQuery] = js.native
}

object QueryTarget {
  @scala.inline
  def apply(): QueryTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTarget]
  }
  @scala.inline
  implicit class QueryTargetOps[Self <: QueryTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withStructuredQuery(value: StructuredQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuredQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructuredQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuredQuery")(js.undefined)
        ret
    }
  }
  
}

