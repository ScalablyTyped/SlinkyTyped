package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withBytesReceived(value: SchemaAggregateStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesReceived")(js.undefined)
        ret
    }
    @scala.inline
    def withBytesSent(value: SchemaAggregateStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesSent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesSent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesSent")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNumMessagesLost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numMessagesLost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumMessagesLost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numMessagesLost")(js.undefined)
        ret
    }
    @scala.inline
    def withNumMessagesReceived(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numMessagesReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumMessagesReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numMessagesReceived")(js.undefined)
        ret
    }
    @scala.inline
    def withNumMessagesSent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numMessagesSent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumMessagesSent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numMessagesSent")(js.undefined)
        ret
    }
    @scala.inline
    def withNumSendFailures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numSendFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumSendFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numSendFailures")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundtripLatencyMillis(value: SchemaAggregateStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundtripLatencyMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundtripLatencyMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundtripLatencyMillis")(js.undefined)
        ret
    }
  }
  
}

