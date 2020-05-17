package typingsSlinky.cassandraDriver

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cassandraDriver.anon.LogErroredRequests
import typingsSlinky.cassandraDriver.anon.ParamsQuery
import typingsSlinky.cassandraDriver.mod.ExecutionOptions
import typingsSlinky.cassandraDriver.mod.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/tracker", JSImport.Namespace)
@js.native
object trackerMod extends js.Object {
  @js.native
  object tracker extends js.Object {
    @js.native
    class RequestLogger protected () extends RequestTracker {
      def this(options: LogErroredRequests) = this()
    }
    
    @js.native
    trait RequestTracker extends js.Object {
      def onError(
        host: Host,
        query: String,
        parameters: js.Array[_],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        err: js.Error,
        latency: js.Array[Double]
      ): Unit = js.native
      def onError(
        host: Host,
        query: String,
        parameters: StringDictionary[js.Any],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        err: js.Error,
        latency: js.Array[Double]
      ): Unit = js.native
      def onError(
        host: Host,
        query: String,
        parameters: Null,
        executionOptions: ExecutionOptions,
        requestLength: Double,
        err: js.Error,
        latency: js.Array[Double]
      ): Unit = js.native
      def onError(
        host: Host,
        query: js.Array[ParamsQuery],
        parameters: js.Array[_],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        err: js.Error,
        latency: js.Array[Double]
      ): Unit = js.native
      def onError(
        host: Host,
        query: js.Array[ParamsQuery],
        parameters: StringDictionary[js.Any],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        err: js.Error,
        latency: js.Array[Double]
      ): Unit = js.native
      def onError(
        host: Host,
        query: js.Array[ParamsQuery],
        parameters: Null,
        executionOptions: ExecutionOptions,
        requestLength: Double,
        err: js.Error,
        latency: js.Array[Double]
      ): Unit = js.native
      def onSuccess(
        host: Host,
        query: String,
        parameters: js.Array[_],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        responseLength: Double,
        latency: js.Array[Double]
      ): Unit = js.native
      def onSuccess(
        host: Host,
        query: String,
        parameters: StringDictionary[js.Any],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        responseLength: Double,
        latency: js.Array[Double]
      ): Unit = js.native
      def onSuccess(
        host: Host,
        query: String,
        parameters: Null,
        executionOptions: ExecutionOptions,
        requestLength: Double,
        responseLength: Double,
        latency: js.Array[Double]
      ): Unit = js.native
      def onSuccess(
        host: Host,
        query: js.Array[ParamsQuery],
        parameters: js.Array[_],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        responseLength: Double,
        latency: js.Array[Double]
      ): Unit = js.native
      def onSuccess(
        host: Host,
        query: js.Array[ParamsQuery],
        parameters: StringDictionary[js.Any],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        responseLength: Double,
        latency: js.Array[Double]
      ): Unit = js.native
      def onSuccess(
        host: Host,
        query: js.Array[ParamsQuery],
        parameters: Null,
        executionOptions: ExecutionOptions,
        requestLength: Double,
        responseLength: Double,
        latency: js.Array[Double]
      ): Unit = js.native
      def shutdown(): Unit = js.native
    }
    
  }
  
}

