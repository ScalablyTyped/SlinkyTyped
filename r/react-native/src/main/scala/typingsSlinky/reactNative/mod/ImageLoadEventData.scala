package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageLoadEventData extends ImageLoadEventDataAndroid {
  
  var source: Url = js.native
}
object ImageLoadEventData {
  
  @scala.inline
  def apply(source: Url): ImageLoadEventData = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLoadEventData]
  }
  
  @scala.inline
  implicit class ImageLoadEventDataMutableBuilder[Self <: ImageLoadEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Url): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
