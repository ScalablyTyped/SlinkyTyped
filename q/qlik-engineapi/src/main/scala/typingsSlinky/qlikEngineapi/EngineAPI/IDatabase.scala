package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database...
  */
@js.native
trait IDatabase extends js.Object {
  /**
    * Is set to true if the database is set by default.
    */
  var qIsDefault: Boolean = js.native
  /**
    * Name of the database.
    */
  var qName: String = js.native
}

object IDatabase {
  @scala.inline
  def apply(qIsDefault: Boolean, qName: String): IDatabase = {
    val __obj = js.Dynamic.literal(qIsDefault = qIsDefault.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatabase]
  }
  @scala.inline
  implicit class IDatabaseOps[Self <: IDatabase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsDefault")(value.asInstanceOf[js.Any])
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

