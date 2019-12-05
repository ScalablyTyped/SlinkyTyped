package typingsSlinky.atBlueprintjsCore.libEsmComponentsButtonAbstractButtonMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.atBlueprintjsCore.Anon_Button
import typingsSlinky.atBlueprintjsCore.Anon_ClassName
import typingsSlinky.atBlueprintjsCore.Anon_IsActive
import typingsSlinky.atBlueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typingsSlinky.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/button/abstractButton", "AbstractButton")
@js.native
abstract class AbstractButton[H /* <: HTMLAttributes[_] */] ()
  extends AbstractPureComponent2[IButtonProps with H, IButtonState, js.Object] {
  var buttonRef: HTMLElement = js.native
  var currentKeyDown: js.Any = js.native
  var refHandlers: Anon_Button = js.native
  @JSName("state")
  var state_AbstractButton: Anon_IsActive = js.native
  /* protected */ def getCommonButtonProps(): Anon_ClassName[H] = js.native
  /* protected */ def handleKeyDown(e: SyntheticKeyboardEvent[_]): Unit = js.native
  /* protected */ def handleKeyUp(e: SyntheticKeyboardEvent[_]): Unit = js.native
  /* protected */ def renderChildren(): TagMod[Any] = js.native
}

