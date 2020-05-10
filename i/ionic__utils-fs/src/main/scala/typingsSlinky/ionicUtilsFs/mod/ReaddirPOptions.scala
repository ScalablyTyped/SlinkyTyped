package typingsSlinky.ionicUtilsFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaddirPOptions extends js.Object {
  /**
    * Filter out items from the walk process from the final result.
    *
    * @return `true` to keep, otherwise the item is filtered out
    */
  val filter: js.UndefOr[js.Function1[/* item */ WalkerItem, Boolean]] = js.native
  /**
    * Called whenever an error occurs during the walk process.
    *
    * If excluded, the function will throw an error when first encountered.
    */
  val onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.native
  val walkerOptions: js.UndefOr[WalkerOptions] = js.native
}

object ReaddirPOptions {
  @scala.inline
  def apply(): ReaddirPOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReaddirPOptions]
  }
  @scala.inline
  implicit class ReaddirPOptionsOps[Self <: ReaddirPOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: /* item */ WalkerItem => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* err */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withWalkerOptions(value: WalkerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walkerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWalkerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walkerOptions")(js.undefined)
        ret
    }
  }
  
}

