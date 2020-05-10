package typingsSlinky.consul.mod.Kv

import typingsSlinky.consul.mod.CommonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelOptions extends CommonOptions {
  var cas: js.UndefOr[String] = js.native
  var key: String = js.native
  var recurse: js.UndefOr[Boolean] = js.native
}

object DelOptions {
  @scala.inline
  def apply(key: String): DelOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelOptions]
  }
  @scala.inline
  implicit class DelOptionsOps[Self <: DelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCas(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cas")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurse")(js.undefined)
        ret
    }
  }
  
}

