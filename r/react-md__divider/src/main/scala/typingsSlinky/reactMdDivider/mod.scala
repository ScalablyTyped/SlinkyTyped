package typingsSlinky.reactMdDivider

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdDivider.dividerMod.DividerElement
import typingsSlinky.reactMdDivider.dividerMod.DividerProps
import typingsSlinky.reactMdDivider.verticalDividerMod.VerticalDividerHeight
import typingsSlinky.reactMdDivider.verticalDividerMod.VerticalDividerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/divider", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Divider: ForwardRefExoticComponent[DividerProps with RefAttributes[DividerElement]] = js.native
  
  val VerticalDivider: ForwardRefExoticComponent[VerticalDividerProps with RefAttributes[HTMLDivElement]] = js.native
  
  def useVerticalDividerHeight(maxHeight: Double): VerticalDividerHeight = js.native
  def useVerticalDividerHeight(maxHeight: Double, forwardedRef: Ref[HTMLDivElement | Null]): VerticalDividerHeight = js.native
}
