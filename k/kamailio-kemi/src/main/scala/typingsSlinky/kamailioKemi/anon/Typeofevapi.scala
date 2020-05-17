package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofevapi extends js.Object {
  def async_relay(sdata: String): Double = js.native
  def close(): Double = js.native
  def relay(sdata: String): Double = js.native
  def relay_multicast(sdata: String, stag: String): Double = js.native
  def relay_unicast(sdata: String, stag: String): Double = js.native
  def set_tag(stag: String): Double = js.native
}

object Typeofevapi {
  @scala.inline
  def apply(
    async_relay: String => Double,
    close: () => Double,
    relay: String => Double,
    relay_multicast: (String, String) => Double,
    relay_unicast: (String, String) => Double,
    set_tag: String => Double
  ): Typeofevapi = {
    val __obj = js.Dynamic.literal(async_relay = js.Any.fromFunction1(async_relay), close = js.Any.fromFunction0(close), relay = js.Any.fromFunction1(relay), relay_multicast = js.Any.fromFunction2(relay_multicast), relay_unicast = js.Any.fromFunction2(relay_unicast), set_tag = js.Any.fromFunction1(set_tag))
    __obj.asInstanceOf[Typeofevapi]
  }
  @scala.inline
  implicit class TypeofevapiOps[Self <: Typeofevapi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync_relay(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async_relay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClose(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRelay(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRelay_multicast(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relay_multicast")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRelay_unicast(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relay_unicast")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSet_tag(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_tag")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

