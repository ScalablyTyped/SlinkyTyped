package typingsSlinky.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanoramaOptions extends StObject {
  
  var albumsControl: js.UndefOr[Boolean] = js.native
  
  var albumsControlOptions: js.UndefOr[AlbumsControlOptions] = js.native
  
  var indoorSceneSwitchControl: js.UndefOr[Boolean] = js.native
  
  var linksControl: js.UndefOr[Boolean] = js.native
  
  var navigationControl: js.UndefOr[Boolean] = js.native
}
object PanoramaOptions {
  
  @scala.inline
  def apply(): PanoramaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanoramaOptions]
  }
  
  @scala.inline
  implicit class PanoramaOptionsMutableBuilder[Self <: PanoramaOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbumsControl(value: Boolean): Self = StObject.set(x, "albumsControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumsControlOptions(value: AlbumsControlOptions): Self = StObject.set(x, "albumsControlOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumsControlOptionsUndefined: Self = StObject.set(x, "albumsControlOptions", js.undefined)
    
    @scala.inline
    def setAlbumsControlUndefined: Self = StObject.set(x, "albumsControl", js.undefined)
    
    @scala.inline
    def setIndoorSceneSwitchControl(value: Boolean): Self = StObject.set(x, "indoorSceneSwitchControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndoorSceneSwitchControlUndefined: Self = StObject.set(x, "indoorSceneSwitchControl", js.undefined)
    
    @scala.inline
    def setLinksControl(value: Boolean): Self = StObject.set(x, "linksControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksControlUndefined: Self = StObject.set(x, "linksControl", js.undefined)
    
    @scala.inline
    def setNavigationControl(value: Boolean): Self = StObject.set(x, "navigationControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationControlUndefined: Self = StObject.set(x, "navigationControl", js.undefined)
  }
}
