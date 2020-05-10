package typingsSlinky.googleAppsScript.GoogleAppsScript.Properties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows scripts to store simple data in key-value pairs scoped to one script, one user of a
  * script, or one document in which an add-on is used. Properties cannot be shared between scripts.
  * For more information about when to use each type of property, see the guide to the Properties service.
  *
  *     // Sets three properties of different types.
  *     var documentProperties = PropertiesService.getDocumentProperties();
  *     var scriptProperties = PropertiesService.getScriptProperties();
  *     var userProperties = PropertiesService.getUserProperties();
  *
  *     documentProperties.setProperty('DAYS_TO_FETCH', '5');
  *     scriptProperties.setProperty('SERVER_URL', 'http://www.example.com/MyWeatherService/');
  *     userProperties.setProperty('DISPLAY_UNITS', 'metric');
  */
@js.native
trait PropertiesService extends js.Object {
  def getDocumentProperties(): typingsSlinky.googleAppsScript.GoogleAppsScript.Properties.Properties = js.native
  def getScriptProperties(): typingsSlinky.googleAppsScript.GoogleAppsScript.Properties.Properties = js.native
  def getUserProperties(): typingsSlinky.googleAppsScript.GoogleAppsScript.Properties.Properties = js.native
}

object PropertiesService {
  @scala.inline
  def apply(
    getDocumentProperties: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Properties.Properties,
    getScriptProperties: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Properties.Properties,
    getUserProperties: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Properties.Properties
  ): PropertiesService = {
    val __obj = js.Dynamic.literal(getDocumentProperties = js.Any.fromFunction0(getDocumentProperties), getScriptProperties = js.Any.fromFunction0(getScriptProperties), getUserProperties = js.Any.fromFunction0(getUserProperties))
    __obj.asInstanceOf[PropertiesService]
  }
  @scala.inline
  implicit class PropertiesServiceOps[Self <: PropertiesService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDocumentProperties(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Properties.Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocumentProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScriptProperties(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Properties.Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserProperties(value: () => typingsSlinky.googleAppsScript.GoogleAppsScript.Properties.Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserProperties")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

