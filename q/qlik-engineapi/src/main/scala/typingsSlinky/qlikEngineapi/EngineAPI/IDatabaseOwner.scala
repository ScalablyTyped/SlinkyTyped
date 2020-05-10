package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DatabaseOwner...
  */
@js.native
trait IDatabaseOwner extends js.Object {
  /**
    * Name of the owner
    */
  var qName: String = js.native
}

object IDatabaseOwner {
  @scala.inline
  def apply(qName: String): IDatabaseOwner = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatabaseOwner]
  }
  @scala.inline
  implicit class IDatabaseOwnerOps[Self <: IDatabaseOwner] (val x: Self) extends AnyVal {
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
  }
  
}

