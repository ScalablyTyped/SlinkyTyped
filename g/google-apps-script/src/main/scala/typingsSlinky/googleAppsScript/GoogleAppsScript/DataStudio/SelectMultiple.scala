package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains select multiple information for the config. Its properties determine how the select
  * multiple is displayed in Data Studio.
  *
  * Usage:
  *
  *     var option1 = config.newOptionBuilder()
  *       .setLabel("option label")
  *       .setValue("option_value");
  *
  *     var option2 = config.newOptionBuilder()
  *       .setLabel("second option label")
  *       .setValue("option_value_2");
  *
  *     var info1 = config.newSelectMultiple()
  *       .setId("api_endpoint")
  *       .setName("Data Type")
  *       .setHelpText("Select the data type you're interested in.")
  *       .setAllowOverride(true)
  *       .addOption(option1)
  *       .addOption(option2);
  */
@js.native
trait SelectMultiple extends StObject {
  
  def addOption(optionBuilder: OptionBuilder): SelectMultiple = js.native
  
  def setAllowOverride(allowOverride: Boolean): SelectMultiple = js.native
  
  def setHelpText(helpText: String): SelectMultiple = js.native
  
  def setId(id: String): SelectMultiple = js.native
  
  def setIsDynamic(isDynamic: Boolean): SelectMultiple = js.native
  
  def setName(name: String): SelectMultiple = js.native
}
object SelectMultiple {
  
  @scala.inline
  def apply(
    addOption: OptionBuilder => SelectMultiple,
    setAllowOverride: Boolean => SelectMultiple,
    setHelpText: String => SelectMultiple,
    setId: String => SelectMultiple,
    setIsDynamic: Boolean => SelectMultiple,
    setName: String => SelectMultiple
  ): SelectMultiple = {
    val __obj = js.Dynamic.literal(addOption = js.Any.fromFunction1(addOption), setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setIsDynamic = js.Any.fromFunction1(setIsDynamic), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[SelectMultiple]
  }
  
  @scala.inline
  implicit class SelectMultipleMutableBuilder[Self <: SelectMultiple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOption(value: OptionBuilder => SelectMultiple): Self = StObject.set(x, "addOption", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAllowOverride(value: Boolean => SelectMultiple): Self = StObject.set(x, "setAllowOverride", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpText(value: String => SelectMultiple): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetId(value: String => SelectMultiple): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIsDynamic(value: Boolean => SelectMultiple): Self = StObject.set(x, "setIsDynamic", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetName(value: String => SelectMultiple): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}
