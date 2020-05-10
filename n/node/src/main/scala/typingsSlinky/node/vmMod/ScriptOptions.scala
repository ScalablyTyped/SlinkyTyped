package typingsSlinky.node.vmMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptOptions extends BaseOptions {
  var cachedData: js.UndefOr[Buffer] = js.native
  var displayErrors: js.UndefOr[Boolean] = js.native
  var produceCachedData: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object ScriptOptions {
  @scala.inline
  def apply(): ScriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptOptions]
  }
  @scala.inline
  implicit class ScriptOptionsOps[Self <: ScriptOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCachedData(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachedData")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withProduceCachedData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("produceCachedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduceCachedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("produceCachedData")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

