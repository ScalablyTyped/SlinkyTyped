package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.commonMod.common.IErrorCallback
import typingsSlinky.mendixmodelsdk.commonMod.common.IVoidCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas", JSImport.Namespace)
@js.native
object deltasMod extends js.Object {
  @js.native
  class DeltaManager protected ()
    extends typingsSlinky.mendixmodelsdk.deltaManagerMod.DeltaManager {
    def this(model: AbstractModel) = this()
  }
  
  @js.native
  class DeltaProcessor protected ()
    extends typingsSlinky.mendixmodelsdk.deltaProcessorMod.DeltaProcessor {
    def this(model: AbstractModel) = this()
  }
  
  @js.native
  class DeltaSender protected ()
    extends typingsSlinky.mendixmodelsdk.deltaSenderMod.DeltaSender {
    def this(model: AbstractModel, flushCallback: IVoidCallback, errorCallback: IErrorCallback) = this()
  }
  
}

