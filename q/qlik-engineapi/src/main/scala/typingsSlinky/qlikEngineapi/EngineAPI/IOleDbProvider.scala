package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OleDbProvider...
  */
@js.native
trait IOleDbProvider extends js.Object {
  /**
    * This parameter is optional. Default is false.
    * Is set to true if the version of the OLEDB provider is 32-bit.
    */
  var qBit32: js.UndefOr[Boolean] = js.native
  /**
    * Description of the OLEDB provider.
    */
  var qDescription: String = js.native
  /**
    * Name of the OLEDB provider.
    */
  var qName: String = js.native
}

object IOleDbProvider {
  @scala.inline
  def apply(qDescription: String, qName: String): IOleDbProvider = {
    val __obj = js.Dynamic.literal(qDescription = qDescription.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOleDbProvider]
  }
  @scala.inline
  implicit class IOleDbProviderOps[Self <: IOleDbProvider] (val x: Self) extends AnyVal {
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
  }
  
}

