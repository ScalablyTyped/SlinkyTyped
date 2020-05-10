package typingsSlinky.overlayscrollbars.mod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.overlayscrollbars.AnonXNumber
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compatibility extends js.Object {
  def bind(func: js.Function1[/* repeated */ js.Any, _], thisObj: js.Any, args: js.Any*): js.Any = js.native
  def cAF(): js.Function1[/* requestID */ Double, Unit] = js.native
  def inA[T](item: T, array: js.Array[T]): Double = js.native
  def isA(obj: js.Any): Boolean = js.native
  def mBtn(event: MouseEvent): Double = js.native
  def mO(): js.Any = js.native
  def now(): Double = js.native
  def page(event: MouseEvent): AnonXNumber = js.native
  def prvD(event: Event_): Unit = js.native
  def rAF(): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], Double] = js.native
  def rO(): js.Any = js.native
  def stpP(event: Event_): Unit = js.native
  def `type`(obj: js.Any): String = js.native
  def wH(): Double = js.native
  def wW(): Double = js.native
}

object Compatibility {
  @scala.inline
  def apply(
    bind: (js.Function1[/* repeated */ js.Any, _], js.Any, /* repeated */ js.Any) => js.Any,
    cAF: () => js.Function1[/* requestID */ Double, Unit],
    inA: (js.Any, js.Array[js.Any]) => Double,
    isA: js.Any => Boolean,
    mBtn: MouseEvent => Double,
    mO: () => js.Any,
    now: () => Double,
    page: MouseEvent => AnonXNumber,
    prvD: Event_ => Unit,
    rAF: () => js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], Double],
    rO: () => js.Any,
    stpP: Event_ => Unit,
    `type`: js.Any => String,
    wH: () => Double,
    wW: () => Double
  ): Compatibility = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), cAF = js.Any.fromFunction0(cAF), inA = js.Any.fromFunction2(inA), isA = js.Any.fromFunction1(isA), mBtn = js.Any.fromFunction1(mBtn), mO = js.Any.fromFunction0(mO), now = js.Any.fromFunction0(now), page = js.Any.fromFunction1(page), prvD = js.Any.fromFunction1(prvD), rAF = js.Any.fromFunction0(rAF), rO = js.Any.fromFunction0(rO), stpP = js.Any.fromFunction1(stpP), wH = js.Any.fromFunction0(wH), wW = js.Any.fromFunction0(wW))
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[Compatibility]
  }
  @scala.inline
  implicit class CompatibilityOps[Self <: Compatibility] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: (js.Function1[/* repeated */ js.Any, _], js.Any, /* repeated */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCAF(value: () => js.Function1[/* requestID */ Double, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cAF")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInA(value: (js.Any, js.Array[js.Any]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inA")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsA(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isA")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMBtn(value: MouseEvent => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mBtn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMO(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mO")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNow(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPage(value: MouseEvent => AnonXNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrvD(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prvD")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRAF(value: () => js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rAF")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRO(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rO")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStpP(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stpP")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWH(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wH")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWW(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wW")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

