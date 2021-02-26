package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Command
import typingsSlinky.cesium.mod.ImageryProvider
import typingsSlinky.cesium.mod.ProviderViewModel.CreationFunction
import typingsSlinky.cesium.mod.TerrainProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Category extends StObject {
  
  var category: js.UndefOr[String] = js.native
  
  var creationFunction: CreationFunction | Command = js.native
  
  var iconUrl: String = js.native
  
  var name: String = js.native
  
  var tooltip: String = js.native
}
object Category {
  
  @scala.inline
  def apply(creationFunction: CreationFunction | Command, iconUrl: String, name: String, tooltip: String): Category = {
    val __obj = js.Dynamic.literal(creationFunction = creationFunction.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  @scala.inline
  implicit class CategoryMutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCreationFunction(value: CreationFunction | Command): Self = StObject.set(x, "creationFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationFunctionFunction0(value: () => ImageryProvider | TerrainProvider | (js.Array[ImageryProvider | TerrainProvider])): Self = StObject.set(x, "creationFunction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
