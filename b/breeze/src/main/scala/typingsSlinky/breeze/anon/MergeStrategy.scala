package typingsSlinky.breeze.anon

import typingsSlinky.breeze.breeze.MergeStrategySymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeStrategy extends js.Object {
  var mergeStrategy: js.UndefOr[MergeStrategySymbol] = js.native
  var metadataVersionFn: js.UndefOr[js.Function1[/* any */ js.Any, Unit]] = js.native
}

object MergeStrategy {
  @scala.inline
  def apply(): MergeStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeStrategy]
  }
  @scala.inline
  implicit class MergeStrategyOps[Self <: MergeStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMergeStrategy(value: MergeStrategySymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataVersionFn(value: /* any */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataVersionFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMetadataVersionFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataVersionFn")(js.undefined)
        ret
    }
  }
  
}

