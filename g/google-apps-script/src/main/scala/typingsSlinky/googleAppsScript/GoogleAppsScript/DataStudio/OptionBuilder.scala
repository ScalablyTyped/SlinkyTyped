package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for creating options for SelectSingles and SelectMultiples.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var option1 = config.newOptionBuilder()
  *       .setLabel("option label")
  *       .setValue("option_value");
  *
  *     var option2 = config.newOptionBuilder()
  *       .setLabel("second option label")
  *       .setValue("option_value_2");
  *
  *     var info1 = config.newSelectSingle()
  *       .setId("api_endpoint")
  *       .setName("Data Type")
  *       .setHelpText("Select the data type you're interested in.")
  *       .addOption(option1)
  *       .addOption(option2);
  */
@js.native
trait OptionBuilder extends StObject {
  
  def setLabel(label: String): OptionBuilder = js.native
  
  def setValue(value: String): OptionBuilder = js.native
}
object OptionBuilder {
  
  @scala.inline
  def apply(setLabel: String => OptionBuilder, setValue: String => OptionBuilder): OptionBuilder = {
    val __obj = js.Dynamic.literal(setLabel = js.Any.fromFunction1(setLabel), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[OptionBuilder]
  }
  
  @scala.inline
  implicit class OptionBuilderMutableBuilder[Self <: OptionBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetLabel(value: String => OptionBuilder): Self = StObject.set(x, "setLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: String => OptionBuilder): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
  }
}
