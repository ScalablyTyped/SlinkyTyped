package typingsSlinky.nock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackOptions extends js.Object {
  var after: js.UndefOr[js.Function1[/* scope */ Scope, Unit]] = js.native
  var afterRecord: js.UndefOr[js.Function1[/* defs */ js.Array[Definition], js.Array[Definition]]] = js.native
  var before: js.UndefOr[js.Function1[/* def */ Definition, Unit]] = js.native
  var recorder: js.UndefOr[RecorderOptions] = js.native
}

object BackOptions {
  @scala.inline
  def apply(): BackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackOptions]
  }
  @scala.inline
  implicit class BackOptionsOps[Self <: BackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: /* scope */ Scope => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRecord(value: /* defs */ js.Array[Definition] => js.Array[Definition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRecord")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: /* def */ Definition => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withRecorder(value: RecorderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recorder")(js.undefined)
        ret
    }
  }
  
}

