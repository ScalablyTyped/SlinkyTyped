package typingsSlinky.atom.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atom.anon.Class
import typingsSlinky.atom.anon.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipManager extends StObject {
  
  def add(target: HTMLElement, options: Class): Disposable = js.native
  /** Add a tooltip to the given element. */
  def add(target: HTMLElement, options: Item): Disposable = js.native
  def add(target: JQueryCompatible[HTMLElement], options: Class): Disposable = js.native
  def add(target: JQueryCompatible[HTMLElement], options: Item): Disposable = js.native
  
  /** Find the tooltips that have been applied to the given element. */
  def findTooltips(target: HTMLElement): js.Array[Tooltip] = js.native
}
