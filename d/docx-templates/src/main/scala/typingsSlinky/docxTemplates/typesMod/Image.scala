package typingsSlinky.docxTemplates.typesMod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends StObject {
  
  var data: Buffer | js.typedarray.ArrayBuffer | String = js.native
  
  var extension: ImageExtension = js.native
}
object Image {
  
  @scala.inline
  def apply(data: Buffer | js.typedarray.ArrayBuffer | String, extension: ImageExtension): Image = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Buffer | js.typedarray.ArrayBuffer | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: ImageExtension): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
  }
}
