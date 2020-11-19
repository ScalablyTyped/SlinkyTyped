package typingsSlinky.blueprintjsCore.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassName[H /* <: HTMLAttributes[HTMLElement] */] extends js.Object {
  
  var className: String = js.native
  
  var disabled: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['disabled'] */ js.Any = js.native
  
  var onClick: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any = js.native
  
  def onKeyDown(e: SyntheticKeyboardEvent[_]): Unit = js.native
  
  def onKeyUp(e: SyntheticKeyboardEvent[_]): Unit = js.native
  
  var tabIndex: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any = js.native
}
object ClassName {
  
  @scala.inline
  def apply[H /* <: HTMLAttributes[HTMLElement] */](
    className: String,
    disabled: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['disabled'] */ js.Any,
    onClick: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any,
    onKeyDown: SyntheticKeyboardEvent[_] => Unit,
    onKeyUp: SyntheticKeyboardEvent[_] => Unit,
    tabIndex: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any
  ): ClassName[H] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName[H]]
  }
  
  @scala.inline
  implicit class ClassNameOps[Self <: ClassName[_], H /* <: HTMLAttributes[HTMLElement] */] (val x: Self with ClassName[H]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['disabled'] */ js.Any
    ): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any
    ): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[_] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUp(value: SyntheticKeyboardEvent[_] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTabIndex(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any
    ): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
  }
}
