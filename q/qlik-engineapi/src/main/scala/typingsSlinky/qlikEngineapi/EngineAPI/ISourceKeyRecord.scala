package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SourceKeyRecord...
  */
@js.native
trait ISourceKeyRecord extends js.Object {
  /**
    * Name of the key field.
    */
  var qKeyFields: js.Array[String] = js.native
  /**
    * Table the key belongs to.
    */
  var qTables: js.Array[String] = js.native
}

object ISourceKeyRecord {
  @scala.inline
  def apply(qKeyFields: js.Array[String], qTables: js.Array[String]): ISourceKeyRecord = {
    val __obj = js.Dynamic.literal(qKeyFields = qKeyFields.asInstanceOf[js.Any], qTables = qTables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceKeyRecord]
  }
  @scala.inline
  implicit class ISourceKeyRecordOps[Self <: ISourceKeyRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQKeyFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qKeyFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTables(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

