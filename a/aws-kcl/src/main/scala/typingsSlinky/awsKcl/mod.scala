package typingsSlinky.awsKcl

import typingsSlinky.node.fsMod.ReadStream
import typingsSlinky.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aws-kcl", JSImport.Namespace)
  @js.native
  def apply(recordProcessor: RecordProcessor): KCLManager = js.native
  @JSImport("aws-kcl", JSImport.Namespace)
  @js.native
  def apply(
    recordProcessor: RecordProcessor,
    inputFile: js.UndefOr[scala.Nothing],
    outputFile: js.UndefOr[scala.Nothing],
    errorFile: WriteStream
  ): KCLManager = js.native
  @JSImport("aws-kcl", JSImport.Namespace)
  @js.native
  def apply(recordProcessor: RecordProcessor, inputFile: js.UndefOr[scala.Nothing], outputFile: WriteStream): KCLManager = js.native
  @JSImport("aws-kcl", JSImport.Namespace)
  @js.native
  def apply(
    recordProcessor: RecordProcessor,
    inputFile: js.UndefOr[scala.Nothing],
    outputFile: WriteStream,
    errorFile: WriteStream
  ): KCLManager = js.native
  @JSImport("aws-kcl", JSImport.Namespace)
  @js.native
  def apply(recordProcessor: RecordProcessor, inputFile: ReadStream): KCLManager = js.native
  @JSImport("aws-kcl", JSImport.Namespace)
  @js.native
  def apply(
    recordProcessor: RecordProcessor,
    inputFile: ReadStream,
    outputFile: js.UndefOr[scala.Nothing],
    errorFile: WriteStream
  ): KCLManager = js.native
  @JSImport("aws-kcl", JSImport.Namespace)
  @js.native
  def apply(recordProcessor: RecordProcessor, inputFile: ReadStream, outputFile: WriteStream): KCLManager = js.native
  @JSImport("aws-kcl", JSImport.Namespace)
  @js.native
  def apply(
    recordProcessor: RecordProcessor,
    inputFile: ReadStream,
    outputFile: WriteStream,
    errorFile: WriteStream
  ): KCLManager = js.native
  
  @JSImport("aws-kcl", "KCLManager")
  @js.native
  class KCLManager protected () extends StObject {
    def this(kclManagerInput: KCLInput) = this()
    def this(kclManagerInput: KCLInput, inputFile: ReadStream) = this()
    def this(kclManagerInput: KCLInput, inputFile: js.UndefOr[scala.Nothing], outputFile: WriteStream) = this()
    def this(kclManagerInput: KCLInput, inputFile: ReadStream, outputFile: WriteStream) = this()
    def this(
      kclManagerInput: KCLInput,
      inputFile: js.UndefOr[scala.Nothing],
      outputFile: js.UndefOr[scala.Nothing],
      errorFile: WriteStream
    ) = this()
    def this(
      kclManagerInput: KCLInput,
      inputFile: js.UndefOr[scala.Nothing],
      outputFile: WriteStream,
      errorFile: WriteStream
    ) = this()
    def this(
      kclManagerInput: KCLInput,
      inputFile: ReadStream,
      outputFile: js.UndefOr[scala.Nothing],
      errorFile: WriteStream
    ) = this()
    def this(kclManagerInput: KCLInput, inputFile: ReadStream, outputFile: WriteStream, errorFile: WriteStream) = this()
    
    def checkpoint(sequenceNumber: String): Unit = js.native
    
    def run(): Unit = js.native
  }
  
  type Callback = js.Function0[Unit]
  
  type CheckpointCallback = js.Function2[/* error */ js.UndefOr[String], /* checkpointedSequenceNumber */ String, Unit]
  
  @js.native
  trait CheckpointInput extends StObject {
    
    var checkpointer: Checkpointer = js.native
  }
  object CheckpointInput {
    
    @scala.inline
    def apply(checkpointer: Checkpointer): CheckpointInput = {
      val __obj = js.Dynamic.literal(checkpointer = checkpointer.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckpointInput]
    }
    
    @scala.inline
    implicit class CheckpointInputMutableBuilder[Self <: CheckpointInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckpointer(value: Checkpointer): Self = StObject.set(x, "checkpointer", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Checkpointer extends StObject {
    
    /**
      * Checkpoints at the checkpoint will be at the end of the most
      * recently-delivered list of records.
      * @param callback              Function that is invoked after the checkpoint
      *                              operation completes.
      */
    def checkpoint(callback: CheckpointCallback): Unit = js.native
    /**
      * Checkpoints at a given sequence number.
      * @param sequenceNumber        Sequence number of the record to checkpoint;
      * @param callback              Function that is invoked after the checkpoint operation completes.
      */
    def checkpoint(sequenceNumber: String, callback: CheckpointCallback): Unit = js.native
  }
  
  @js.native
  trait InitializeInput extends StObject {
    
    var sequenceNumber: js.UndefOr[String] = js.native
    
    var shardId: String = js.native
    
    var subSequenceNumber: js.UndefOr[Double] = js.native
  }
  object InitializeInput {
    
    @scala.inline
    def apply(shardId: String): InitializeInput = {
      val __obj = js.Dynamic.literal(shardId = shardId.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitializeInput]
    }
    
    @scala.inline
    implicit class InitializeInputMutableBuilder[Self <: InitializeInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceNumberUndefined: Self = StObject.set(x, "sequenceNumber", js.undefined)
      
      @scala.inline
      def setShardId(value: String): Self = StObject.set(x, "shardId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubSequenceNumber(value: Double): Self = StObject.set(x, "subSequenceNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubSequenceNumberUndefined: Self = StObject.set(x, "subSequenceNumber", js.undefined)
    }
  }
  
  @js.native
  trait KCLInput extends StObject {
    
    var recordProcessor: RecordProcessor = js.native
    
    var version: js.Symbol = js.native
  }
  object KCLInput {
    
    @scala.inline
    def apply(recordProcessor: RecordProcessor, version: js.Symbol): KCLInput = {
      val __obj = js.Dynamic.literal(recordProcessor = recordProcessor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[KCLInput]
    }
    
    @scala.inline
    implicit class KCLInputMutableBuilder[Self <: KCLInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecordProcessor(value: RecordProcessor): Self = StObject.set(x, "recordProcessor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: js.Symbol): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LeaseLossInput extends StObject
  
  @js.native
  trait ProcessRecordsInput extends CheckpointInput {
    
    var millisBehindLatest: js.UndefOr[Double] = js.native
    
    var records: js.Array[Record] = js.native
  }
  object ProcessRecordsInput {
    
    @scala.inline
    def apply(checkpointer: Checkpointer, records: js.Array[Record]): ProcessRecordsInput = {
      val __obj = js.Dynamic.literal(checkpointer = checkpointer.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessRecordsInput]
    }
    
    @scala.inline
    implicit class ProcessRecordsInputMutableBuilder[Self <: ProcessRecordsInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMillisBehindLatest(value: Double): Self = StObject.set(x, "millisBehindLatest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillisBehindLatestUndefined: Self = StObject.set(x, "millisBehindLatest", js.undefined)
      
      @scala.inline
      def setRecords(value: js.Array[Record]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: Record*): Self = StObject.set(x, "records", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Record extends StObject {
    
    var data: String = js.native
    
    var partitionKey: String = js.native
    
    var sequenceNumber: String = js.native
  }
  object Record {
    
    @scala.inline
    def apply(data: String, partitionKey: String, sequenceNumber: String): Record = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], partitionKey = partitionKey.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[Record]
    }
    
    @scala.inline
    implicit class RecordMutableBuilder[Self <: Record] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-line:no-empty-interface
  @js.native
  trait RecordProcessor extends StObject {
    
    /**
      * Called once by the KCL before any calls to processRecords. Any initialization
      * logic for record processing can go here.
      *
      * @param initializeInput - Initialization related information.
      * @param completeCallback - The callback that must be invoked
      *          once the initialization operation is complete.
      */
    def initialize(initializeInput: InitializeInput, completeCallback: Callback): Unit = js.native
    
    /**
      * Called by the KCL to indicate that this record processor should shut down.
      * After the lease lost operation is complete, there will not be any more calls to
      * any other functions of this record processor. Clients should not attempt to
      * checkpoint because the lease has been lost by this Worker.
      *
      * @param leaseLostInput    Lease lost information.
      * @param completeCallback  The callback must be invoked once lease
      *             lost operations are completed.
      */
    def leaseLost(leaseLostInput: LeaseLossInput, completeCallback: Callback): Unit = js.native
    
    /**
      * Called by KCL with a list of records to be processed and checkpointed.
      * A record looks like:
      *
      * The checkpointer can optionally be used to checkpoint a particular sequence
      * number (from a record). If checkpointing, the checkpoint must always be
      * invoked before calling `completeCallback` for processRecords. Moreover,
      * `completeCallback` should only be invoked once the checkpoint operation
      * callback is received.
      *
      * @param processRecordsInput       Process records information with
      *             array of records that are to be processed.
      * @param completeCallback          The callback that must be invoked
      *             once all records are processed and checkpoint (optional) is
      *             complete.
      */
    def processRecords(processRecordsInput: ProcessRecordsInput, completeCallback: Callback): Unit = js.native
    
    /**
      * Called by the KCL to indicate that this record processor should shutdown.
      * After the shard ended operation is complete, there will not be any more calls to
      * any other functions of this record processor. Clients are required to checkpoint
      * at this time. This indicates that the current record processor has finished
      * processing and new record processors for the children will be created.
      *
      * @param shardEndedInput       ShardEnded information.
      * @param completeCallback      The callback must be invoked once shard
      *               ended operations are completed.
      */
    def shardEnded(shardEndedInput: ShardEndedInput, completeCallback: Callback): Unit = js.native
  }
  object RecordProcessor {
    
    @scala.inline
    def apply(
      initialize: (InitializeInput, Callback) => Unit,
      leaseLost: (LeaseLossInput, Callback) => Unit,
      processRecords: (ProcessRecordsInput, Callback) => Unit,
      shardEnded: (ShardEndedInput, Callback) => Unit
    ): RecordProcessor = {
      val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction2(initialize), leaseLost = js.Any.fromFunction2(leaseLost), processRecords = js.Any.fromFunction2(processRecords), shardEnded = js.Any.fromFunction2(shardEnded))
      __obj.asInstanceOf[RecordProcessor]
    }
    
    @scala.inline
    implicit class RecordProcessorMutableBuilder[Self <: RecordProcessor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialize(value: (InitializeInput, Callback) => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLeaseLost(value: (LeaseLossInput, Callback) => Unit): Self = StObject.set(x, "leaseLost", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProcessRecords(value: (ProcessRecordsInput, Callback) => Unit): Self = StObject.set(x, "processRecords", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShardEnded(value: (ShardEndedInput, Callback) => Unit): Self = StObject.set(x, "shardEnded", js.Any.fromFunction2(value))
    }
  }
  
  // tslint:disable-line:no-empty-interface
  type ShardEndedInput = CheckpointInput
}
