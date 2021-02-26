package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IGenericHyperCubePropertiesMutableBuilder[Self <: IGenericHyperCubeProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQHyperCubeDef(value: IVisualizationHyperCubeDef): Self = StObject.set(x, "qHyperCubeDef", value.asInstanceOf[js.Any])
  }
}
