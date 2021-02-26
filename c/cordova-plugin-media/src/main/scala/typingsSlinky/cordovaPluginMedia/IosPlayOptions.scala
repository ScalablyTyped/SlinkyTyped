package typingsSlinky.cordovaPluginMedia

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  iOS optional parameters for media.play
  *  See https://github.com/apache/cordova-plugin-media#ios-quirks
  */
@js.native
trait IosPlayOptions extends StObject {
  
  var numberOfLoops: js.UndefOr[Double] = js.native
  
  var playAudioWhenScreenIsLocked: js.UndefOr[Boolean] = js.native
}
object IosPlayOptions {
  
  @scala.inline
  def apply(): IosPlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosPlayOptions]
  }
  
  @scala.inline
  implicit class IosPlayOptionsMutableBuilder[Self <: IosPlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberOfLoops(value: Double): Self = StObject.set(x, "numberOfLoops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfLoopsUndefined: Self = StObject.set(x, "numberOfLoops", js.undefined)
    
    @scala.inline
    def setPlayAudioWhenScreenIsLocked(value: Boolean): Self = StObject.set(x, "playAudioWhenScreenIsLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayAudioWhenScreenIsLockedUndefined: Self = StObject.set(x, "playAudioWhenScreenIsLocked", js.undefined)
  }
}
