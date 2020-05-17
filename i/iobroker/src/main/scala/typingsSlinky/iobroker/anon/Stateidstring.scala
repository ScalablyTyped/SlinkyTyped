package typingsSlinky.iobroker.anon

import typingsSlinky.iobroker.mod.global.ioBroker.StateQuality
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined iobroker.iobroker.<global>.ioBroker.State & {  id ? :string} */
@js.native
trait Stateidstring extends js.Object {
  /** Direction flag: false for desired value and true for actual value. Default: false. */
  var ack: Boolean = js.native
  /** Optional comment */
  var c: js.UndefOr[String] = js.native
  /** Optional time in seconds after which the state is reset to null */
  var expire: js.UndefOr[Double] = js.native
  /** Name of the adapter instance which set the value, e.g. "system.adapter.web.0" */
  var from: String = js.native
  var id: js.UndefOr[String] = js.native
  /** Unix timestamp of the last time the value changed */
  var lc: Double = js.native
  /** Optional quality of the state value */
  var q: js.UndefOr[StateQuality] = js.native
  /** Unix timestamp. Default: current time */
  var ts: Double = js.native
  /** The user who set this value */
  var user: js.UndefOr[String] = js.native
  /** The value of the state. */
  var `val`: String | Double | Boolean | js.Array[_] | (Record[String, _]) | Null = js.native
}

object Stateidstring {
  @scala.inline
  def apply(ack: Boolean, from: String, lc: Double, ts: Double): Stateidstring = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], lc = lc.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stateidstring]
  }
  @scala.inline
  implicit class StateidstringOps[Self <: Stateidstring] (val x: Self) extends AnyVal {
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
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts")(value.asInstanceOf[js.Any])
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withValNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("val")(null)
        ret
    }
  }
  
}

