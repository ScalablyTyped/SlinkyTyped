package typingsSlinky.jestImageSnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PixelmatchOptions extends js.Object {
  /** If true, disables detecting and ignoring anti-aliased pixels. false by default. */
  val includeAA: js.UndefOr[Boolean] = js.native
  /** Matching threshold, ranges from 0 to 1. Smaller values make the comparison more sensitive. 0.1 by default. */
  val threshold: js.UndefOr[Double] = js.native
}

object PixelmatchOptions {
  @scala.inline
  def apply(): PixelmatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PixelmatchOptions]
  }
  @scala.inline
  implicit class PixelmatchOptionsOps[Self <: PixelmatchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeAA(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAA")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
  }
  
}

