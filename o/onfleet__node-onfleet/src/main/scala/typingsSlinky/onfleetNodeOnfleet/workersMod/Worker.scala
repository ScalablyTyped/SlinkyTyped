package typingsSlinky.onfleetNodeOnfleet.workersMod

import typingsSlinky.onfleetNodeOnfleet.anon.Entries
import typingsSlinky.onfleetNodeOnfleet.anon.Tasks
import typingsSlinky.onfleetNodeOnfleet.anon.Workers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Worker extends js.Object {
  
  def create(worker: CreateWorkerProps): js.Promise[OnfleetWorker] = js.native
  
  def deleteOne(id: String): js.Promise[Unit] = js.native
  
  def get(): js.Promise[js.Array[OnfleetWorker]] = js.native
  def get(id: String): js.Promise[OnfleetWorker] = js.native
  def get(id: String, query: GetWorkerQueryProps): js.Promise[OnfleetWorker] = js.native
  
  def getByLocation(location: GetWorkerByLocationProps): js.Promise[Workers] = js.native
  
  def getSchedule(id: String): js.Promise[Entries] = js.native
  
  def insertTask(id: String, obj: Tasks): js.Promise[OnfleetWorker] = js.native
  
  def setSchedule(id: String, schedule: WorkerSchedule): js.Promise[Entries] = js.native
  
  def update(id: String, worker: UpdateWorkerProps): js.Promise[OnfleetWorker] = js.native
}
