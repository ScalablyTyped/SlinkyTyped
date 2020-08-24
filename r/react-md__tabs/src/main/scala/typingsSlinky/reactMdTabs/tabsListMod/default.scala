package typingsSlinky.reactMdTabs.tabsListMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `TabsList` component is the container for all the individual `Tab`s that
  * should be rendered. This handles adding an active indicator underneath the
  * active tab and animating it to the new location when a new tab becomes
  * active. It also handles the ability update which tab is selected when it has
  * been clicked or updated with keyboard movement.
  *
  * This should probably not be used outside of this package unless a custom
  * implementation is desired.
  */
@JSImport("@react-md/tabs/types/TabsList", JSImport.Default)
@js.native
object default extends TopLevel[ForwardRefExoticComponent[TabsListProps with RefAttributes[HTMLDivElement]]]

