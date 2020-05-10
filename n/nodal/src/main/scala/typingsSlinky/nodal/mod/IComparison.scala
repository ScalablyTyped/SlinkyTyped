package typingsSlinky.nodal.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComparison
  extends /* item */ StringDictionary[js.Any] {
  var __count: js.UndefOr[Double] = js.native
  var __offset: js.UndefOr[Double] = js.native
  var __order: js.UndefOr[String] = js.native
}

object IComparison {
  @scala.inline
  def apply(): IComparison = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComparison]
  }
  @scala.inline
  implicit class IComparisonOps[Self <: IComparison] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__count")(js.undefined)
        ret
    }
    @scala.inline
    def with__offset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__offset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__offset")(js.undefined)
        ret
    }
    @scala.inline
    def with__order(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__order: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__order")(js.undefined)
        ret
    }
  }
  
}

