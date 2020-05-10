package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericHyperCubeProperties width extend GenericObjectProperties
  */
@js.native
trait IGenericHyperCubeProperties extends IGenericObjectProperties {
  var qHyperCubeDef: IVisualizationHyperCubeDef = js.native
}

object IGenericHyperCubeProperties {
  @scala.inline
  def apply(qHyperCubeDef: IVisualizationHyperCubeDef, qInfo: INxInfo): IGenericHyperCubeProperties = {
    val __obj = js.Dynamic.literal(qHyperCubeDef = qHyperCubeDef.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericHyperCubeProperties]
  }
  @scala.inline
  implicit class IGenericHyperCubePropertiesOps[Self <: IGenericHyperCubeProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQHyperCubeDef(value: IVisualizationHyperCubeDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qHyperCubeDef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

