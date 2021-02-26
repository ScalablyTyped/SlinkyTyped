package typingsSlinky.reactNavigationCore

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Context
import typingsSlinky.reactNavigationCore.typesMod.NavigationProp
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationContextMod extends Shortcut {
  
  /**
    * Context which holds the navigation prop for a screen.
    */
  @JSImport("@react-navigation/core/lib/typescript/src/NavigationContext", JSImport.Default)
  @js.native
  val default: Context[
    js.UndefOr[
      NavigationProp[Record[String, js.UndefOr[js.Object]], String, js.Any, js.Any, js.Object]
    ]
  ] = js.native
  
  type _To = Context[
    js.UndefOr[
      NavigationProp[Record[String, js.UndefOr[js.Object]], String, js.Any, js.Any, js.Object]
    ]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `navigationContextMod.foo` */
  override def _to: Context[
    js.UndefOr[
      NavigationProp[Record[String, js.UndefOr[js.Object]], String, js.Any, js.Any, js.Object]
    ]
  ] = default
}
