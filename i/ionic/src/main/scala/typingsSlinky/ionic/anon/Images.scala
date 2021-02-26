package typingsSlinky.ionic.anon

import typingsSlinky.ionic.definitionsMod.ResourcesImageConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Images extends StObject {
  
  var images: js.Array[ResourcesImageConfig] = js.native
  
  var nodeAttributes: js.Array[String] = js.native
  
  var nodeName: String = js.native
}
object Images {
  
  @scala.inline
  def apply(images: js.Array[ResourcesImageConfig], nodeAttributes: js.Array[String], nodeName: String): Images = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], nodeAttributes = nodeAttributes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Images]
  }
  
  @scala.inline
  implicit class ImagesMutableBuilder[Self <: Images] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImages(value: js.Array[ResourcesImageConfig]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: ResourcesImageConfig*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setNodeAttributes(value: js.Array[String]): Self = StObject.set(x, "nodeAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeAttributesVarargs(value: String*): Self = StObject.set(x, "nodeAttributes", js.Array(value :_*))
    
    @scala.inline
    def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
  }
}
