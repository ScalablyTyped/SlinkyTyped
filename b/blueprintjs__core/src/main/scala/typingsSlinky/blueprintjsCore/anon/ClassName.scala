package typingsSlinky.blueprintjsCore.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassName[H /* <: HTMLAttributes[HTMLElement] */] extends StObject {
  
  var className: String = js.native
  
  var disabled: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['disabled'] */ js.Any
  ] = js.native
  
  def onBlur(e: SyntheticFocusEvent[_]): Unit = js.native
  
  var onClick: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any
  ] = js.native
  
  def onKeyDown(e: SyntheticKeyboardEvent[_]): Unit = js.native
  
  def onKeyUp(e: SyntheticKeyboardEvent[_]): Unit = js.native
  
  var tabIndex: js.UndefOr[
    Double | (/* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any)
  ] = js.native
}
object ClassName {
  
  @scala.inline
  def apply[H /* <: HTMLAttributes[HTMLElement] */](
    className: String,
    onBlur: SyntheticFocusEvent[_] => Unit,
    onKeyDown: SyntheticKeyboardEvent[_] => Unit,
    onKeyUp: SyntheticKeyboardEvent[_] => Unit
  ): ClassName[H] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp))
    __obj.asInstanceOf[ClassName[H]]
  }
  
  @scala.inline
  implicit class ClassNameMutableBuilder[Self <: ClassName[_], H /* <: HTMLAttributes[HTMLElement] */] (val x: Self with ClassName[H]) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['disabled'] */ js.Any
    ): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setOnBlur(value: SyntheticFocusEvent[_] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClick(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any
    ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[_] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUp(value: SyntheticKeyboardEvent[_] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTabIndex(
      value: Double | (/* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any)
    ): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
  }
}
