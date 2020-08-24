package typingsSlinky.blueprintjsCore

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLButtonElement
import typingsSlinky.blueprintjsCore.abstractButtonMod.AbstractButton
import typingsSlinky.blueprintjsCore.refsMod.IRefObject
import typingsSlinky.react.mod.AnchorHTMLAttributes
import typingsSlinky.react.mod.ButtonHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/button/buttons", JSImport.Namespace)
@js.native
object buttonsMod extends js.Object {
  @js.native
  class AnchorButton () extends AbstractButton[AnchorHTMLAttributes[HTMLAnchorElement]] {
    @JSName("buttonRef")
    var buttonRef_AnchorButton: HTMLAnchorElement | IRefObject[HTMLAnchorElement] | Null = js.native
    var handleRef: IRefObject[HTMLAnchorElement] | (js.Function1[/* ref */ HTMLAnchorElement | Null, Unit]) = js.native
  }
  
  @js.native
  class Button () extends AbstractButton[ButtonHTMLAttributes[HTMLButtonElement]] {
    @JSName("buttonRef")
    var buttonRef_Button: HTMLButtonElement | IRefObject[HTMLButtonElement] | Null = js.native
    var handleRef: IRefObject[HTMLButtonElement] | (js.Function1[/* ref */ HTMLButtonElement | Null, Unit]) = js.native
  }
  
  /* static members */
  @js.native
  object AnchorButton extends js.Object {
    var displayName: String = js.native
  }
  
  /* static members */
  @js.native
  object Button extends js.Object {
    var displayName: String = js.native
  }
  
}

