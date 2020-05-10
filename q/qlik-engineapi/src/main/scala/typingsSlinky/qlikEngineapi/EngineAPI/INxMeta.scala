package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * NxMeta...
  */
@js.native
trait INxMeta extends js.Object {
  /**
    * Name.
    * >> This property is optional.
    */
  var qName: js.UndefOr[String] = js.native
}

object INxMeta {
  @scala.inline
  def apply(): INxMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INxMeta]
  }
  @scala.inline
  implicit class INxMetaOps[Self <: INxMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(js.undefined)
        ret
    }
  }
  
}

