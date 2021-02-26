package typingsSlinky.reactNativeMaterialUi.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Avatar extends StObject {
  
  var avatar: js.UndefOr[ReactElement] = js.native
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
}
object Avatar {
  
  @scala.inline
  def apply(): Avatar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Avatar]
  }
  
  @scala.inline
  implicit class AvatarMutableBuilder[Self <: Avatar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatar(value: ReactElement): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
  }
}
