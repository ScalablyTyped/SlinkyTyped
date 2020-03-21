package typingsSlinky.nextServer.dynamicMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/lib/dynamic", "noSSR")
@js.native
object noSSR extends js.Object {
  def apply[P](LoadableInitializer: LoadableFn[P], loadableOptions: LoadableOptions[P]): ReactComponentClass[P] | ReactComponentClass[P] | js.Function0[ReactElement] = js.native
}

