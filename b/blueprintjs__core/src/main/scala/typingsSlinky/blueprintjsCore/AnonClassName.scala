package typingsSlinky.blueprintjsCore

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName[H /* <: HTMLAttributes[_] */] extends js.Object {
  var className: String
  var disabled: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['loading'] */ js.Any
  var onClick: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any
  var tabIndex: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any
  def onKeyDown(e: SyntheticKeyboardEvent[_]): Unit
  def onKeyUp(e: SyntheticKeyboardEvent[_]): Unit
  def ref(ref: HTMLElement): Unit
}

object AnonClassName {
  @scala.inline
  def apply[H /* <: HTMLAttributes[_] */](
    className: String,
    disabled: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['loading'] */ js.Any,
    onClick: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any,
    onKeyDown: SyntheticKeyboardEvent[_] => Unit,
    onKeyUp: SyntheticKeyboardEvent[_] => Unit,
    ref: HTMLElement => Unit,
    tabIndex: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any
  ): AnonClassName[H] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), ref = js.Any.fromFunction1(ref), tabIndex = tabIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClassName[H]]
  }
}

