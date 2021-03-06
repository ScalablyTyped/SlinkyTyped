package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scheme extends Object {
  
  /**
    * The suggested [featureReduction.clusterMinSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterMinSize) required to fit labels within clusters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#Scheme)
    */
  var clusterMinSize: Double = js.native
  
  /**
    * The name of the aggregate field the labeling scheme is based on.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#Scheme)
    */
  var fieldName: String = js.native
  
  /**
    * An array of LabelClass objects to set on the layer's [featureReduction.labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelingInfo) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#Scheme)
    */
  var labelingInfo: js.Array[LabelClass] = js.native
  
  /**
    * The name of the generated cluster labeling scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#Scheme)
    */
  var name: String = js.native
}
object Scheme {
  
  @scala.inline
  def apply(
    clusterMinSize: Double,
    constructor: js.Function,
    fieldName: String,
    hasOwnProperty: PropertyKey => Boolean,
    labelingInfo: js.Array[LabelClass],
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): Scheme = {
    val __obj = js.Dynamic.literal(clusterMinSize = clusterMinSize.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), labelingInfo = labelingInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[Scheme]
  }
  
  @scala.inline
  implicit class SchemeMutableBuilder[Self <: Scheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterMinSize(value: Double): Self = StObject.set(x, "clusterMinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelingInfo(value: js.Array[LabelClass]): Self = StObject.set(x, "labelingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelingInfoVarargs(value: LabelClass*): Self = StObject.set(x, "labelingInfo", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
