package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.custom
import typingsSlinky.electron.electronStrings.error
import typingsSlinky.electron.electronStrings.info
import typingsSlinky.electron.electronStrings.none
import typingsSlinky.electron.electronStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayBalloonOptions extends StObject {
  
  var content: String = js.native
  
  /**
    * Icon to use when `iconType` is `custom`.
    */
  var icon: js.UndefOr[NativeImage_ | String] = js.native
  
  /**
    * Can be `none`, `info`, `warning`, `error` or `custom`. Default is `custom`.
    */
  var iconType: js.UndefOr[none | info | warning | error | custom] = js.native
  
  /**
    * The large version of the icon should be used. Default is `true`. Maps to
    * `NIIF_LARGE_ICON`.
    */
  var largeIcon: js.UndefOr[Boolean] = js.native
  
  /**
    * Do not play the associated sound. Default is `false`. Maps to `NIIF_NOSOUND`.
    */
  var noSound: js.UndefOr[Boolean] = js.native
  
  /**
    * Do not display the balloon notification if the current user is in "quiet time".
    * Default is `false`. Maps to `NIIF_RESPECT_QUIET_TIME`.
    */
  var respectQuietTime: js.UndefOr[Boolean] = js.native
  
  var title: String = js.native
}
object DisplayBalloonOptions {
  
  @scala.inline
  def apply(content: String, title: String): DisplayBalloonOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayBalloonOptions]
  }
  
  @scala.inline
  implicit class DisplayBalloonOptionsMutableBuilder[Self <: DisplayBalloonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: NativeImage_ | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconType(value: none | info | warning | error | custom): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLargeIcon(value: Boolean): Self = StObject.set(x, "largeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeIconUndefined: Self = StObject.set(x, "largeIcon", js.undefined)
    
    @scala.inline
    def setNoSound(value: Boolean): Self = StObject.set(x, "noSound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSoundUndefined: Self = StObject.set(x, "noSound", js.undefined)
    
    @scala.inline
    def setRespectQuietTime(value: Boolean): Self = StObject.set(x, "respectQuietTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespectQuietTimeUndefined: Self = StObject.set(x, "respectQuietTime", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
