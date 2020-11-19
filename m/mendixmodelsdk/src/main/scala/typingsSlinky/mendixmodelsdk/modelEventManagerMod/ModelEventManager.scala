package typingsSlinky.mendixmodelsdk.modelEventManagerMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.deltaManagerMod.IDeltaManager
import typingsSlinky.mendixmodelsdk.deltasMod.DeltaProcessor
import typingsSlinky.mendixmodelsdk.imodeleventMod.IDeltaEvent
import typingsSlinky.mendixmodelsdk.modelEventReceiverMod.ModelEventReceiver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/model-events/ModelEventManager", "ModelEventManager")
@js.native
class ModelEventManager protected () extends IModelEventManager {
  def this(
    model: AbstractModel,
    deltaManager: IDeltaManager,
    deltaProcessor: DeltaProcessor,
    workingCopyId: String,
    currentEventId: Double
  ) = this()
  
  var currentEventId: js.Any = js.native
  
  var deltaProcessor: js.Any = js.native
  
  var eventEmitter: js.Any = js.native
  
  var eventQueue: js.Any = js.native
  
  var eventReceiver: ModelEventReceiver = js.native
  
  var loadUnitResults: js.Any = js.native
  
  var modelChanged: js.Any = js.native
  
  var onNewDelta: js.Any = js.native
  
  var pendingUnits: js.Any = js.native
  
  var processEventsQueue: js.Any = js.native
  
  var processLoadedUnits: js.Any = js.native
  
  def scheduleEvent(deltaEvent: IDeltaEvent): Unit = js.native
}
