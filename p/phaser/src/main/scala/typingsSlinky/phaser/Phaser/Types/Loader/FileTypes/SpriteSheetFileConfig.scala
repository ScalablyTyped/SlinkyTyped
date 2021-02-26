package typingsSlinky.phaser.Phaser.Types.Loader.FileTypes

import typingsSlinky.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpriteSheetFileConfig extends StObject {
  
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[String] = js.native
  
  /**
    * The frame configuration object.
    */
  var frameConfig: js.UndefOr[ImageFrameConfig] = js.native
  
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: String = js.native
  
  /**
    * The filename of an associated normal map. It uses the same path and url to load as the image.
    */
  var normalMap: js.UndefOr[String] = js.native
  
  /**
    * The absolute or relative URL to load the file from.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.native
}
object SpriteSheetFileConfig {
  
  @scala.inline
  def apply(key: String): SpriteSheetFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSheetFileConfig]
  }
  
  @scala.inline
  implicit class SpriteSheetFileConfigMutableBuilder[Self <: SpriteSheetFileConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setFrameConfig(value: ImageFrameConfig): Self = StObject.set(x, "frameConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameConfigUndefined: Self = StObject.set(x, "frameConfig", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalMap(value: String): Self = StObject.set(x, "normalMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalMapUndefined: Self = StObject.set(x, "normalMap", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "xhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrSettingsUndefined: Self = StObject.set(x, "xhrSettings", js.undefined)
  }
}
