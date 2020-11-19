package typingsSlinky.cassandraDriver

import typingsSlinky.cassandraDriver.mod.errors.AuthenticationError
import typingsSlinky.cassandraDriver.mod.errors.OperationTimedOutError
import typingsSlinky.cassandraDriver.mod.errors.ResponseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/metrics", JSImport.Namespace)
@js.native
object metricsMod extends js.Object {
  
  @js.native
  object metrics extends js.Object {
    
    @js.native
    trait ClientMetrics extends js.Object {
      
      def onAuthenticationError(e: AuthenticationError): Unit = js.native
      def onAuthenticationError(e: js.Error): Unit = js.native
      
      def onClientTimeoutError(e: OperationTimedOutError): Unit = js.native
      
      def onClientTimeoutRetry(e: js.Error): Unit = js.native
      
      def onConnectionError(e: js.Error): Unit = js.native
      
      def onIgnoreError(e: js.Error): Unit = js.native
      
      def onOtherError(e: js.Error): Unit = js.native
      
      def onOtherErrorRetry(e: js.Error): Unit = js.native
      
      def onReadTimeoutError(e: ResponseError): Unit = js.native
      
      def onReadTimeoutRetry(e: js.Error): Unit = js.native
      
      def onResponse(latency: js.Array[Double]): Unit = js.native
      
      def onSpeculativeExecution(): Unit = js.native
      
      def onSuccessfulResponse(latency: js.Array[Double]): Unit = js.native
      
      def onUnavailableError(e: ResponseError): Unit = js.native
      
      def onUnavailableRetry(e: js.Error): Unit = js.native
      
      def onWriteTimeoutError(e: ResponseError): Unit = js.native
      
      def onWriteTimeoutRetry(e: js.Error): Unit = js.native
    }
    
    @js.native
    class DefaultMetrics () extends ClientMetrics
  }
}
