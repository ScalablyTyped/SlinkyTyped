package typingsSlinky.hapiHoek.mod.merge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * When true, array value from `source` is merged with the existing value in `target`.
    *
    * @default false
    */
  val mergeArrays: js.UndefOr[Boolean] = js.native
  /**
    * When true, null value from `source` overrides existing value in `target`.
    *
    * @default true
    */
  val nullOverride: js.UndefOr[Boolean] = js.native
  /**
    * Compare symbol properties.
    *
    * @default true
    */
  val symbols: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMergeArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeArrays")(js.undefined)
        ret
    }
    @scala.inline
    def withNullOverride(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbols(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(js.undefined)
        ret
    }
  }
  
}

