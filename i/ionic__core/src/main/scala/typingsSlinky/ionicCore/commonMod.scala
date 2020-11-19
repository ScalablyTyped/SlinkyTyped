package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/core/dist/types/utils/input-shims/hacks/common", JSImport.Namespace)
@js.native
object commonMod extends js.Object {
  
  def isFocused(input: HTMLInputElement): Boolean = js.native
  def isFocused(input: HTMLTextAreaElement): Boolean = js.native
  
  def relocateInput(componentEl: HTMLElement, inputEl: HTMLInputElement, shouldRelocate: Boolean): Unit = js.native
  def relocateInput(
    componentEl: HTMLElement,
    inputEl: HTMLInputElement,
    shouldRelocate: Boolean,
    inputRelativeY: Double
  ): Unit = js.native
  def relocateInput(componentEl: HTMLElement, inputEl: HTMLTextAreaElement, shouldRelocate: Boolean): Unit = js.native
  def relocateInput(
    componentEl: HTMLElement,
    inputEl: HTMLTextAreaElement,
    shouldRelocate: Boolean,
    inputRelativeY: Double
  ): Unit = js.native
}
