package typingsSlinky.breeze.breeze

import typingsSlinky.breeze.breeze.core.EnumSymbol
import typingsSlinky.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeStrategy extends IEnum {
  var Disallowed: MergeStrategySymbol = js.native
  var OverwriteChanges: MergeStrategySymbol = js.native
  var PreserveChanges: MergeStrategySymbol = js.native
  var SkipMerge: MergeStrategySymbol = js.native
}

object MergeStrategy {
  @scala.inline
  def apply(
    Disallowed: MergeStrategySymbol,
    OverwriteChanges: MergeStrategySymbol,
    PreserveChanges: MergeStrategySymbol,
    SkipMerge: MergeStrategySymbol,
    contains: js.Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): MergeStrategy = {
    val __obj = js.Dynamic.literal(Disallowed = Disallowed.asInstanceOf[js.Any], OverwriteChanges = OverwriteChanges.asInstanceOf[js.Any], PreserveChanges = PreserveChanges.asInstanceOf[js.Any], SkipMerge = SkipMerge.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
    __obj.asInstanceOf[MergeStrategy]
  }
  @scala.inline
  implicit class MergeStrategyOps[Self <: MergeStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisallowed(value: MergeStrategySymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Disallowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverwriteChanges(value: MergeStrategySymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverwriteChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreserveChanges(value: MergeStrategySymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreserveChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkipMerge(value: MergeStrategySymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkipMerge")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

