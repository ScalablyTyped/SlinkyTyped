package typingsSlinky.atom.anon

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.atom.mod.CommandEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Description[TargetType /* <: EventTarget */] extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  def didDispatch(event: CommandEvent[TargetType]): Unit | js.Promise[Unit] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var hiddenInCommandPalette: js.UndefOr[Boolean] = js.native
}
object Description {
  
  @scala.inline
  def apply[TargetType /* <: EventTarget */](didDispatch: CommandEvent[TargetType] => Unit | js.Promise[Unit]): Description[TargetType] = {
    val __obj = js.Dynamic.literal(didDispatch = js.Any.fromFunction1(didDispatch))
    __obj.asInstanceOf[Description[TargetType]]
  }
  
  @scala.inline
  implicit class DescriptionMutableBuilder[Self <: Description[_], TargetType /* <: EventTarget */] (val x: Self with Description[TargetType]) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDidDispatch(value: CommandEvent[TargetType] => Unit | js.Promise[Unit]): Self = StObject.set(x, "didDispatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setHiddenInCommandPalette(value: Boolean): Self = StObject.set(x, "hiddenInCommandPalette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenInCommandPaletteUndefined: Self = StObject.set(x, "hiddenInCommandPalette", js.undefined)
  }
}
