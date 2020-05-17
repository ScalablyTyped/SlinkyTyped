package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftsilo extends js.Object {
  def ts_append(_table: String, _ruri: String): Double = js.native
  def ts_append_to(tindex: Double, tlabel: Double, _table: String): Double = js.native
  def ts_append_to_uri(tindex: Double, tlabel: Double, _table: String, _uri: String): Double = js.native
  def ts_store(): Double = js.native
  def ts_store_uri(puri: String): Double = js.native
}

object Typeoftsilo {
  @scala.inline
  def apply(
    ts_append: (String, String) => Double,
    ts_append_to: (Double, Double, String) => Double,
    ts_append_to_uri: (Double, Double, String, String) => Double,
    ts_store: () => Double,
    ts_store_uri: String => Double
  ): Typeoftsilo = {
    val __obj = js.Dynamic.literal(ts_append = js.Any.fromFunction2(ts_append), ts_append_to = js.Any.fromFunction3(ts_append_to), ts_append_to_uri = js.Any.fromFunction4(ts_append_to_uri), ts_store = js.Any.fromFunction0(ts_store), ts_store_uri = js.Any.fromFunction1(ts_store_uri))
    __obj.asInstanceOf[Typeoftsilo]
  }
  @scala.inline
  implicit class TypeoftsiloOps[Self <: Typeoftsilo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTs_append(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts_append")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTs_append_to(value: (Double, Double, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts_append_to")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTs_append_to_uri(value: (Double, Double, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts_append_to_uri")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withTs_store(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts_store")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTs_store_uri(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts_store_uri")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

