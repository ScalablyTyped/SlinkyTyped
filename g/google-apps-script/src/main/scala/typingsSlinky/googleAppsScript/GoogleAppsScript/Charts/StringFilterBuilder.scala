package typingsSlinky.googleAppsScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for string filter controls.
  *
  * A string filter is a simple text input field that lets the user filter data via string
  * matching. Given a column of type string and matching options, this control filters out the rows
  * that don't match the term that's in the input field.
  *
  * For more details, see the Gviz
  * documentation.
  */
@js.native
trait StringFilterBuilder extends js.Object {
  def setCaseSensitive(caseSensitive: Boolean): StringFilterBuilder = js.native
  def setMatchType(matchType: MatchType): StringFilterBuilder = js.native
  def setRealtimeTrigger(realtimeTrigger: Boolean): StringFilterBuilder = js.native
}

object StringFilterBuilder {
  @scala.inline
  def apply(
    setCaseSensitive: Boolean => StringFilterBuilder,
    setMatchType: MatchType => StringFilterBuilder,
    setRealtimeTrigger: Boolean => StringFilterBuilder
  ): StringFilterBuilder = {
    val __obj = js.Dynamic.literal(setCaseSensitive = js.Any.fromFunction1(setCaseSensitive), setMatchType = js.Any.fromFunction1(setMatchType), setRealtimeTrigger = js.Any.fromFunction1(setRealtimeTrigger))
    __obj.asInstanceOf[StringFilterBuilder]
  }
  @scala.inline
  implicit class StringFilterBuilderOps[Self <: StringFilterBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetCaseSensitive(value: Boolean => StringFilterBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCaseSensitive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMatchType(value: MatchType => StringFilterBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMatchType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRealtimeTrigger(value: Boolean => StringFilterBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRealtimeTrigger")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

