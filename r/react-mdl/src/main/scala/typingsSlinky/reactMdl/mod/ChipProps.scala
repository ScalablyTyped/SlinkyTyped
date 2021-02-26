package typingsSlinky.reactMdl.mod

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChipProps
  extends HTMLProps[js.Any] {
  
  @JSName("onClick")
  var onClick_ChipProps: js.UndefOr[MouseEventHandler[Chip]] = js.native
  
  var onClose: js.UndefOr[MouseEventHandler[Chip]] = js.native
}
object ChipProps {
  
  @scala.inline
  def apply(): ChipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChipProps]
  }
  
  @scala.inline
  implicit class ChipPropsMutableBuilder[Self <: ChipProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[Chip] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnClose(value: SyntheticMouseEvent[Chip] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
  }
}
