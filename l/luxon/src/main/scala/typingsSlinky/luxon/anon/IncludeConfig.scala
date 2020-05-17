package typingsSlinky.luxon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeConfig extends js.Object {
  var includeConfig: js.UndefOr[Boolean] = js.native
}

object IncludeConfig {
  @scala.inline
  def apply(): IncludeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeConfig]
  }
  @scala.inline
  implicit class IncludeConfigOps[Self <: IncludeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeConfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeConfig")(js.undefined)
        ret
    }
  }
  
}

