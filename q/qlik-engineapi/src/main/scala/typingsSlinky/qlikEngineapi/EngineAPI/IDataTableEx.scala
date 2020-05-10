package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DataTableEx...
  */
@js.native
trait IDataTableEx extends js.Object {
  /**
    * List of the fields in the table.
    */
  var qFields: js.Array[IDataField] = js.native
  /**
    * List of format specification items, within brackets.
    * Examples of specification items:
    *
    *    - file type
    *    - embedded labels, no labels
    *    - table is <table name>
    */
  var qFormatSpec: String = js.native
  /**
    * Name of the table.
    */
  var qName: String = js.native
}

object IDataTableEx {
  @scala.inline
  def apply(qFields: js.Array[IDataField], qFormatSpec: String, qName: String): IDataTableEx = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qFormatSpec = qFormatSpec.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataTableEx]
  }
  @scala.inline
  implicit class IDataTableExOps[Self <: IDataTableEx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQFields(value: js.Array[IDataField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFormatSpec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFormatSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

