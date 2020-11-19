package typingsSlinky.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the settings that raised the settingsChanged event.
  * 
  * To add an event handler for the settingsChanged event, use the addHandlerAsync method of the 
  * {@link Office.Settings} object.
  * 
  * The settingsChanged event fires only when your add-in's script calls the Settings.saveAsync method to persist 
  * the in-memory copy of the settings into the document file. The settingsChanged event is not triggered when the 
  * Settings.set or Settings.remove methods are called.
  * 
  * The settingsChanged event was designed to let you to handle potential conflicts when two or more users are 
  * attempting to save settings at the same time when your add-in is used in a shared (coauthored) document.
  * 
  * **Important**: Your add-in's code can register a handler for the settingsChanged event when the add-in 
  * is running with any Excel client, but the event will fire only when the add-in is loaded with a spreadsheet 
  * that is opened in Excel on the web, and more than one user is editing the spreadsheet (coauthoring). 
  * Therefore, effectively the settingsChanged event is supported only in Excel on the web in coauthoring scenarios.
  */
@js.native
trait SettingsChangedEventArgs extends js.Object {
  
  /**
    * Gets an {@link Office.Settings} object that represents the settings that raised the settingsChanged event.
    */
  var settings: Settings = js.native
  
  /**
    * Get an {@link Office.EventType} enumeration value that identifies the kind of event that was raised.
    */
  var `type`: EventType = js.native
}
object SettingsChangedEventArgs {
  
  @scala.inline
  def apply(settings: Settings, `type`: EventType): SettingsChangedEventArgs = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsChangedEventArgs]
  }
  
  @scala.inline
  implicit class SettingsChangedEventArgsOps[Self <: SettingsChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSettings(value: Settings): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EventType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
