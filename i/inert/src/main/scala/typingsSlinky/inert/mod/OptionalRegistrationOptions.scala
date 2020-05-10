package typingsSlinky.inert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * inert accepts the following registration options
  * @see {@link https://github.com/hapijs/inert#registration-options}
  */
@js.native
trait OptionalRegistrationOptions extends js.Object {
  /**
    * sets the maximum number of file etag hash values stored in the etags cache. Defaults to 10000.
    */
  var etagsCacheMaxSize: js.UndefOr[Double] = js.native
}

object OptionalRegistrationOptions {
  @scala.inline
  def apply(): OptionalRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalRegistrationOptions]
  }
  @scala.inline
  implicit class OptionalRegistrationOptionsOps[Self <: OptionalRegistrationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtagsCacheMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etagsCacheMaxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtagsCacheMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etagsCacheMaxSize")(js.undefined)
        ret
    }
  }
  
}

