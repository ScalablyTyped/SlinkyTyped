package typingsSlinky.devextreme.mod.default

import typingsSlinky.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "localization")
@js.native
class localization ()
  extends typingsSlinky.devextreme.mod.DevExpress.localization
/* static members */
@JSImport("devextreme", "localization")
@js.native
object localization extends js.Object {
  
  /**
    * [descr:localization.formatDate(value, format)]
    */
  def formatDate(value: js.Date, format: format): String = js.native
  
  /**
    * [descr:localization.formatMessage(key, value)]
    */
  def formatMessage(key: String, value: String): String = js.native
  def formatMessage(key: String, value: js.Array[String]): String = js.native
  
  /**
    * [descr:localization.formatNumber(value, format)]
    */
  def formatNumber(value: Double, format: format): String = js.native
  
  /**
    * [descr:localization.loadMessages(messages)]
    */
  def loadMessages(messages: js.Any): Unit = js.native
  
  /**
    * [descr:localization.locale()]
    */
  def locale(): String = js.native
  /**
    * [descr:localization.locale(locale)]
    */
  def locale(locale: String): Unit = js.native
  
  /**
    * [descr:localization.parseDate(text, format)]
    */
  def parseDate(text: String, format: format): js.Date = js.native
  
  /**
    * [descr:localization.parseNumber(text, format)]
    */
  def parseNumber(text: String, format: format): Double = js.native
}
