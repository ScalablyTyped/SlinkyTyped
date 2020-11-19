package typingsSlinky.ckeditor.CKEDITOR.plugins.embedBase

import typingsSlinky.ckeditor.CKEDITOR.plugins.widget.definition
import typingsSlinky.ckeditor.CKEDITOR.template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait baseDefinition extends definition {
  
  def getErrorMessage(messageTypeOrMessage: String): String = js.native
  def getErrorMessage(messageTypeOrMessage: String, url: js.UndefOr[scala.Nothing], suffix: String): String = js.native
  def getErrorMessage(messageTypeOrMessage: String, url: String): String = js.native
  def getErrorMessage(messageTypeOrMessage: String, url: String, suffix: String): String = js.native
  
  def isUrlValid(url: String): Boolean = js.native
  
  def loadContent(url: String): request = js.native
  def loadContent(
    url: String,
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    noNotifications: Boolean
  ): request = js.native
  def loadContent(
    url: String,
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* error */ String, Unit]
  ): request = js.native
  def loadContent(
    url: String,
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* error */ String, Unit],
    noNotifications: Boolean
  ): request = js.native
  def loadContent(url: String, callback: js.Function0[Unit]): request = js.native
  def loadContent(
    url: String,
    callback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    noNotifications: Boolean
  ): request = js.native
  def loadContent(url: String, callback: js.Function0[Unit], errorCallback: js.Function1[/* error */ String, Unit]): request = js.native
  def loadContent(
    url: String,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* error */ String, Unit],
    noNotifications: Boolean
  ): request = js.native
  
  var providerUrl: template = js.native
  
  var urlRegExp: js.RegExp = js.native
}
