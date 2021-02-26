package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.commonMod.common.IErrorCallback
import typingsSlinky.mendixmodelsdk.commonMod.common.IVoidCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deltasMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas", "DeltaManager")
  @js.native
  class DeltaManager protected ()
    extends typingsSlinky.mendixmodelsdk.deltaManagerMod.DeltaManager {
    def this(model: AbstractModel) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas", "DeltaProcessor")
  @js.native
  class DeltaProcessor protected ()
    extends typingsSlinky.mendixmodelsdk.deltaProcessorMod.DeltaProcessor {
    def this(model: AbstractModel) = this()
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/deltas", "DeltaSender")
  @js.native
  class DeltaSender protected ()
    extends typingsSlinky.mendixmodelsdk.deltaSenderMod.DeltaSender {
    def this(model: AbstractModel, flushCallback: IVoidCallback, errorCallback: IErrorCallback) = this()
  }
}
