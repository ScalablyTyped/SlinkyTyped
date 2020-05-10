package typingsSlinky.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to configure fields when creating a B-Tree Index.
  */
@js.native
trait BTreeIndexField extends js.Object {
  /** Name of the data type of the targeted-field value, for indexing purposes. */
  var datatype: js.UndefOr[String] = js.native
  /** Specifies the maximum length of the value to index. */
  var maxlength: js.UndefOr[Double] = js.native
  /** Index sorting order, for datatype varchar2 (or one of its synonyms) or number. */
  var order: js.UndefOr[String | Double] = js.native
  /** Path to the targeted field, whose value is expected to be a scalar. */
  var path: String = js.native
}

object BTreeIndexField {
  @scala.inline
  def apply(path: String): BTreeIndexField = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[BTreeIndexField]
  }
  @scala.inline
  implicit class BTreeIndexFieldOps[Self <: BTreeIndexField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatatype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datatype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatatype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datatype")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxlength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxlength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxlength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxlength")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
  }
  
}

