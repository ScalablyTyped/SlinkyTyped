package typingsSlinky.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayRuntimeTypesMod {
  
  @js.native
  trait CacheConfig extends StObject {
    
    var force: js.UndefOr[Boolean | Null] = js.native
    
    var liveConfigId: js.UndefOr[String | Null] = js.native
    
    var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var poll: js.UndefOr[Double | Null] = js.native
    
    var transactionId: js.UndefOr[String | Null] = js.native
  }
  object CacheConfig {
    
    @scala.inline
    def apply(): CacheConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheConfig]
    }
    
    @scala.inline
    implicit class CacheConfigMutableBuilder[Self <: CacheConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceNull: Self = StObject.set(x, "force", null)
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setLiveConfigId(value: String): Self = StObject.set(x, "liveConfigId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveConfigIdNull: Self = StObject.set(x, "liveConfigId", null)
      
      @scala.inline
      def setLiveConfigIdUndefined: Self = StObject.set(x, "liveConfigId", js.undefined)
      
      @scala.inline
      def setMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setPoll(value: Double): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPollNull: Self = StObject.set(x, "poll", null)
      
      @scala.inline
      def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
      
      @scala.inline
      def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
      
      @scala.inline
      def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
    }
  }
  
  type DataID = String
  
  @js.native
  trait Disposable extends StObject {
    
    def dispose(): Unit = js.native
  }
  object Disposable {
    
    @scala.inline
    def apply(dispose: () => Unit): Disposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[Disposable]
    }
    
    @scala.inline
    implicit class DisposableMutableBuilder[Self <: Disposable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  type DisposeFn = js.Function0[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.relayRuntime.relayRuntimeStrings.`store-and-network`
    - typingsSlinky.relayRuntime.relayRuntimeStrings.`store-only`
    - typingsSlinky.relayRuntime.relayRuntimeStrings.`store-or-network`
    - typingsSlinky.relayRuntime.relayRuntimeStrings.`network-only`
  */
  trait FetchPolicy extends StObject
  object FetchPolicy {
    
    @scala.inline
    def `network-only`: typingsSlinky.relayRuntime.relayRuntimeStrings.`network-only` = "network-only".asInstanceOf[typingsSlinky.relayRuntime.relayRuntimeStrings.`network-only`]
    
    @scala.inline
    def `store-and-network`: typingsSlinky.relayRuntime.relayRuntimeStrings.`store-and-network` = "store-and-network".asInstanceOf[typingsSlinky.relayRuntime.relayRuntimeStrings.`store-and-network`]
    
    @scala.inline
    def `store-only`: typingsSlinky.relayRuntime.relayRuntimeStrings.`store-only` = "store-only".asInstanceOf[typingsSlinky.relayRuntime.relayRuntimeStrings.`store-only`]
    
    @scala.inline
    def `store-or-network`: typingsSlinky.relayRuntime.relayRuntimeStrings.`store-or-network` = "store-or-network".asInstanceOf[typingsSlinky.relayRuntime.relayRuntimeStrings.`store-or-network`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.relayRuntime.relayRuntimeStrings.`store-or-network`
    - typingsSlinky.relayRuntime.relayRuntimeStrings.`network-only`
  */
  trait FetchQueryFetchPolicy extends StObject
  object FetchQueryFetchPolicy {
    
    @scala.inline
    def `network-only`: typingsSlinky.relayRuntime.relayRuntimeStrings.`network-only` = "network-only".asInstanceOf[typingsSlinky.relayRuntime.relayRuntimeStrings.`network-only`]
    
    @scala.inline
    def `store-or-network`: typingsSlinky.relayRuntime.relayRuntimeStrings.`store-or-network` = "store-or-network".asInstanceOf[typingsSlinky.relayRuntime.relayRuntimeStrings.`store-or-network`]
  }
  
  @js.native
  trait OperationType extends StObject {
    
    val rawResponse: js.UndefOr[js.Any] = js.native
    
    val response: js.Any = js.native
    
    val variables: Variables = js.native
  }
  object OperationType {
    
    @scala.inline
    def apply(response: js.Any, variables: Variables): OperationType = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationType]
    }
    
    @scala.inline
    implicit class OperationTypeMutableBuilder[Self <: OperationType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRawResponse(value: js.Any): Self = StObject.set(x, "rawResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawResponseUndefined: Self = StObject.set(x, "rawResponse", js.undefined)
      
      @scala.inline
      def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.relayRuntime.relayRuntimeStrings.full
    - typingsSlinky.relayRuntime.relayRuntimeStrings.partial
  */
  trait RenderPolicy extends StObject
  object RenderPolicy {
    
    @scala.inline
    def full: typingsSlinky.relayRuntime.relayRuntimeStrings.full = "full".asInstanceOf[typingsSlinky.relayRuntime.relayRuntimeStrings.full]
    
    @scala.inline
    def partial: typingsSlinky.relayRuntime.relayRuntimeStrings.partial = "partial".asInstanceOf[typingsSlinky.relayRuntime.relayRuntimeStrings.partial]
  }
  
  type Variables = StringDictionary[js.Any]
  
  type VariablesOf[TQuery /* <: OperationType */] = /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
}
