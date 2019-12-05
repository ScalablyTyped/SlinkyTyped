package typingsSlinky.atBlueprintjsCore

import typingsSlinky.atBlueprintjsCore.libEsmComponentsButtonAbstractButtonMod.AbstractButton
import typingsSlinky.react.reactMod.AnchorHTMLAttributes
import typingsSlinky.react.reactMod.ButtonHTMLAttributes
import typingsSlinky.std.HTMLAnchorElement
import typingsSlinky.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/button/buttons", JSImport.Namespace)
@js.native
object libEsmComponentsButtonButtonsMod extends js.Object {
  @js.native
  class AnchorButton () extends AbstractButton[AnchorHTMLAttributes[HTMLAnchorElement]]
  
  @js.native
  class Button () extends AbstractButton[ButtonHTMLAttributes[HTMLButtonElement]]
  
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

