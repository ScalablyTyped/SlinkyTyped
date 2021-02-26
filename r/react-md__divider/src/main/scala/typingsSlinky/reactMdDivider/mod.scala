package typingsSlinky.reactMdDivider

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdDivider.dividerMod.DividerElement
import typingsSlinky.reactMdDivider.dividerMod.DividerProps
import typingsSlinky.reactMdDivider.verticalDividerMod.VerticalDividerHeight
import typingsSlinky.reactMdDivider.verticalDividerMod.VerticalDividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/divider", "Divider")
  @js.native
  val Divider: ForwardRefExoticComponent[DividerProps with RefAttributes[DividerElement]] = js.native
  
  @JSImport("@react-md/divider", "VerticalDivider")
  @js.native
  val VerticalDivider: ForwardRefExoticComponent[VerticalDividerProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/divider", "useVerticalDividerHeight")
  @js.native
  def useVerticalDividerHeight(maxHeight: Double): VerticalDividerHeight = js.native
  @JSImport("@react-md/divider", "useVerticalDividerHeight")
  @js.native
  def useVerticalDividerHeight(maxHeight: Double, forwardedRef: Ref[HTMLDivElement | Null]): VerticalDividerHeight = js.native
}
