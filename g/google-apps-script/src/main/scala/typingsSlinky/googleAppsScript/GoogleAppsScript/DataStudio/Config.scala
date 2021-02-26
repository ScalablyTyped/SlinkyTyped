package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the configuration entries for a connector. These configuration entries define what
  * questions are asked when adding a new connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var info_entry = config.newInfo()
  *       .setId("info_id")
  *       .setHelpText("This connector can connect to multiple data endpoints.");
  */
@js.native
trait Config extends StObject {
  
  def build(): Config = js.native
  
  def newCheckbox(): Checkbox = js.native
  
  def newInfo(): Info = js.native
  
  def newOptionBuilder(): OptionBuilder = js.native
  
  def newSelectMultiple(): SelectMultiple = js.native
  
  def newSelectSingle(): SelectSingle = js.native
  
  def newTextArea(): TextArea = js.native
  
  def newTextInput(): TextInput = js.native
  
  def printJson(): String = js.native
  
  def setDateRangeRequired(dateRangeRequired: Boolean): Config = js.native
  
  def setIsSteppedConfig(isSteppedConfig: Boolean): Config = js.native
}
object Config {
  
  @scala.inline
  def apply(
    build: () => Config,
    newCheckbox: () => Checkbox,
    newInfo: () => Info,
    newOptionBuilder: () => OptionBuilder,
    newSelectMultiple: () => SelectMultiple,
    newSelectSingle: () => SelectSingle,
    newTextArea: () => TextArea,
    newTextInput: () => TextInput,
    printJson: () => String,
    setDateRangeRequired: Boolean => Config,
    setIsSteppedConfig: Boolean => Config
  ): Config = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), newCheckbox = js.Any.fromFunction0(newCheckbox), newInfo = js.Any.fromFunction0(newInfo), newOptionBuilder = js.Any.fromFunction0(newOptionBuilder), newSelectMultiple = js.Any.fromFunction0(newSelectMultiple), newSelectSingle = js.Any.fromFunction0(newSelectSingle), newTextArea = js.Any.fromFunction0(newTextArea), newTextInput = js.Any.fromFunction0(newTextInput), printJson = js.Any.fromFunction0(printJson), setDateRangeRequired = js.Any.fromFunction1(setDateRangeRequired), setIsSteppedConfig = js.Any.fromFunction1(setIsSteppedConfig))
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: () => Config): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCheckbox(value: () => Checkbox): Self = StObject.set(x, "newCheckbox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewInfo(value: () => Info): Self = StObject.set(x, "newInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewOptionBuilder(value: () => OptionBuilder): Self = StObject.set(x, "newOptionBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSelectMultiple(value: () => SelectMultiple): Self = StObject.set(x, "newSelectMultiple", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSelectSingle(value: () => SelectSingle): Self = StObject.set(x, "newSelectSingle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTextArea(value: () => TextArea): Self = StObject.set(x, "newTextArea", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTextInput(value: () => TextInput): Self = StObject.set(x, "newTextInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDateRangeRequired(value: Boolean => Config): Self = StObject.set(x, "setDateRangeRequired", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIsSteppedConfig(value: Boolean => Config): Self = StObject.set(x, "setIsSteppedConfig", js.Any.fromFunction1(value))
  }
}
