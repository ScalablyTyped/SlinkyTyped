package typingsSlinky.reactMdAppBar.appBarActionMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLButtonElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This component is really just a simple wrapper for the `Button` component
  * that adds a few additional styles to prevent the button from shrinking when
  * an `AppBar` has a lot of content.  It also will automatically add spacing
  * either before or after this button when the `first` or `last` props are
  * provided.
  */
@JSImport("@react-md/app-bar/types/AppBarAction", JSImport.Default)
@js.native
object default extends TopLevel[
      ForwardRefExoticComponent[AppBarActionProps with RefAttributes[HTMLButtonElement]]
    ]

