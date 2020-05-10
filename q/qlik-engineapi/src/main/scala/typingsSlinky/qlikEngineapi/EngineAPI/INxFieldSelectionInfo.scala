package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxFieldSelectionInfo...
  */
@js.native
trait INxFieldSelectionInfo extends js.Object {
  /**
    * Selection mode.
    */
  var qFieldSelectionMode: FieldSelectionModeType = js.native
  /**
    * Name of the field.
    */
  var qName: String = js.native
}

object INxFieldSelectionInfo {
  @scala.inline
  def apply(qFieldSelectionMode: FieldSelectionModeType, qName: String): INxFieldSelectionInfo = {
    val __obj = js.Dynamic.literal(qFieldSelectionMode = qFieldSelectionMode.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxFieldSelectionInfo]
  }
  @scala.inline
  implicit class INxFieldSelectionInfoOps[Self <: INxFieldSelectionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQFieldSelectionMode(value: FieldSelectionModeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFieldSelectionMode")(value.asInstanceOf[js.Any])
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

