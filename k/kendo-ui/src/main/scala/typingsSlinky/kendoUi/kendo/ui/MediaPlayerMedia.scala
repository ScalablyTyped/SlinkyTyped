package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaPlayerMedia extends StObject {
  
  var source: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object MediaPlayerMedia {
  
  @scala.inline
  def apply(): MediaPlayerMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPlayerMedia]
  }
  
  @scala.inline
  implicit class MediaPlayerMediaMutableBuilder[Self <: MediaPlayerMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
