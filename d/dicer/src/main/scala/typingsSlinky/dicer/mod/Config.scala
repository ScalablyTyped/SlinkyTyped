package typingsSlinky.dicer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * This is the boundary used to detect the beginning of a new part.
    */
  var boundary: js.UndefOr[String] = js.native
  /**
    * If true, preamble header parsing will be performed first.
    */
  var headerFirst: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of header key=>value pairs to parse Default: 2000 (same as node's http).
    */
  var maxHeaderPairs: js.UndefOr[Double] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeaderPairs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeaderPairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeaderPairs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeaderPairs")(js.undefined)
        ret
    }
  }
  
}

