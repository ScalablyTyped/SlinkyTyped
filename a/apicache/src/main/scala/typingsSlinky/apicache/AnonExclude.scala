package typingsSlinky.apicache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExclude extends js.Object {
  /** list status codes to specifically exclude (e.g. [404, 403] cache all responses unless they had a 404 or 403 status) */
  var exclude: js.UndefOr[js.Array[Double]] = js.native
  /** list status codes to require (e.g. [200] caches ONLY responses with a success/200 code) */
  var include: js.UndefOr[js.Array[Double]] = js.native
}

object AnonExclude {
  @scala.inline
  def apply(): AnonExclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonExclude]
  }
  @scala.inline
  implicit class AnonExcludeOps[Self <: AnonExclude] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclude(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
  }
  
}

