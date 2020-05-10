package typingsSlinky.libxmljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExternalId extends js.Object {
  var externalId: String = js.native
  var name: String = js.native
  var systemId: String = js.native
}

object AnonExternalId {
  @scala.inline
  def apply(externalId: String, name: String, systemId: String): AnonExternalId = {
    val __obj = js.Dynamic.literal(externalId = externalId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExternalId]
  }
  @scala.inline
  implicit class AnonExternalIdOps[Self <: AnonExternalId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

