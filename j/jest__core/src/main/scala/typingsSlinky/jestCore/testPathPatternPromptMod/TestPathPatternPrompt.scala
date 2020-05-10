package typingsSlinky.jestCore.testPathPatternPromptMod

import typingsSlinky.jestRunner.mod.Test
import typingsSlinky.std.ScrollOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PatternPrompt * / any */ @js.native
trait TestPathPatternPrompt extends js.Object {
  var _searchSources: js.UndefOr[SearchSources] = js.native
  def _getMatchedTests(pattern: String): js.Array[Test] = js.native
  def _onChange(pattern: String, options: ScrollOptions): Unit = js.native
  def _printPrompt(pattern: String): Unit = js.native
  def updateSearchSources(searchSources: SearchSources): Unit = js.native
}

object TestPathPatternPrompt {
  @scala.inline
  def apply(
    _getMatchedTests: String => js.Array[Test],
    _onChange: (String, ScrollOptions) => Unit,
    _printPrompt: String => Unit,
    updateSearchSources: SearchSources => Unit
  ): TestPathPatternPrompt = {
    val __obj = js.Dynamic.literal(_getMatchedTests = js.Any.fromFunction1(_getMatchedTests), _onChange = js.Any.fromFunction2(_onChange), _printPrompt = js.Any.fromFunction1(_printPrompt), updateSearchSources = js.Any.fromFunction1(updateSearchSources))
    __obj.asInstanceOf[TestPathPatternPrompt]
  }
  @scala.inline
  implicit class TestPathPatternPromptOps[Self <: TestPathPatternPrompt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_getMatchedTests(value: String => js.Array[Test]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getMatchedTests")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_onChange(value: (String, ScrollOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def with_printPrompt(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_printPrompt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateSearchSources(value: SearchSources => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSearchSources")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_searchSources(value: SearchSources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_searchSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_searchSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_searchSources")(js.undefined)
        ret
    }
  }
  
}

