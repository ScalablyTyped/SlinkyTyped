package typingsSlinky.mendixmodelsdk.distSdkInternalModelDashEventsModelEventManagerMod

import typingsSlinky.mendixmodelsdk.distCommonMod.common.IErrorCallback
import typingsSlinky.mendixmodelsdk.distCommonMod.common.IVoidCallback
import typingsSlinky.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalDeltasDeltaManagerMod.IDeltaManager
import typingsSlinky.mendixmodelsdk.distSdkInternalDeltasMod.DeltaProcessor
import typingsSlinky.mendixmodelsdk.distSdkInternalModelDashEventsIModelEventMod.IModelEvent
import typingsSlinky.mendixmodelsdk.distSdkInternalModelDashEventsModelEventReceiverMod.ModelEventReceiver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /* CompleteClass */
  override def loadUnitCompleted(eventId: Double, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
  /* CompleteClass */
  override def loadUnitStarted(): Unit = js.native
  /* CompleteClass */
  override def onEventProcessed(callback: IVoidCallback): Unit = js.native
  def scheduleEvent(modelEvent: IModelEvent): Unit = js.native
  /* CompleteClass */
  override def start(): Unit = js.native
  /* CompleteClass */
  override def stop(): Unit = js.native
}

