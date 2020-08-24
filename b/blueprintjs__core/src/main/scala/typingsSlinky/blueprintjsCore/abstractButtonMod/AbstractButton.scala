package typingsSlinky.blueprintjsCore.abstractButtonMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.blueprintjsCore.anon.ClassName
import typingsSlinky.blueprintjsCore.anon.IsActive
import typingsSlinky.blueprintjsCore.commonMod.AbstractPureComponent2
import typingsSlinky.blueprintjsCore.refsMod.IRefObject
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/button/abstractButton", "AbstractButton")
@js.native
abstract class AbstractButton[H /* <: HTMLAttributes[HTMLElement] */] ()
  extends AbstractPureComponent2[IButtonProps with H, IButtonState, js.Object] {
  var buttonRef: HTMLElement | IRefObject[HTMLElement] | Null = js.native
  var currentKeyDown: js.Any = js.native
  @JSName("state")
  var state_AbstractButton: IsActive = js.native
  /* protected */ def getCommonButtonProps(): ClassName[H] = js.native
  /* protected */ def handleKeyDown(e: SyntheticKeyboardEvent[_]): Unit = js.native
  /* protected */ def handleKeyUp(e: SyntheticKeyboardEvent[_]): Unit = js.native
  /* protected */ def renderChildren(): ReactElement = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/button/abstractButton", "AbstractButton")
@js.native
object AbstractButton extends js.Object {
  def getDerivedStateFromProps(props: IButtonProps, state: IButtonState): IsActive = js.native
}

