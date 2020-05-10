package typingsSlinky.restifyPlugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMapParams extends js.Object {
  var mapParams: js.UndefOr[Boolean] = js.native
  var overrideParams: js.UndefOr[Boolean] = js.native
  var reviver: js.UndefOr[js.Any] = js.native
}

object AnonMapParams {
  @scala.inline
  def apply(): AnonMapParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMapParams]
  }
  @scala.inline
  implicit class AnonMapParamsOps[Self <: AnonMapParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMapParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapParams")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideParams")(js.undefined)
        ret
    }
    @scala.inline
    def withReviver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReviver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviver")(js.undefined)
        ret
    }
  }
  
}

