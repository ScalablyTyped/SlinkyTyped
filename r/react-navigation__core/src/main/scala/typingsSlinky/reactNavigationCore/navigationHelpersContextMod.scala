package typingsSlinky.reactNavigationCore

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Context
import typingsSlinky.reactNavigationCore.typesMod.NavigationHelpers
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationHelpersContextMod extends Shortcut {
  
  /**
    * Context which holds the navigation helpers of the parent navigator.
    * Navigators should use this context in their view component.
    */
  @JSImport("@react-navigation/core/lib/typescript/src/NavigationHelpersContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[NavigationHelpers[Record[String, js.UndefOr[js.Object]], js.Object]]] = js.native
  
  type _To = Context[js.UndefOr[NavigationHelpers[Record[String, js.UndefOr[js.Object]], js.Object]]]
  
  /* This means you don't have to write `default`, but can instead just say `navigationHelpersContextMod.foo` */
  override def _to: Context[js.UndefOr[NavigationHelpers[Record[String, js.UndefOr[js.Object]], js.Object]]] = default
}
