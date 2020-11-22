package typingsSlinky.reactNavigationNative

import slinky.core.facade.ReactRef
import typingsSlinky.reactNavigationCore.typesMod.NavigationContainerRef
import typingsSlinky.reactNavigationNative.anon.GetInitialState
import typingsSlinky.reactNavigationNative.typesMod.LinkingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/native/lib/typescript/src/useLinking", JSImport.Namespace)
@js.native
object useLinkingMod extends js.Object {
  
  def default(
    ref: ReactRef[NavigationContainerRef],
    hasEnabledConfigGetStateFromPathGetPathFromState: LinkingOptions
  ): GetInitialState = js.native
}
