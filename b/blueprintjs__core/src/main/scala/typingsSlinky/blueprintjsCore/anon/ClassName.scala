package typingsSlinky.blueprintjsCore.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassName[H /* <: HTMLAttributes[_] */] extends js.Object {
  var className: String = js.native
  var disabled: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['loading'] */ js.Any = js.native
  var onClick: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any = js.native
  var tabIndex: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any = js.native
  def onKeyDown(e: SyntheticKeyboardEvent[_]): Unit = js.native
  def onKeyUp(e: SyntheticKeyboardEvent[_]): Unit = js.native
  def ref(ref: HTMLElement): Unit = js.native
}

object ClassName {
  @scala.inline
  def apply[H](
    className: String,
    disabled: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['loading'] */ js.Any,
    onClick: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any,
    onKeyDown: SyntheticKeyboardEvent[_] => Unit,
    onKeyUp: SyntheticKeyboardEvent[_] => Unit,
    ref: HTMLElement => Unit,
    tabIndex: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any
  ): ClassName[H] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), ref = js.Any.fromFunction1(ref), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName[H]]
  }
  @scala.inline
  implicit class ClassNameOps[Self[h] <: ClassName[h], H] (val x: Self[H]) extends AnyVal {
    @scala.inline
    def duplicate: Self[H] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[H]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[H] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[H] with Other]
    @scala.inline
    def withClassName(value: String): Self[H] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['loading'] */ js.Any
    ): Self[H] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any
    ): Self[H] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnKeyDown(value: SyntheticKeyboardEvent[_] => Unit): Self[H] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnKeyUp(value: SyntheticKeyboardEvent[_] => Unit): Self[H] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRef(value: HTMLElement => Unit): Self[H] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTabIndex(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any
    ): Self[H] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

