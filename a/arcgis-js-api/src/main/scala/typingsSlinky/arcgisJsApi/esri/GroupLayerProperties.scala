package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.exclusive
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.independent
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.inherited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupLayerProperties
  extends LayerProperties
     with LayersMixinProperties
     with TablesMixinProperties
     with PortalLayerProperties
     with BlendLayerProperties {
  
  /**
    * Indicates how to manage the visibility of the children layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#visibilityMode)
    */
  var visibilityMode: js.UndefOr[independent | inherited | exclusive] = js.native
}
object GroupLayerProperties {
  
  @scala.inline
  def apply(): GroupLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLayerProperties]
  }
  
  @scala.inline
  implicit class GroupLayerPropertiesMutableBuilder[Self <: GroupLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisibilityMode(value: independent | inherited | exclusive): Self = StObject.set(x, "visibilityMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityModeUndefined: Self = StObject.set(x, "visibilityMode", js.undefined)
  }
}
