package typingsSlinky.reactMdBadge

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdBadge.badgeContainerMod.BadgeContainerProps
import typingsSlinky.reactMdBadge.badgeMod.BadgeProps
import typingsSlinky.reactMdBadge.badgedButtonMod.BadgedButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/badge", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * This component is generally used for displaying notifications with a count
    * relative to another element with the `BadgeContainer` component. However, it
    * can be used by itself to display any subpplementary content if needed.
    */
  val Badge: ForwardRefExoticComponent[BadgeProps with RefAttributes[HTMLSpanElement]] = js.native
  
  /**
    * This is a really simple component that will just allow you to position a
    * badge relative to another component.
    */
  val BadgeContainer: ForwardRefExoticComponent[BadgeContainerProps with RefAttributes[HTMLSpanElement]] = js.native
  
  /**
    * This is a small wrapper for the `Button` component that will automatically
    * apply the `aria-describedby` attribute when it has been "badged". It also
    * adds some reasonable defaults for the most common use-case for badges:
    * notifications.
    */
  val BadgedButton: ForwardRefExoticComponent[BadgedButtonProps with RefAttributes[HTMLButtonElement]] = js.native
}
