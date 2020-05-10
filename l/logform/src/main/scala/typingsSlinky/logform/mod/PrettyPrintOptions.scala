package typingsSlinky.logform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrettyPrintOptions extends js.Object {
  /**
    * Colorizes the message if set to `true`. Defaults to `false`.
    */
  var colorize: js.UndefOr[Boolean] = js.native
  /**
    * A `number` that specifies the maximum depth of the `info` object being stringified by
    * `util.inspect`. Defaults to `2`.
    */
  var depth: js.UndefOr[Double] = js.native
}

object PrettyPrintOptions {
  @scala.inline
  def apply(): PrettyPrintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrettyPrintOptions]
  }
  @scala.inline
  implicit class PrettyPrintOptionsOps[Self <: PrettyPrintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorize")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
  }
  
}

