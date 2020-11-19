package typingsSlinky.reactMdDivider

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdDivider.dividerMod.DividerElement
import typingsSlinky.reactMdDivider.dividerMod.DividerProps
import typingsSlinky.reactMdDivider.verticalDividerMod.VerticalDividerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/divider", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Divider: ForwardRefExoticComponent[DividerProps with RefAttributes[DividerElement]] = js.native
  
  /**
    * This component is used to create a vertical divider based on a parent
    * element's height. This is really only needed when the parent element **has no
    * defined height**.  If there is a defined height, this component is not worth
    * much as the height can be computed in css as normal. This really just fixes
    * the issue that the height would be set to `auto` (which computes to 0 most of
    * the time) when it is not set on a parent element.
    */
  val VerticalDivider: ForwardRefExoticComponent[VerticalDividerProps with RefAttributes[HTMLDivElement]] = js.native
}
