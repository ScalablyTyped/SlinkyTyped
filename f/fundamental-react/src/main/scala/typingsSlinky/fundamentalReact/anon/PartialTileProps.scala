package typingsSlinky.fundamentalReact.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.fundamentalReact.fundamentalReactStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Tile/Tile.TileProps> */
@js.native
trait PartialTileProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var isDouble: js.UndefOr[Boolean] = js.native
  
  var onClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLButtonElement], Unit]] = js.native
  
  var size: js.UndefOr[s] = js.native
}
object PartialTileProps {
  
  @scala.inline
  def apply(): PartialTileProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTileProps]
  }
  
  @scala.inline
  implicit class PartialTilePropsMutableBuilder[Self <: PartialTileProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setIsDouble(value: Boolean): Self = StObject.set(x, "isDouble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDoubleUndefined: Self = StObject.set(x, "isDouble", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* event */ SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setSize(value: s): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
