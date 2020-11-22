package typingsSlinky.reactNavigationCore

import typingsSlinky.react.mod.Context
import typingsSlinky.reactNavigationCore.typesMod.NavigationProp
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/core/lib/typescript/src/NavigationContext", JSImport.Namespace)
@js.native
object navigationContextMod extends js.Object {
  
  /**
    * Context which holds the navigation prop for a screen.
    */
  val default: Context[
    js.UndefOr[
      NavigationProp[Record[String, js.UndefOr[js.Object]], String, js.Any, js.Any, js.Object]
    ]
  ] = js.native
}
