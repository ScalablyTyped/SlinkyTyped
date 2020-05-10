package typingsSlinky.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies the options to be included in a search operation.
  *
  * [Api set: WordApi 1.1]
  */
@js.native
trait SearchOptionsLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a value that indicates whether to ignore all punctuation characters between words. Corresponds to the Ignore punctuation check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var ignorePunct: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a value that indicates whether to ignore all whitespace between words. Corresponds to the Ignore whitespace characters check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var ignoreSpace: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a value that indicates whether to perform a case sensitive search. Corresponds to the Match case check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchCase: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a value that indicates whether to match words that begin with the search string. Corresponds to the Match prefix check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchPrefix: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a value that indicates whether to match words that end with the search string. Corresponds to the Match suffix check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchSuffix: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a value that indicates whether to find operation only entire words, not text that is part of a larger word. Corresponds to the Find whole words only check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchWholeWord: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a value that indicates whether the search will be performed using special search operators. Corresponds to the Use wildcards check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchWildcards: js.UndefOr[Boolean] = js.native
}

object SearchOptionsLoadOptions {
  @scala.inline
  def apply(): SearchOptionsLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptionsLoadOptions]
  }
  @scala.inline
  implicit class SearchOptionsLoadOptionsOps[Self <: SearchOptionsLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePunct(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePunct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePunct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePunct")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSpace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchSuffix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchWholeWord(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchWholeWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchWholeWord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchWholeWord")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchWildcards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchWildcards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchWildcards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchWildcards")(js.undefined)
        ret
    }
  }
  
}

