package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DataField...
  */
@js.native
trait IDataField extends js.Object {
  /**
    * Is set to true if the field is a primary key.
    */
  var qIsKey: Boolean = js.native
  /**
    * Name of the field.
    *
    */
  var qName: String = js.native
  /**
    * Is shown for fixed records.
    * qOriginalFieldName and qName are identical if no field names are used in the file.
    * qOriginalFieldName differs from qName if embedded file names are used in the file.
    */
  var qOriginalFieldName: String = js.native
}

object IDataField {
  @scala.inline
  def apply(qIsKey: Boolean, qName: String, qOriginalFieldName: String): IDataField = {
    val __obj = js.Dynamic.literal(qIsKey = qIsKey.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qOriginalFieldName = qOriginalFieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataField]
  }
  @scala.inline
  implicit class IDataFieldOps[Self <: IDataField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQIsKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQOriginalFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOriginalFieldName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

