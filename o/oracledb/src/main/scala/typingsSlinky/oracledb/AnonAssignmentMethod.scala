package typingsSlinky.oracledb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAssignmentMethod extends js.Object {
  /**
    * Method used to assign keys to objects that are inserted into the collection.
    *
    * @default UUID
    */
  var assignmentMethod: js.UndefOr[String] = js.native
  /**
    * Maximum length of the key column in bytes. This component applies only to keys of type VARCHAR2.
    *
    * @default 255
    */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * Name of the column that stores the document key.
    *
    * @default ID
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Name of the database sequence that generates keys for documents that are inserted into a collection if
    * the key assignment method is SEQUENCE.
    *
    * If you specify the key assignment method as SEQUENCE then you must also specify the name of that sequence.
    * If the specified sequence does not exist then SODA creates it.
    */
  var sequenceName: js.UndefOr[String] = js.native
  /**
    * SQL data type of the column that stores the document key.
    *
    * @default VARCHAR2
    */
  var sqlType: js.UndefOr[String] = js.native
}

object AnonAssignmentMethod {
  @scala.inline
  def apply(): AnonAssignmentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAssignmentMethod]
  }
  @scala.inline
  implicit class AnonAssignmentMethodOps[Self <: AnonAssignmentMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignmentMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignmentMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignmentMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignmentMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSequenceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequenceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceName")(js.undefined)
        ret
    }
    @scala.inline
    def withSqlType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sqlType")(js.undefined)
        ret
    }
  }
  
}

