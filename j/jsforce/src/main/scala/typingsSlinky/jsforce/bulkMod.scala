package typingsSlinky.jsforce

import typingsSlinky.jsforce.batchMod.Batch
import typingsSlinky.jsforce.batchMod.BatchResultInfo
import typingsSlinky.jsforce.connectionMod.Connection
import typingsSlinky.jsforce.jobMod.Job
import typingsSlinky.jsforce.jsforceStrings.Parallel
import typingsSlinky.jsforce.jsforceStrings.Serial
import typingsSlinky.jsforce.recordMod.Record
import typingsSlinky.jsforce.recordResultMod.RecordResult
import typingsSlinky.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bulkMod {
  
  @JSImport("jsforce/bulk", "Bulk")
  @js.native
  class Bulk protected () extends StObject {
    def this(connection: Connection) = this()
    
    def createJob(`type`: String, operation: String): Job = js.native
    def createJob(`type`: String, operation: String, options: BulkOptions): Job = js.native
    
    def job(id: String): Job = js.native
    
    def load(`type`: String, operation: BulkLoadOperation): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: js.UndefOr[scala.Nothing],
      input: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: js.UndefOr[scala.Nothing], input: String): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: js.UndefOr[scala.Nothing],
      input: String,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: js.UndefOr[scala.Nothing],
      input: js.Array[Record[_]]
    ): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: js.UndefOr[scala.Nothing],
      input: js.Array[Record[_]],
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: js.UndefOr[scala.Nothing], input: Stream): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: js.UndefOr[scala.Nothing],
      input: Stream,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: BulkOptions,
      input: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions, input: String): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: BulkOptions,
      input: String,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions, input: js.Array[Record[_]]): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: BulkOptions,
      input: js.Array[Record[_]],
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions, input: Stream): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: BulkOptions,
      input: Stream,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    
    var pollInterval: Double = js.native
    
    var pollTimeout: Double = js.native
    
    def query(soql: String): js.Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jsforce.jsforceStrings.insert
    - typingsSlinky.jsforce.jsforceStrings.update
    - typingsSlinky.jsforce.jsforceStrings.upsert
    - typingsSlinky.jsforce.jsforceStrings.delete
    - typingsSlinky.jsforce.jsforceStrings.hardDelete
  */
  trait BulkLoadOperation extends StObject
  object BulkLoadOperation {
    
    @scala.inline
    def delete: typingsSlinky.jsforce.jsforceStrings.delete = "delete".asInstanceOf[typingsSlinky.jsforce.jsforceStrings.delete]
    
    @scala.inline
    def hardDelete: typingsSlinky.jsforce.jsforceStrings.hardDelete = "hardDelete".asInstanceOf[typingsSlinky.jsforce.jsforceStrings.hardDelete]
    
    @scala.inline
    def insert: typingsSlinky.jsforce.jsforceStrings.insert = "insert".asInstanceOf[typingsSlinky.jsforce.jsforceStrings.insert]
    
    @scala.inline
    def update: typingsSlinky.jsforce.jsforceStrings.update = "update".asInstanceOf[typingsSlinky.jsforce.jsforceStrings.update]
    
    @scala.inline
    def upsert: typingsSlinky.jsforce.jsforceStrings.upsert = "upsert".asInstanceOf[typingsSlinky.jsforce.jsforceStrings.upsert]
  }
  
  @js.native
  trait BulkOptions extends StObject {
    
    var concurrencyMode: js.UndefOr[Serial | Parallel] = js.native
    
    var extIdField: String = js.native
  }
  object BulkOptions {
    
    @scala.inline
    def apply(extIdField: String): BulkOptions = {
      val __obj = js.Dynamic.literal(extIdField = extIdField.asInstanceOf[js.Any])
      __obj.asInstanceOf[BulkOptions]
    }
    
    @scala.inline
    implicit class BulkOptionsMutableBuilder[Self <: BulkOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrencyMode(value: Serial | Parallel): Self = StObject.set(x, "concurrencyMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyModeUndefined: Self = StObject.set(x, "concurrencyMode", js.undefined)
      
      @scala.inline
      def setExtIdField(value: String): Self = StObject.set(x, "extIdField", value.asInstanceOf[js.Any])
    }
  }
}
