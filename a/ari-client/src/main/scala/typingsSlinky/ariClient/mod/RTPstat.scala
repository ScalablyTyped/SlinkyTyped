package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTPstat extends js.Object {
  var channel_uniqueid: String = js.native
  var local_maxjitter: js.UndefOr[Double] = js.native
  var local_maxrxploss: js.UndefOr[Double] = js.native
  var local_minjitter: js.UndefOr[Double] = js.native
  var local_minrxploss: js.UndefOr[Double] = js.native
  var local_normdevjitter: js.UndefOr[Double] = js.native
  var local_normdevrxploss: js.UndefOr[Double] = js.native
  var local_ssrc: Double = js.native
  var local_stdevjitter: js.UndefOr[Double] = js.native
  var local_stdevrxploss: js.UndefOr[Double] = js.native
  var maxrtt: js.UndefOr[Double] = js.native
  var minrtt: js.UndefOr[Double] = js.native
  var normdevrtt: js.UndefOr[Double] = js.native
  var remote_maxjitter: js.UndefOr[Double] = js.native
  var remote_maxrxploss: js.UndefOr[Double] = js.native
  var remote_minjitter: js.UndefOr[Double] = js.native
  var remote_minrxploss: js.UndefOr[Double] = js.native
  var remote_normdevjitter: js.UndefOr[Double] = js.native
  var remote_normdevrxploss: js.UndefOr[Double] = js.native
  var remote_ssrc: Double = js.native
  var remote_stdevjitter: js.UndefOr[Double] = js.native
  var remote_stdevrxploss: js.UndefOr[Double] = js.native
  var rtt: js.UndefOr[Double] = js.native
  var rxcount: Double = js.native
  var rxjitter: js.UndefOr[Double] = js.native
  var rxoctetcount: Double = js.native
  var rxploss: Double = js.native
  var stdevrtt: js.UndefOr[Double] = js.native
  /* Properties */
  var txcount: Double = js.native
  var txjitter: js.UndefOr[Double] = js.native
  var txoctetcount: Double = js.native
  var txploss: Double = js.native
}

object RTPstat {
  @scala.inline
  def apply(
    channel_uniqueid: String,
    local_ssrc: Double,
    remote_ssrc: Double,
    rxcount: Double,
    rxoctetcount: Double,
    rxploss: Double,
    txcount: Double,
    txoctetcount: Double,
    txploss: Double
  ): RTPstat = {
    val __obj = js.Dynamic.literal(channel_uniqueid = channel_uniqueid.asInstanceOf[js.Any], local_ssrc = local_ssrc.asInstanceOf[js.Any], remote_ssrc = remote_ssrc.asInstanceOf[js.Any], rxcount = rxcount.asInstanceOf[js.Any], rxoctetcount = rxoctetcount.asInstanceOf[js.Any], rxploss = rxploss.asInstanceOf[js.Any], txcount = txcount.asInstanceOf[js.Any], txoctetcount = txoctetcount.asInstanceOf[js.Any], txploss = txploss.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTPstat]
  }
  @scala.inline
  implicit class RTPstatOps[Self <: RTPstat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel_uniqueid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_uniqueid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocal_ssrc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_ssrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemote_ssrc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_ssrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRxcount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rxcount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRxoctetcount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rxoctetcount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRxploss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rxploss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTxcount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txcount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTxoctetcount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txoctetcount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTxploss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txploss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocal_maxjitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_maxjitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_maxjitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_maxjitter")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal_maxrxploss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_maxrxploss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_maxrxploss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_maxrxploss")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal_minjitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_minjitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_minjitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_minjitter")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal_minrxploss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_minrxploss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_minrxploss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_minrxploss")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal_normdevjitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_normdevjitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_normdevjitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_normdevjitter")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal_normdevrxploss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_normdevrxploss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_normdevrxploss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_normdevrxploss")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal_stdevjitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_stdevjitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_stdevjitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_stdevjitter")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal_stdevrxploss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_stdevrxploss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_stdevrxploss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_stdevrxploss")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxrtt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxrtt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxrtt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxrtt")(js.undefined)
        ret
    }
    @scala.inline
    def withMinrtt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minrtt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinrtt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minrtt")(js.undefined)
        ret
    }
    @scala.inline
    def withNormdevrtt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normdevrtt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormdevrtt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normdevrtt")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote_maxjitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_maxjitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote_maxjitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_maxjitter")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote_maxrxploss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_maxrxploss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote_maxrxploss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_maxrxploss")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote_minjitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_minjitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote_minjitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_minjitter")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote_minrxploss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_minrxploss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote_minrxploss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_minrxploss")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote_normdevjitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_normdevjitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote_normdevjitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_normdevjitter")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote_normdevrxploss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_normdevrxploss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote_normdevrxploss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_normdevrxploss")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote_stdevjitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_stdevjitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote_stdevjitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_stdevjitter")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote_stdevrxploss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_stdevrxploss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote_stdevrxploss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_stdevrxploss")(js.undefined)
        ret
    }
    @scala.inline
    def withRtt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtt")(js.undefined)
        ret
    }
    @scala.inline
    def withRxjitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rxjitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRxjitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rxjitter")(js.undefined)
        ret
    }
    @scala.inline
    def withStdevrtt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdevrtt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdevrtt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdevrtt")(js.undefined)
        ret
    }
    @scala.inline
    def withTxjitter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txjitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTxjitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txjitter")(js.undefined)
        ret
    }
  }
  
}

