package typingsSlinky.reactNavigationCore.useOnPreventRemoveMod

import typingsSlinky.reactNavigationCore.anon.`12`
import typingsSlinky.reactNavigationCore.anon.`13`
import typingsSlinky.reactNavigationCore.navigationBuilderContextMod.ChildBeforeRemoveListener
import typingsSlinky.reactNavigationCore.typesMod.EventMapCore
import typingsSlinky.reactNavigationCore.useEventEmitterMod.NavigationEventEmitter
import typingsSlinky.reactNavigationRouters.typesMod.NavigationAction
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/core/lib/typescript/src/useOnPreventRemove", "shouldPreventRemove")
@js.native
object shouldPreventRemove extends js.Object {
  
  def apply(
    emitter: NavigationEventEmitter[EventMapCore[_]],
    beforeRemoveListeners: Record[String, js.UndefOr[ChildBeforeRemoveListener]],
    currentRoutes: js.Array[`12`],
    nextRoutes: js.Array[`13`],
    action: NavigationAction
  ): Boolean = js.native
}
