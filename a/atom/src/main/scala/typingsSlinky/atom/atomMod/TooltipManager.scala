package typingsSlinky.atom.atomMod

import typingsSlinky.atom.Anon_Class
import typingsSlinky.atom.Anon_Item
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipManager extends js.Object {
  def add(target: JQueryCompatible[HTMLElement], options: Anon_Class): Disposable = js.native
  def add(target: JQueryCompatible[HTMLElement], options: Anon_Item): Disposable = js.native
  def add(target: HTMLElement, options: Anon_Class): Disposable = js.native
  /** Add a tooltip to the given element. */
  def add(target: HTMLElement, options: Anon_Item): Disposable = js.native
  /** Find the tooltips that have been applied to the given element. */
  def findTooltips(target: org.scalajs.dom.raw.HTMLElement): js.Array[Tooltip] = js.native
}

