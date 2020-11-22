package typingsSlinky.reactNavigationCore

import typingsSlinky.react.mod.Context
import typingsSlinky.reactNavigationCore.typesMod.NavigationHelpers
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/core/lib/typescript/src/NavigationHelpersContext", JSImport.Namespace)
@js.native
object navigationHelpersContextMod extends js.Object {
  
  /**
    * Context which holds the navigation helpers of the parent navigator.
    * Navigators should use this context in their view component.
    */
  val default: Context[js.UndefOr[NavigationHelpers[Record[String, js.UndefOr[js.Object]], js.Object]]] = js.native
}
