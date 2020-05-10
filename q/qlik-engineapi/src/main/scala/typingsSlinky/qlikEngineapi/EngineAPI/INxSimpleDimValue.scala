package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxSimpleDimValue..
  */
@js.native
trait INxSimpleDimValue extends js.Object {
  /**
    * Element number.
    */
  var qElemNo: Double = js.native
  /**
    * Text related to the attribute expression value.
    * This property is optional. No text is returned if the attribute expression value is a numeric.
    */
  var qText: js.UndefOr[String] = js.native
}

object INxSimpleDimValue {
  @scala.inline
  def apply(qElemNo: Double): INxSimpleDimValue = {
    val __obj = js.Dynamic.literal(qElemNo = qElemNo.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxSimpleDimValue]
  }
  @scala.inline
  implicit class INxSimpleDimValueOps[Self <: INxSimpleDimValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQElemNo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qElemNo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qText")(js.undefined)
        ret
    }
  }
  
}

