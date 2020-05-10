package typingsSlinky.koaJoiRouterDocs.mod.koaJoiRouterDocs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecOptions extends js.Object {
  var defaultResponses: js.UndefOr[js.Object] = js.native
  var warnFunc: js.UndefOr[js.Function0[Unit]] = js.native
}

object SpecOptions {
  @scala.inline
  def apply(): SpecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecOptions]
  }
  @scala.inline
  implicit class SpecOptionsOps[Self <: SpecOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultResponses(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultResponses")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnFunc(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnFunc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutWarnFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnFunc")(js.undefined)
        ret
    }
  }
  
}

