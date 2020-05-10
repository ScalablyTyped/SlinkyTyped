package typingsSlinky.fingerprintjs2

import typingsSlinky.fingerprintjs2.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetData extends js.Object {
  var key: String = js.native
  var pauseBefore: js.UndefOr[Boolean] = js.native
  def getData(done: js.Function1[/* value */ js.Any, Unit], options: Options): Unit = js.native
}

object AnonGetData {
  @scala.inline
  def apply(getData: (js.Function1[/* value */ js.Any, Unit], Options) => Unit, key: String): AnonGetData = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction2(getData), key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGetData]
  }
  @scala.inline
  implicit class AnonGetDataOps[Self <: AnonGetData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetData(value: (js.Function1[/* value */ js.Any, Unit], Options) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPauseBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseBefore")(js.undefined)
        ret
    }
  }
  
}

