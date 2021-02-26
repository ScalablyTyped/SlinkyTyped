package typingsSlinky.nextServer

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.nextServer.dynamicMod.DynamicOptions
import typingsSlinky.nextServer.dynamicMod.LoadableFn
import typingsSlinky.nextServer.dynamicMod.LoadableOptions
import typingsSlinky.nextServer.dynamicMod.Loader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextServerDynamicMod {
  
  @JSImport("next-server/dynamic", JSImport.Default)
  @js.native
  def default[P](dynamicOptions: DynamicOptions[P]): ReactComponentClass[P] = js.native
  @JSImport("next-server/dynamic", JSImport.Default)
  @js.native
  def default[P](dynamicOptions: DynamicOptions[P], options: DynamicOptions[P]): ReactComponentClass[P] = js.native
  @JSImport("next-server/dynamic", JSImport.Default)
  @js.native
  def default[P](dynamicOptions: Loader[P]): ReactComponentClass[P] = js.native
  @JSImport("next-server/dynamic", JSImport.Default)
  @js.native
  def default[P](dynamicOptions: Loader[P], options: DynamicOptions[P]): ReactComponentClass[P] = js.native
  
  @JSImport("next-server/dynamic", "noSSR")
  @js.native
  def noSSR[P](LoadableInitializer: LoadableFn[P], loadableOptions: LoadableOptions[P]): ReactComponentClass[P] | js.Function0[ReactElement] = js.native
}
