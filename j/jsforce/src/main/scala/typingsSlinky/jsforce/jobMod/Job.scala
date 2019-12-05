package typingsSlinky.jsforce.jobMod

import typingsSlinky.jsforce.batchMod.Batch
import typingsSlinky.jsforce.batchMod.BatchInfo
import typingsSlinky.jsforce.bulkMod.Bulk
import typingsSlinky.jsforce.bulkMod.BulkOptions
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/job", "Job")
@js.native
class Job protected () extends EventEmitter {
  def this(bulk: Bulk) = this()
  def this(bulk: Bulk, `type`: String) = this()
  def this(bulk: Bulk, `type`: String, operation: String) = this()
  def this(bulk: Bulk, `type`: String, operation: String, options: BulkOptions) = this()
  def this(bulk: Bulk, `type`: String, operation: String, options: BulkOptions, jobId: String) = this()
  def abort(): js.Promise[_] = js.native
  def abort(callback: js.Function2[/* err */ js.Error, /* jobInfo */ JobInfo, Unit]): js.Promise[_] = js.native
  def batch(batchId: String): Batch = js.native
  def check(): js.Promise[JobInfo] = js.native
  def check(callback: js.Function2[/* err */ js.Error, /* jobInfo */ JobInfo, Unit]): js.Promise[JobInfo] = js.native
  def close(): js.Promise[JobInfo] = js.native
  def close(callback: js.Function2[/* err */ js.Error, /* jobInfo */ JobInfo, Unit]): js.Promise[JobInfo] = js.native
  def createBatch(): Batch = js.native
  def info(): js.Promise[JobInfo] = js.native
  def info(callback: js.Function2[/* err */ js.Error, /* jobInfo */ JobInfo, Unit]): js.Promise[JobInfo] = js.native
  def list(): js.Promise[js.Array[BatchInfo]] = js.native
  def list(callback: js.Function2[/* err */ js.Error, /* jobInfo */ BatchInfo, Unit]): js.Promise[js.Array[BatchInfo]] = js.native
  def open(): js.Promise[JobInfo] = js.native
  def open(callback: js.Function2[/* err */ js.Error, /* jobInfo */ JobInfo, Unit]): js.Promise[JobInfo] = js.native
}

