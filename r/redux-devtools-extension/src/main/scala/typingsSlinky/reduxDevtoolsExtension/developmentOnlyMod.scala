package typingsSlinky.reduxDevtoolsExtension

import typingsSlinky.redux.mod.StoreEnhancer
import typingsSlinky.reduxDevtoolsExtension.anon.FnCall
import typingsSlinky.reduxDevtoolsExtension.mod.EnhancerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object developmentOnlyMod {
  
  @JSImport("redux-devtools-extension/developmentOnly", "composeWithDevTools")
  @js.native
  def composeWithDevTools(options: EnhancerOptions): FnCall = js.native
  @JSImport("redux-devtools-extension/developmentOnly", "composeWithDevTools")
  @js.native
  def composeWithDevTools[StoreExt, StateExt](funcs: (StoreEnhancer[StoreExt, js.Object])*): StoreEnhancer[StoreExt, js.Object] = js.native
  
  @JSImport("redux-devtools-extension/developmentOnly", "devToolsEnhancer")
  @js.native
  def devToolsEnhancer(options: EnhancerOptions): StoreEnhancer[_, js.Object] = js.native
}
