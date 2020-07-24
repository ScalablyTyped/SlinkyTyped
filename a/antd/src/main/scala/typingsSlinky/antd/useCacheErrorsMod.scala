package typingsSlinky.antd

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/form/hooks/useCacheErrors", JSImport.Namespace)
@js.native
object useCacheErrorsMod extends js.Object {
  def default(
    errors: js.Array[ReactElement],
    changeTrigger: js.Function1[/* visible */ Boolean, Unit],
    directly: Boolean
  ): js.Tuple2[Boolean, js.Array[ReactElement]] = js.native
}

