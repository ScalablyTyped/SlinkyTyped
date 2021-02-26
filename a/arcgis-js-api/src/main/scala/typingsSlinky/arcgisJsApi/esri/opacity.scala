package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains a helper method for generating data-driven visualizations with continuous opacity based on data returned from a field value or expression in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html)
  */
@js.native
trait opacity extends StObject {
  
  /**
    * This method generates an opacity visual variable with default alpha values optimally mapped to data values based on the statistics queried for the indicated field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable)
    */
  def createVisualVariable(params: opacityCreateVisualVariableParams): js.Promise[opacityVisualVariableResult] = js.native
}
object opacity {
  
  @scala.inline
  def apply(createVisualVariable: opacityCreateVisualVariableParams => js.Promise[opacityVisualVariableResult]): opacity = {
    val __obj = js.Dynamic.literal(createVisualVariable = js.Any.fromFunction1(createVisualVariable))
    __obj.asInstanceOf[opacity]
  }
  
  @scala.inline
  implicit class opacityMutableBuilder[Self <: opacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateVisualVariable(value: opacityCreateVisualVariableParams => js.Promise[opacityVisualVariableResult]): Self = StObject.set(x, "createVisualVariable", js.Any.fromFunction1(value))
  }
}
