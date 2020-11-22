package typingsSlinky.jsforce.batchMod

import typingsSlinky.jsforce.recordMod.Record
import typingsSlinky.jsforce.recordResultMod.RecordResult
import typingsSlinky.node.streamMod.Stream
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce/batch", "Batch")
@js.native
class Batch () extends Writable {
  
  def check(): js.Promise[BatchInfo] = js.native
  def check(callback: js.Function1[/* batchInfo */ BatchInfo, Unit]): js.Promise[BatchInfo] = js.native
  
  def execute(): Batch = js.native
  def execute(
    input: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
  ): Batch = js.native
  def execute(input: String): Batch = js.native
  def execute(
    input: String,
    callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
  ): Batch = js.native
  def execute(input: js.Array[Record[_]]): Batch = js.native
  def execute(
    input: js.Array[Record[_]],
    callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
  ): Batch = js.native
  def execute(input: Stream): Batch = js.native
  def execute(
    input: Stream,
    callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
  ): Batch = js.native
  
  def poll(interval: Double, timeout: Double): Unit = js.native
  
  def retrieve(): js.Promise[js.Array[BatchResultInfo | RecordResult]] = js.native
  def retrieve(callback: js.Function1[/* batchInfo */ BatchInfo, Unit]): js.Promise[js.Array[BatchResultInfo | RecordResult]] = js.native
  
  def `then`(): js.Promise[_] = js.native
  
  def thenAll(callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
}
