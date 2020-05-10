package typingsSlinky.hapiDecorators.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICacheConfig extends js.Object {
  var expiresAt: js.UndefOr[Double] = js.native
  var expiresIn: js.UndefOr[Double] = js.native
  var privacy: js.UndefOr[String] = js.native
}

object ICacheConfig {
  @scala.inline
  def apply(): ICacheConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICacheConfig]
  }
  @scala.inline
  implicit class ICacheConfigOps[Self <: ICacheConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiresAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresAt")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiresIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivacy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacy")(js.undefined)
        ret
    }
  }
  
}

