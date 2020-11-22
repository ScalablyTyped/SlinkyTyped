package typingsSlinky.reactNavigationCore

import typingsSlinky.react.mod.Context
import typingsSlinky.reactNavigationCore.anon.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/core/lib/typescript/src/CurrentRenderContext", JSImport.Namespace)
@js.native
object currentRenderContextMod extends js.Object {
  
  /**
    * Context which holds the values for the current navigation tree.
    * Intended for use in SSR. This is not safe to use on the client.
    */
  val default: Context[js.UndefOr[Options]] = js.native
}
