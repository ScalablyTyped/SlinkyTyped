package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter with a single operand.
  */
@js.native
trait SchemaUnaryFilter extends js.Object {
  /**
    * The field to which to apply the operator.
    */
  var field: js.UndefOr[SchemaFieldReference] = js.native
  /**
    * The unary operator to apply.
    */
  var op: js.UndefOr[String] = js.native
}

object SchemaUnaryFilter {
  @scala.inline
  def apply(): SchemaUnaryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnaryFilter]
  }
  @scala.inline
  implicit class SchemaUnaryFilterOps[Self <: SchemaUnaryFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: SchemaFieldReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withOp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(js.undefined)
        ret
    }
  }
  
}

