package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.distCommonMod.common.IErrorCallback
import typingsSlinky.mendixmodelsdk.distCommonMod.common.IVoidCallback
import typingsSlinky.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas", JSImport.Namespace)
@js.native
object distSdkInternalDeltasMod extends js.Object {
  @js.native
  class DeltaManager protected ()
    extends typingsSlinky.mendixmodelsdk.distSdkInternalDeltasDeltaManagerMod.DeltaManager {
    def this(model: AbstractModel) = this()
  }
  
  @js.native
  class DeltaProcessor protected ()
    extends typingsSlinky.mendixmodelsdk.distSdkInternalDeltasDeltaProcessorMod.DeltaProcessor {
    def this(model: AbstractModel) = this()
  }
  
  @js.native
  class DeltaSender protected ()
    extends typingsSlinky.mendixmodelsdk.distSdkInternalDeltasDeltaSenderMod.DeltaSender {
    def this(model: AbstractModel, flushCallback: IVoidCallback, errorCallback: IErrorCallback) = this()
  }
  
}

