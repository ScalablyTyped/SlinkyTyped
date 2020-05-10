package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxLinkedObjectInfo...
  */
@js.native
trait INxLinkedObjectInfo extends js.Object {
  /**
    * Information about the linked object.
    */
  var qInfo: INxInfo = js.native
  /**
    * Identifier of the root object.
    * If the linked object is a child, the root identifier is the identifier of the parent.
    * If the linked object is an app object, the root identifier is the same than the
    * identifier of the linked object since the linked object is a root object.
    */
  var qRootId: String = js.native
}

object INxLinkedObjectInfo {
  @scala.inline
  def apply(qInfo: INxInfo, qRootId: String): INxLinkedObjectInfo = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qRootId = qRootId.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxLinkedObjectInfo]
  }
  @scala.inline
  implicit class INxLinkedObjectInfoOps[Self <: INxLinkedObjectInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQInfo(value: INxInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQRootId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qRootId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

