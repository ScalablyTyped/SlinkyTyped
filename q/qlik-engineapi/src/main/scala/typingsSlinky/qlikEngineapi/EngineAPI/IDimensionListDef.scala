package typingsSlinky.qlikEngineapi.EngineAPI

import typingsSlinky.qlikEngineapi.qlikEngineapiStrings.dimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the lists of dimensions.
  */
@js.native
trait IDimensionListDef extends js.Object {
  /**
    * Data type JSON
    */
  var qData: js.Any = js.native
  /**
    * Type of the list
    */
  var qType: dimension = js.native
}

object IDimensionListDef {
  @scala.inline
  def apply(qData: js.Any, qType: dimension): IDimensionListDef = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDimensionListDef]
  }
  @scala.inline
  implicit class IDimensionListDefOps[Self <: IDimensionListDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQType(value: dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

