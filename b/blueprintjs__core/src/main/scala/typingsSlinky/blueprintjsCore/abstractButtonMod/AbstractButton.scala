package typingsSlinky.blueprintjsCore.abstractButtonMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.blueprintjsCore.anon.Button
import typingsSlinky.blueprintjsCore.anon.ClassName
import typingsSlinky.blueprintjsCore.anon.IsActive
import typingsSlinky.blueprintjsCore.commonMod.AbstractPureComponent2
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/button/abstractButton", "AbstractButton")
@js.native
abstract class AbstractButton[H /* <: HTMLAttributes[_] */] ()
  extends AbstractPureComponent2[IButtonProps with H, IButtonState, js.Object] {
  var buttonRef: HTMLElement = js.native
  var currentKeyDown: js.Any = js.native
  var refHandlers: Button = js.native
  @JSName("state")
  var state_AbstractButton: IsActive = js.native
  /* protected */ def getCommonButtonProps(): ClassName[H] = js.native
  /* protected */ def handleKeyDown(e: SyntheticKeyboardEvent[_]): Unit = js.native
  /* protected */ def handleKeyUp(e: SyntheticKeyboardEvent[_]): Unit = js.native
  /* protected */ def renderChildren(): TagMod[Any] = js.native
}

