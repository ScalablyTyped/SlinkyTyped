package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeedsConfig extends js.Object {
  var directory: js.UndefOr[String] = js.native
  var stub: js.UndefOr[String] = js.native
}

object SeedsConfig {
  @scala.inline
  def apply(): SeedsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeedsConfig]
  }
  @scala.inline
  implicit class SeedsConfigOps[Self <: SeedsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(js.undefined)
        ret
    }
    @scala.inline
    def withStub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stub")(js.undefined)
        ret
    }
  }
  
}

