package typingsSlinky.powerappsComponentFramework.ComponentFramework

import typingsSlinky.powerappsComponentFramework.ComponentFramework.UserSettingApi.DateFormattingInfo
import typingsSlinky.powerappsComponentFramework.ComponentFramework.UserSettingApi.NumberFormattingInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for context.userSettings
  */
@js.native
trait UserSettings extends StObject {
  
  /**
    * Date formatting information as retrieved from the server.
    */
  var dateFormattingInfo: DateFormattingInfo = js.native
  
  /**
    * Gets the offset in minutes from UTC for the given date
    * @param date date to get the offset from utc for
    */
  def getTimeZoneOffsetMinutes(): Double = js.native
  def getTimeZoneOffsetMinutes(date: js.Date): Double = js.native
  
  /**
    * Returns true if the language is right to left
    */
  var isRTL: Boolean = js.native
  
  /**
    * Current user's language id
    *
    */
  var languageId: Double = js.native
  
  /**
    * Number formatting information as retrieved from the server.
    */
  var numberFormattingInfo: NumberFormattingInfo = js.native
  
  /**
    * Current user roles
    */
  var securityRoles: js.Array[String] = js.native
  
  /**
    * The id of the current user
    */
  var userId: String = js.native
  
  /**
    * The username of the current user
    */
  var userName: String = js.native
}
