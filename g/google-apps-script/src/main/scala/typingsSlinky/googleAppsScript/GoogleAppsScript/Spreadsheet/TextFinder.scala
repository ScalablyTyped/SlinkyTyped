package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Find or replace text within a range, sheet or spreadsheet. Can also specify search options.
  */
@js.native
trait TextFinder extends js.Object {
  def findAll(): js.Array[Range] = js.native
  def findNext(): Range | Null = js.native
  def findPrevious(): Range | Null = js.native
  def getCurrentMatch(): Range | Null = js.native
  def ignoreDiacritics(ignoreDiacritics: Boolean): TextFinder = js.native
  def matchCase(matchCase: Boolean): TextFinder = js.native
  def matchEntireCell(matchEntireCell: Boolean): TextFinder = js.native
  def matchFormulaText(matchFormulaText: Boolean): TextFinder = js.native
  def replaceAllWith(replaceText: String): Integer = js.native
  def replaceWith(replaceText: String): Integer = js.native
  def startFrom(startRange: Range): TextFinder = js.native
  def useRegularExpression(useRegEx: Boolean): TextFinder = js.native
}

object TextFinder {
  @scala.inline
  def apply(
    findAll: () => js.Array[Range],
    findNext: () => Range | Null,
    findPrevious: () => Range | Null,
    getCurrentMatch: () => Range | Null,
    ignoreDiacritics: Boolean => TextFinder,
    matchCase: Boolean => TextFinder,
    matchEntireCell: Boolean => TextFinder,
    matchFormulaText: Boolean => TextFinder,
    replaceAllWith: String => Integer,
    replaceWith: String => Integer,
    startFrom: Range => TextFinder,
    useRegularExpression: Boolean => TextFinder
  ): TextFinder = {
    val __obj = js.Dynamic.literal(findAll = js.Any.fromFunction0(findAll), findNext = js.Any.fromFunction0(findNext), findPrevious = js.Any.fromFunction0(findPrevious), getCurrentMatch = js.Any.fromFunction0(getCurrentMatch), ignoreDiacritics = js.Any.fromFunction1(ignoreDiacritics), matchCase = js.Any.fromFunction1(matchCase), matchEntireCell = js.Any.fromFunction1(matchEntireCell), matchFormulaText = js.Any.fromFunction1(matchFormulaText), replaceAllWith = js.Any.fromFunction1(replaceAllWith), replaceWith = js.Any.fromFunction1(replaceWith), startFrom = js.Any.fromFunction1(startFrom), useRegularExpression = js.Any.fromFunction1(useRegularExpression))
    __obj.asInstanceOf[TextFinder]
  }
  @scala.inline
  implicit class TextFinderOps[Self <: TextFinder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindAll(value: () => js.Array[Range]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFindNext(value: () => Range | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFindPrevious(value: () => Range | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findPrevious")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentMatch(value: () => Range | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentMatch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIgnoreDiacritics(value: Boolean => TextFinder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDiacritics")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatchCase(value: Boolean => TextFinder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatchEntireCell(value: Boolean => TextFinder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchEntireCell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatchFormulaText(value: Boolean => TextFinder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchFormulaText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceAllWith(value: String => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceWith(value: String => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartFrom(value: Range => TextFinder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUseRegularExpression(value: Boolean => TextFinder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRegularExpression")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

