package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericDimensionProperties width extend GenericProperties
  */
@js.native
trait IGenericDimensionProperties extends IGenericProperties {
  var qDim: INxLibraryDimensionDef = js.native
}

object IGenericDimensionProperties {
  @scala.inline
  def apply(qDim: INxLibraryDimensionDef, qInfo: INxInfo): IGenericDimensionProperties = {
    val __obj = js.Dynamic.literal(qDim = qDim.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericDimensionProperties]
  }
  @scala.inline
  implicit class IGenericDimensionPropertiesOps[Self <: IGenericDimensionProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDim(value: INxLibraryDimensionDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDim")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

