package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for peer channel diagnostics.
  */
@js.native
trait SchemaPeerChannelDiagnostics extends js.Object {
  
  /**
    * Number of bytes received.
    */
  var bytesReceived: js.UndefOr[SchemaAggregateStats] = js.native
  
  /**
    * Number of bytes sent.
    */
  var bytesSent: js.UndefOr[SchemaAggregateStats] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#peerChannelDiagnostics.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Number of messages lost.
    */
  var numMessagesLost: js.UndefOr[Double] = js.native
  
  /**
    * Number of messages received.
    */
  var numMessagesReceived: js.UndefOr[Double] = js.native
  
  /**
    * Number of messages sent.
    */
  var numMessagesSent: js.UndefOr[Double] = js.native
  
  /**
    * Number of send failures.
    */
  var numSendFailures: js.UndefOr[Double] = js.native
  
  /**
    * Roundtrip latency stats in milliseconds.
    */
  var roundtripLatencyMillis: js.UndefOr[SchemaAggregateStats] = js.native
}
object SchemaPeerChannelDiagnostics {
  
  @scala.inline
  def apply(): SchemaPeerChannelDiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPeerChannelDiagnostics]
  }
  
  @scala.inline
  implicit class SchemaPeerChannelDiagnosticsOps[Self <: SchemaPeerChannelDiagnostics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBytesReceived(value: SchemaAggregateStats): Self = this.set("bytesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesReceived: Self = this.set("bytesReceived", js.undefined)
    
    @scala.inline
    def setBytesSent(value: SchemaAggregateStats): Self = this.set("bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesSent: Self = this.set("bytesSent", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNumMessagesLost(value: Double): Self = this.set("numMessagesLost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumMessagesLost: Self = this.set("numMessagesLost", js.undefined)
    
    @scala.inline
    def setNumMessagesReceived(value: Double): Self = this.set("numMessagesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumMessagesReceived: Self = this.set("numMessagesReceived", js.undefined)
    
    @scala.inline
    def setNumMessagesSent(value: Double): Self = this.set("numMessagesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumMessagesSent: Self = this.set("numMessagesSent", js.undefined)
    
    @scala.inline
    def setNumSendFailures(value: Double): Self = this.set("numSendFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumSendFailures: Self = this.set("numSendFailures", js.undefined)
    
    @scala.inline
    def setRoundtripLatencyMillis(value: SchemaAggregateStats): Self = this.set("roundtripLatencyMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundtripLatencyMillis: Self = this.set("roundtripLatencyMillis", js.undefined)
  }
}
