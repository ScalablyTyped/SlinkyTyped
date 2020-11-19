package typingsSlinky.reactMdBadge

import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/badge/types/BadgeContainer", JSImport.Namespace)
@js.native
object badgeContainerMod extends js.Object {
  
  /**
    * This is a really simple component that will just allow you to position a
    * badge relative to another component.
    */
  val default: ForwardRefExoticComponent[BadgeContainerProps with RefAttributes[HTMLSpanElement]] = js.native
  
  type BadgeContainerProps = HTMLAttributes[HTMLSpanElement]
}
