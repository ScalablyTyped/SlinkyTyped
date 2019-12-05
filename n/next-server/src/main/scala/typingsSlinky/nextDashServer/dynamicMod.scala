package typingsSlinky.nextDashServer

import slinky.core.ReactComponentClass
import typingsSlinky.nextDashServer.distLibDynamicMod.DynamicOptions
import typingsSlinky.nextDashServer.distLibDynamicMod.LoadableFn
import typingsSlinky.nextDashServer.distLibDynamicMod.LoadableOptions
import typingsSlinky.nextDashServer.distLibDynamicMod.Loader
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dynamic", JSImport.Namespace)
@js.native
object dynamicMod extends js.Object {
  def default[P](dynamicOptions: DynamicOptions[P]): ReactComponentClass[P] = js.native
  def default[P](dynamicOptions: DynamicOptions[P], options: DynamicOptions[P]): ReactComponentClass[P] = js.native
  def default[P](dynamicOptions: Loader[P]): ReactComponentClass[P] = js.native
  def default[P](dynamicOptions: Loader[P], options: DynamicOptions[P]): ReactComponentClass[P] = js.native
  def noSSR[P](LoadableInitializer: LoadableFn[P], loadableOptions: LoadableOptions[P]): ReactComponentClass[P] | ReactComponentClass[P] | js.Function0[Element] = js.native
}

