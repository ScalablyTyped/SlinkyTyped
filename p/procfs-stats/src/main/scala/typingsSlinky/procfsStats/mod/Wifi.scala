package typingsSlinky.procfsStats.mod

import typingsSlinky.procfsStats.AnonDiscardedpackets
import typingsSlinky.procfsStats.AnonMissed
import typingsSlinky.procfsStats.AnonQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wifi extends js.Object {
  var Interface: String = js.native
  var beacon: AnonMissed = js.native
  var crypt: AnonDiscardedpackets = js.native
  var frag: AnonDiscardedpackets = js.native
  var level: AnonQuality = js.native
  var link: AnonQuality = js.native
  var misc: AnonDiscardedpackets = js.native
  var noise: AnonQuality = js.native
  var nwid: AnonDiscardedpackets = js.native
  var retry: AnonDiscardedpackets = js.native
  var status: String = js.native
}

object Wifi {
  @scala.inline
  def apply(
    Interface: String,
    beacon: AnonMissed,
    crypt: AnonDiscardedpackets,
    frag: AnonDiscardedpackets,
    level: AnonQuality,
    link: AnonQuality,
    misc: AnonDiscardedpackets,
    noise: AnonQuality,
    nwid: AnonDiscardedpackets,
    retry: AnonDiscardedpackets,
    status: String
  ): Wifi = {
    val __obj = js.Dynamic.literal(Interface = Interface.asInstanceOf[js.Any], beacon = beacon.asInstanceOf[js.Any], crypt = crypt.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], misc = misc.asInstanceOf[js.Any], noise = noise.asInstanceOf[js.Any], nwid = nwid.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wifi]
  }
  @scala.inline
  implicit class WifiOps[Self <: Wifi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterface(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeacon(value: AnonMissed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beacon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrypt(value: AnonDiscardedpackets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrag(value: AnonDiscardedpackets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: AnonQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: AnonQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMisc(value: AnonDiscardedpackets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("misc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoise(value: AnonQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNwid(value: AnonDiscardedpackets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nwid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetry(value: AnonDiscardedpackets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

