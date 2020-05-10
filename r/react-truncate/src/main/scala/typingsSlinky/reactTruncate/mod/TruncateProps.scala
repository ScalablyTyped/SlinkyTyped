package typingsSlinky.reactTruncate.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactTruncate.reactTruncateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TruncateProps
  extends AllHTMLAttributes[Truncate]
     with ClassAttributes[Truncate] {
  var ellipsis: js.UndefOr[TagMod[Any]] = js.native
  var lines: js.UndefOr[Double | `false`] = js.native
  var onTruncate: js.UndefOr[js.Function1[/* isTruncated */ Boolean, Unit]] = js.native
  var trimWhitespace: js.UndefOr[Boolean] = js.native
}

object TruncateProps {
  @scala.inline
  def apply(): TruncateProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateProps]
  }
  @scala.inline
  implicit class TruncatePropsOps[Self <: TruncateProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEllipsisReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEllipsis(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(js.undefined)
        ret
    }
    @scala.inline
    def withLines(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTruncate(value: /* isTruncated */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTruncate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTruncate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTruncate")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimWhitespace")(js.undefined)
        ret
    }
  }
  
}

