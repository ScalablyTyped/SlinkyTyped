package typingsSlinky.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Screen Source Information
  *
  * This interface contains information on the screen source, see [DesktopCapturerSource](https://electronjs.org/docs/api/structures/desktop-capturer-source).
  *
  */
@js.native
trait DesktopCapturerSource extends StObject {
  
  /**
    * ID of the screen source.
    */
  val id: String = js.native
  
  /**
    * Name of the screen source.
    */
  val name: String = js.native
  
  /**
    * Thumbnail of the screen source. See [nativeImage](https://electronjs.org/docs/api/native-image#nativeimage) for supported types.
    */
  val thumbnail: js.Any = js.native
}
object DesktopCapturerSource {
  
  @scala.inline
  def apply(id: String, name: String, thumbnail: js.Any): DesktopCapturerSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesktopCapturerSource]
  }
  
  @scala.inline
  implicit class DesktopCapturerSourceMutableBuilder[Self <: DesktopCapturerSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: js.Any): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
  }
}
