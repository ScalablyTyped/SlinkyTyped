package typingsSlinky.googleAppsScript.GoogleAppsScript.Charts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait StringFilterBuilder extends StObject {
  
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
  implicit class StringFilterBuilderMutableBuilder[Self <: StringFilterBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetCaseSensitive(value: Boolean => StringFilterBuilder): Self = StObject.set(x, "setCaseSensitive", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMatchType(value: MatchType => StringFilterBuilder): Self = StObject.set(x, "setMatchType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRealtimeTrigger(value: Boolean => StringFilterBuilder): Self = StObject.set(x, "setRealtimeTrigger", js.Any.fromFunction1(value))
  }
}
