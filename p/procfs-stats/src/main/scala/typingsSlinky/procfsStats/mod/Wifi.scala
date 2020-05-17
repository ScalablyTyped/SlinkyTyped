package typingsSlinky.procfsStats.mod

import typingsSlinky.procfsStats.anon.Discardedpackets
import typingsSlinky.procfsStats.anon.Missed
import typingsSlinky.procfsStats.anon.Quality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wifi extends js.Object {
  var Interface: String = js.native
  var beacon: Missed = js.native
  var crypt: Discardedpackets = js.native
  var frag: Discardedpackets = js.native
  var level: Quality = js.native
  var link: Quality = js.native
  var misc: Discardedpackets = js.native
  var noise: Quality = js.native
  var nwid: Discardedpackets = js.native
  var retry: Discardedpackets = js.native
  var status: String = js.native
}

object Wifi {
  @scala.inline
  def apply(
    Interface: String,
    beacon: Missed,
    crypt: Discardedpackets,
    frag: Discardedpackets,
    level: Quality,
    link: Quality,
    misc: Discardedpackets,
    noise: Quality,
    nwid: Discardedpackets,
    retry: Discardedpackets,
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
    def withBeacon(value: Missed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beacon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrypt(value: Discardedpackets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrag(value: Discardedpackets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Quality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: Quality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMisc(value: Discardedpackets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("misc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoise(value: Quality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNwid(value: Discardedpackets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nwid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetry(value: Discardedpackets): Self = {
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

