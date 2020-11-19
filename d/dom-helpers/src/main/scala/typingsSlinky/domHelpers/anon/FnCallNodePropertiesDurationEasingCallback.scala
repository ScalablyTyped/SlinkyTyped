package typingsSlinky.domHelpers.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.domHelpers.addEventListenerMod.EventHandler
import typingsSlinky.domHelpers.animateMod.AnimateProperties
import typingsSlinky.domHelpers.animateMod.Cancel
import typingsSlinky.domHelpers.animateMod.Options
import typingsSlinky.domHelpers.domHelpersStrings.transitionend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallNodePropertiesDurationEasingCallback extends js.Object {
  
  def apply(node: HTMLElement, properties: AnimateProperties, duration: Double): Cancel = js.native
  def apply(
    node: HTMLElement,
    properties: AnimateProperties,
    duration: Double,
    callback: EventHandler[transitionend]
  ): Cancel = js.native
  def apply(
    node: HTMLElement,
    properties: AnimateProperties,
    duration: Double,
    easing: String,
    callback: EventHandler[transitionend]
  ): Cancel = js.native
  def apply(options: Options): Cancel = js.native
}
