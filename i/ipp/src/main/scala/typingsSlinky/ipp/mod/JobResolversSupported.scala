package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobResolversSupported extends js.Object {
  var `resolver-name`: js.UndefOr[String] = js.native
}

object JobResolversSupported {
  @scala.inline
  def apply(): JobResolversSupported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobResolversSupported]
  }
  @scala.inline
  implicit class JobResolversSupportedOps[Self <: JobResolversSupported] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withResolver-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutResolver-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver-name")(js.undefined)
        ret
    }
  }
  
}

