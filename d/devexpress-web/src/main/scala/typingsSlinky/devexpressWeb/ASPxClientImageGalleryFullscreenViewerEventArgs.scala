package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientImageGallery.FullscreenViewerActiveItemIndexChanged event.
  */
@js.native
trait ASPxClientImageGalleryFullscreenViewerEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the index of the item related to the event.
    */
  var index: Double = js.native
  
  /**
    * Gets the unique identifier name of the item related to the event.
    */
  var name: String = js.native
}
object ASPxClientImageGalleryFullscreenViewerEventArgs {
  
  @scala.inline
  def apply(index: Double, name: String): ASPxClientImageGalleryFullscreenViewerEventArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientImageGalleryFullscreenViewerEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientImageGalleryFullscreenViewerEventArgsMutableBuilder[Self <: ASPxClientImageGalleryFullscreenViewerEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
