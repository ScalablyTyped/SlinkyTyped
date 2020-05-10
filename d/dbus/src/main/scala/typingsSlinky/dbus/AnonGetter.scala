package typingsSlinky.dbus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetter extends js.Object {
  var setter: js.UndefOr[js.Function2[/* value */ js.Any, /* done */ js.Function0[Unit], Unit]] = js.native
  var `type`: String = js.native
  def getter(cb: js.Function1[/* val */ String, Unit]): Unit = js.native
}

object AnonGetter {
  @scala.inline
  def apply(getter: js.Function1[/* val */ String, Unit] => Unit, `type`: String): AnonGetter = {
    val __obj = js.Dynamic.literal(getter = js.Any.fromFunction1(getter))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGetter]
  }
  @scala.inline
  implicit class AnonGetterOps[Self <: AnonGetter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetter(value: js.Function1[/* val */ String, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetter(value: (/* value */ js.Any, /* done */ js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setter")(js.undefined)
        ret
    }
  }
  
}

