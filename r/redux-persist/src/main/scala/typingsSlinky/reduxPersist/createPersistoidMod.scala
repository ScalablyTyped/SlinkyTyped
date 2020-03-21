package typingsSlinky.reduxPersist

import typingsSlinky.reduxPersist.typesMod.PersistConfig
import typingsSlinky.reduxPersist.typesMod.Persistoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/es/createPersistoid", JSImport.Namespace)
@js.native
object createPersistoidMod extends js.Object {
  def default(config: PersistConfig[_, _, _, _]): Persistoid = js.native
}

