package typingsSlinky.ionicCore.scrollAssistMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.componentsMod._Global_.HTMLIonContentElement
import typingsSlinky.std.HTMLInputElement
import typingsSlinky.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/input-shims/hacks/scroll-assist", "enableScrollAssist")
@js.native
object enableScrollAssist extends js.Object {
  def apply(
    componentEl: HTMLElement,
    inputEl: HTMLInputElement,
    contentEl: HTMLIonContentElement,
    keyboardHeight: Double
  ): js.Function0[Unit] = js.native
  def apply(
    componentEl: HTMLElement,
    inputEl: HTMLTextAreaElement,
    contentEl: HTMLIonContentElement,
    keyboardHeight: Double
  ): js.Function0[Unit] = js.native
}

