package typingsSlinky.reactNavigationRouters

import typingsSlinky.reactNavigationRouters.anon.Key
import typingsSlinky.reactNavigationRouters.anon.KeyParams
import typingsSlinky.reactNavigationRouters.anon.Merge
import typingsSlinky.reactNavigationRouters.anon.Name
import typingsSlinky.reactNavigationRouters.anon.Params
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersBooleans.`false`
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.GO_BACK
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.NAVIGATE
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.RESET
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.SET_PARAMS
import typingsSlinky.reactNavigationRouters.reactNavigationRoutersStrings.key
import typingsSlinky.reactNavigationRouters.typesMod.NavigationState
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import typingsSlinky.reactNavigationRouters.typesMod.PartialRoute
import typingsSlinky.reactNavigationRouters.typesMod.Route
import typingsSlinky.std.Extract
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonActionsMod {
  
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", "goBack")
  @js.native
  def goBack(): Action = js.native
  
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", "navigate")
  @js.native
  def navigate(name: String): Action = js.native
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", "navigate")
  @js.native
  def navigate(name: String, params: js.Object): Action = js.native
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", "navigate")
  @js.native
  def navigate(route: KeyParams): Action = js.native
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", "navigate")
  @js.native
  def navigate(route: Name): Action = js.native
  
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", "reset")
  @js.native
  def reset(): Action = js.native
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", "reset")
  @js.native
  def reset(state: ResetState): Action = js.native
  
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", "setParams")
  @js.native
  def setParams(params: js.Object): Action = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNavigationRouters.anon.Source
    - typingsSlinky.reactNavigationRouters.anon.Payload
    - typingsSlinky.reactNavigationRouters.anon.Target
    - typingsSlinky.reactNavigationRouters.anon.Type
  */
  trait Action extends StObject
  object Action {
    
    @scala.inline
    def Payload(payload: Key | Merge, `type`: NAVIGATE): typingsSlinky.reactNavigationRouters.anon.Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactNavigationRouters.anon.Payload]
    }
    
    @scala.inline
    def Source(`type`: GO_BACK): typingsSlinky.reactNavigationRouters.anon.Source = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactNavigationRouters.anon.Source]
    }
    
    @scala.inline
    def Target(`type`: RESET): typingsSlinky.reactNavigationRouters.anon.Target = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactNavigationRouters.anon.Target]
    }
    
    @scala.inline
    def Type(payload: Params, `type`: SET_PARAMS): typingsSlinky.reactNavigationRouters.anon.Type = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactNavigationRouters.anon.Type]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNavigationRouters.anon.PartialStateNavigationSta
    - typingsSlinky.reactNavigationRouters.typesMod.NavigationState[typingsSlinky.reactNavigationRouters.typesMod.ParamListBase]
    - typingsSlinky.reactNavigationRouters.anon.OmitNavigationStateParamL
  */
  type ResetState = _ResetState | NavigationState[ParamListBase]
  
  trait _ResetState extends StObject
  object _ResetState {
    
    @scala.inline
    def OmitNavigationStateParamL(
      index: Double,
      key: String,
      routeNames: js.Array[
          Extract[
            /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
            String
          ]
        ],
      routes: js.Array[Omit[Route[String, js.UndefOr[js.Object]], key]],
      stale: `false`,
      `type`: String
    ): typingsSlinky.reactNavigationRouters.anon.OmitNavigationStateParamL = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactNavigationRouters.anon.OmitNavigationStateParamL]
    }
    
    @scala.inline
    def PartialStateNavigationSta(
      routes: js.Array[
          PartialRoute[
            Route[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase, string>>[number] */ js.Any, 
              js.UndefOr[js.Object]
            ]
          ]
        ]
    ): typingsSlinky.reactNavigationRouters.anon.PartialStateNavigationSta = {
      val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactNavigationRouters.anon.PartialStateNavigationSta]
    }
  }
}
