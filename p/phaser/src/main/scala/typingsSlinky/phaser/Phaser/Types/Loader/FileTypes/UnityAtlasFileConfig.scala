package typingsSlinky.phaser.Phaser.Types.Loader.FileTypes

import typingsSlinky.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnityAtlasFileConfig extends StObject {
  
  /**
    * The default file extension to use for the atlas data if no url is provided.
    */
  var atlasExtension: js.UndefOr[String] = js.native
  
  /**
    * The absolute or relative URL to load the atlas data file from.
    */
  var atlasURL: js.UndefOr[String] = js.native
  
  /**
    * Extra XHR Settings specifically for the atlas data file.
    */
  var atlasXhrSettings: js.UndefOr[XHRSettingsObject] = js.native
  
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: String = js.native
  
  /**
    * The filename of an associated normal map. It uses the same path and url to load as the texture image.
    */
  var normalMap: js.UndefOr[String] = js.native
  
  /**
    * The default file extension to use for the image texture if no url is provided.
    */
  var textureExtension: js.UndefOr[String] = js.native
  
  /**
    * The absolute or relative URL to load the texture image file from.
    */
  var textureURL: js.UndefOr[String] = js.native
  
  /**
    * Extra XHR Settings specifically for the texture image file.
    */
  var textureXhrSettings: js.UndefOr[XHRSettingsObject] = js.native
}
object UnityAtlasFileConfig {
  
  @scala.inline
  def apply(key: String): UnityAtlasFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnityAtlasFileConfig]
  }
  
  @scala.inline
  implicit class UnityAtlasFileConfigMutableBuilder[Self <: UnityAtlasFileConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtlasExtension(value: String): Self = StObject.set(x, "atlasExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtlasExtensionUndefined: Self = StObject.set(x, "atlasExtension", js.undefined)
    
    @scala.inline
    def setAtlasURL(value: String): Self = StObject.set(x, "atlasURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtlasURLUndefined: Self = StObject.set(x, "atlasURL", js.undefined)
    
    @scala.inline
    def setAtlasXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "atlasXhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtlasXhrSettingsUndefined: Self = StObject.set(x, "atlasXhrSettings", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalMap(value: String): Self = StObject.set(x, "normalMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalMapUndefined: Self = StObject.set(x, "normalMap", js.undefined)
    
    @scala.inline
    def setTextureExtension(value: String): Self = StObject.set(x, "textureExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureExtensionUndefined: Self = StObject.set(x, "textureExtension", js.undefined)
    
    @scala.inline
    def setTextureURL(value: String): Self = StObject.set(x, "textureURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureURLUndefined: Self = StObject.set(x, "textureURL", js.undefined)
    
    @scala.inline
    def setTextureXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "textureXhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureXhrSettingsUndefined: Self = StObject.set(x, "textureXhrSettings", js.undefined)
  }
}
