package typingsSlinky.nextServer

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.nextServer.dynamicMod.DynamicOptions
import typingsSlinky.nextServer.dynamicMod.LoadableFn
import typingsSlinky.nextServer.dynamicMod.LoadableOptions
import typingsSlinky.nextServer.dynamicMod.Loader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dynamic", JSImport.Namespace)
@js.native
object nextServerDynamicMod extends js.Object {
  def default[P](dynamicOptions: DynamicOptions[P]): ReactComponentClass[P] = js.native
  def default[P](dynamicOptions: DynamicOptions[P], options: DynamicOptions[P]): ReactComponentClass[P] = js.native
  def default[P](dynamicOptions: Loader[P]): ReactComponentClass[P] = js.native
  def default[P](dynamicOptions: Loader[P], options: DynamicOptions[P]): ReactComponentClass[P] = js.native
  def noSSR[P](LoadableInitializer: LoadableFn[P], loadableOptions: LoadableOptions[P]): ReactComponentClass[P] | ReactComponentClass[P] | js.Function0[ReactElement] = js.native
}

