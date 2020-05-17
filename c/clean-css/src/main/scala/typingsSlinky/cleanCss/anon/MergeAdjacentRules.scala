package typingsSlinky.cleanCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeAdjacentRules extends js.Object {
  /**
    * Sets all optimizations at this level unless otherwise specified
    */
  var all: js.UndefOr[Boolean] = js.native
  /**
    * Controls adjacent rules merging; defaults to true
    */
  var mergeAdjacentRules: js.UndefOr[Boolean] = js.native
  /**
    * Controls merging properties into shorthands; defaults to true
    */
  var mergeIntoShorthands: js.UndefOr[Boolean] = js.native
  /**
    * Controls `@media` merging; defaults to true
    */
  var mergeMedia: js.UndefOr[Boolean] = js.native
  /**
    * Controls non-adjacent rule merging; defaults to true
    */
  var mergeNonAdjacentRules: js.UndefOr[Boolean] = js.native
  /**
    * Controls semantic merging; defaults to false
    */
  var mergeSemantically: js.UndefOr[Boolean] = js.native
  /**
    * Controls property overriding based on understandably; defaults to true
    */
  var overrideProperties: js.UndefOr[Boolean] = js.native
  /**
    * Controls non-adjacent rule reducing; defaults to true
    */
  var reduceNonAdjacentRules: js.UndefOr[Boolean] = js.native
  /**
    * Controls duplicate `@font-face` removing; defaults to true
    */
  var removeDuplicateFontRules: js.UndefOr[Boolean] = js.native
  /**
    * Controls duplicate `@media` removing; defaults to true
    */
  var removeDuplicateMediaBlocks: js.UndefOr[Boolean] = js.native
  /**
    * Controls duplicate rules removing; defaults to true
    */
  var removeDuplicateRules: js.UndefOr[Boolean] = js.native
  /**
    * Controls removing empty rules and nested blocks; defaults to `true`
    */
  var removeEmpty: js.UndefOr[Boolean] = js.native
  /**
    * Controls unused at rule removing; defaults to false (available since 4.1.0)
    */
  var removeUnusedAtRules: js.UndefOr[Boolean] = js.native
  /**
    * Controls rule restructuring; defaults to false
    */
  var restructureRules: js.UndefOr[Boolean] = js.native
  /**
    * Controls which properties won't be optimized, defaults to `[]` which means all will be optimized (since 4.1.0)
    */
  var skipProperties: js.UndefOr[js.Array[String]] = js.native
}

object MergeAdjacentRules {
  @scala.inline
  def apply(): MergeAdjacentRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeAdjacentRules]
  }
  @scala.inline
  implicit class MergeAdjacentRulesOps[Self <: MergeAdjacentRules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeAdjacentRules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeAdjacentRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeAdjacentRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeAdjacentRules")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeIntoShorthands(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeIntoShorthands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeIntoShorthands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeIntoShorthands")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeMedia(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeMedia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeMedia")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeNonAdjacentRules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeNonAdjacentRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeNonAdjacentRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeNonAdjacentRules")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeSemantically(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeSemantically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeSemantically: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeSemantically")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withReduceNonAdjacentRules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduceNonAdjacentRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReduceNonAdjacentRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduceNonAdjacentRules")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveDuplicateFontRules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDuplicateFontRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveDuplicateFontRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDuplicateFontRules")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveDuplicateMediaBlocks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDuplicateMediaBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveDuplicateMediaBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDuplicateMediaBlocks")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveDuplicateRules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDuplicateRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveDuplicateRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDuplicateRules")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveUnusedAtRules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUnusedAtRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveUnusedAtRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUnusedAtRules")(js.undefined)
        ret
    }
    @scala.inline
    def withRestructureRules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restructureRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestructureRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restructureRules")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipProperties(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipProperties")(js.undefined)
        ret
    }
  }
  
}

