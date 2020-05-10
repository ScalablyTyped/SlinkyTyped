package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OdbcDsn...
  */
@js.native
trait IOdbcDsn extends js.Object {
  /**
    * This parameter is optional. Default is false.
    * Is set to true if the version of ODBC is 32-bit.
    */
  var qBit32: js.UndefOr[Boolean] = js.native
  /**
    * Description of the ODBC connection.
    */
  var qDescription: String = js.native
  /**
    * Name of the ODBC connection.
    */
  var qName: String = js.native
  /**
    * This parameter is optional. Default is false.
    * Is set to true if the connection is User DSN.
    * The connection works only for a specific user.
    */
  var qUserOnly: js.UndefOr[Boolean] = js.native
}

object IOdbcDsn {
  @scala.inline
  def apply(qDescription: String, qName: String): IOdbcDsn = {
    val __obj = js.Dynamic.literal(qDescription = qDescription.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOdbcDsn]
  }
  @scala.inline
  implicit class IOdbcDsnOps[Self <: IOdbcDsn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQBit32(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qBit32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQBit32: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qBit32")(js.undefined)
        ret
    }
    @scala.inline
    def withQUserOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qUserOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQUserOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qUserOnly")(js.undefined)
        ret
    }
  }
  
}

