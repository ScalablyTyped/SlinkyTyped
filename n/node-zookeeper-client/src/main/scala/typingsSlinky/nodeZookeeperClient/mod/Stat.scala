package typingsSlinky.nodeZookeeperClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stat extends js.Object {
  var aversion: Double = js.native
  var ctime: Double = js.native
  var cversion: Double = js.native
  var czxid: Double = js.native
  var dataLength: Double = js.native
  var ephemeralOwner: Double = js.native
  var mtime: Double = js.native
  var mzxid: Double = js.native
  var numChildren: Double = js.native
  var pzxid: Double = js.native
  var version: Double = js.native
}

object Stat {
  @scala.inline
  def apply(
    aversion: Double,
    ctime: Double,
    cversion: Double,
    czxid: Double,
    dataLength: Double,
    ephemeralOwner: Double,
    mtime: Double,
    mzxid: Double,
    numChildren: Double,
    pzxid: Double,
    version: Double
  ): Stat = {
    val __obj = js.Dynamic.literal(aversion = aversion.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], cversion = cversion.asInstanceOf[js.Any], czxid = czxid.asInstanceOf[js.Any], dataLength = dataLength.asInstanceOf[js.Any], ephemeralOwner = ephemeralOwner.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mzxid = mzxid.asInstanceOf[js.Any], numChildren = numChildren.asInstanceOf[js.Any], pzxid = pzxid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stat]
  }
  @scala.inline
  implicit class StatOps[Self <: Stat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAversion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aversion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCversion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cversion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCzxid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("czxid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEphemeralOwner(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMtime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMzxid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mzxid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumChildren(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPzxid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pzxid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

