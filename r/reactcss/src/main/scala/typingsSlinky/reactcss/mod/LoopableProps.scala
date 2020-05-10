package typingsSlinky.reactcss.mod

import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoopableProps
  extends Props[js.Any] {
  var even: js.UndefOr[Boolean] = js.native
  var `first-child`: js.UndefOr[Boolean] = js.native
  var `last-child`: js.UndefOr[Boolean] = js.native
  var `nth-child`: Double = js.native
  var odd: js.UndefOr[Boolean] = js.native
}

object LoopableProps {
  @scala.inline
  def apply(`nth-child`: Double): LoopableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nth-child")(`nth-child`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoopableProps]
  }
  @scala.inline
  implicit class LoopablePropsOps[Self <: LoopableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withNth-child`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nth-child")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEven(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("even")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEven: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("even")(js.undefined)
        ret
    }
    @scala.inline
    def `withFirst-child`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first-child")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFirst-child`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first-child")(js.undefined)
        ret
    }
    @scala.inline
    def `withLast-child`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last-child")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLast-child`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last-child")(js.undefined)
        ret
    }
    @scala.inline
    def withOdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("odd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("odd")(js.undefined)
        ret
    }
  }
  
}

