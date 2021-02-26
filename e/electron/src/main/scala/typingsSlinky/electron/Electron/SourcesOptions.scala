package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourcesOptions extends StObject {
  
  /**
    * Set to true to enable fetching window icons. The default value is false. When
    * false the appIcon property of the sources return null. Same if a source has the
    * type screen.
    */
  var fetchWindowIcons: js.UndefOr[Boolean] = js.native
  
  /**
    * The size that the media source thumbnail should be scaled to. Default is `150` x
    * `150`. Set width or height to 0 when you do not need the thumbnails. This will
    * save the processing time required for capturing the content of each window and
    * screen.
    */
  var thumbnailSize: js.UndefOr[Size] = js.native
  
  /**
    * An array of Strings that lists the types of desktop sources to be captured,
    * available types are `screen` and `window`.
    */
  var types: js.Array[String] = js.native
}
object SourcesOptions {
  
  @scala.inline
  def apply(types: js.Array[String]): SourcesOptions = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourcesOptions]
  }
  
  @scala.inline
  implicit class SourcesOptionsMutableBuilder[Self <: SourcesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetchWindowIcons(value: Boolean): Self = StObject.set(x, "fetchWindowIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchWindowIconsUndefined: Self = StObject.set(x, "fetchWindowIcons", js.undefined)
    
    @scala.inline
    def setThumbnailSize(value: Size): Self = StObject.set(x, "thumbnailSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailSizeUndefined: Self = StObject.set(x, "thumbnailSize", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
