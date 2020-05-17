package typingsSlinky.gaxios.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var config: js.UndefOr[scala.Nothing] = js.native
  var shouldRetry: Boolean = js.native
}

object Config {
  @scala.inline
  def apply(shouldRetry: Boolean): Config = {
    val __obj = js.Dynamic.literal(shouldRetry = shouldRetry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShouldRetry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRetry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

