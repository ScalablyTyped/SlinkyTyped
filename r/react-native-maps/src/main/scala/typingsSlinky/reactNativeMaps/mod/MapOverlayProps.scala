package typingsSlinky.reactNativeMaps.mod

import typingsSlinky.reactNative.mod.ImageRequireSource
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapOverlayProps extends ViewProps {
  
  var bounds: js.Tuple2[Coordinate, Coordinate] = js.native
  
  var image: js.UndefOr[ImageURISource | ImageRequireSource] = js.native
}
object MapOverlayProps {
  
  @scala.inline
  def apply(bounds: js.Tuple2[Coordinate, Coordinate]): MapOverlayProps = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOverlayProps]
  }
  
  @scala.inline
  implicit class MapOverlayPropsMutableBuilder[Self <: MapOverlayProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: js.Tuple2[Coordinate, Coordinate]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: ImageURISource | ImageRequireSource): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
