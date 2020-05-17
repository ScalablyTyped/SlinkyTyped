package typingsSlinky.iobroker.mod.global.ioBroker

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Omit<iobroker.iobroker.<global>.ioBroker.State, 'val'>> & std.Pick<iobroker.iobroker.<global>.ioBroker.State, 'val'> */
@js.native
trait SettableState extends js.Object {
  var ack: js.UndefOr[Boolean] = js.native
  var c: js.UndefOr[String] = js.native
  var expire: js.UndefOr[Double] = js.native
  var from: js.UndefOr[String] = js.native
  var lc: js.UndefOr[Double] = js.native
  var q: js.UndefOr[StateQuality] = js.native
  var ts: js.UndefOr[Double] = js.native
  var user: js.UndefOr[String] = js.native
  var `val`: js.UndefOr[String | Double | Boolean | js.Array[_] | (Record[String, _])] = js.native
}

object SettableState {
  @scala.inline
  def apply(): SettableState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettableState]
  }
  @scala.inline
  implicit class SettableStateOps[Self <: SettableState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ack")(js.undefined)
        ret
    }
    @scala.inline
    def withC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c")(js.undefined)
        ret
    }
    @scala.inline
    def withExpire(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expire")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expire")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withLc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lc")(js.undefined)
        ret
    }
    @scala.inline
    def withQ(value: StateQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(js.undefined)
        ret
    }
    @scala.inline
    def withTs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
    @scala.inline
    def withVal(value: String | Double | Boolean | js.Array[_] | (Record[String, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("val")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("val")(js.undefined)
        ret
    }
  }
  
}

