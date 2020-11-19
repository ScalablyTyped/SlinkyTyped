package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.appview
import typingsSlinky.chromeApps.chromeAppsStrings.webview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends js.Object {
  
  /**
    * ❗ document.close is not available in packaged apps. ❗
    */
  def close(): Unit = js.native
  
  /**
    * ❗ document.cookie is not available in packaged apps. ❗
    * Packaged app pages are not rendered on the server, so there is no need to use these.
    */
  var cookie: String = js.native
  
  @JSName("createElement")
  def createElement_appview(element: appview): HTMLAppViewElement = js.native
  @JSName("createElement")
  def createElement_webview(element: webview): HTMLWebViewElement = js.native
  
  /**
    * ❗ document.open is not available in packaged apps. ❗
    */
  def open(): Document = js.native
  def open(
    url: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    features: js.UndefOr[scala.Nothing],
    replace: Boolean
  ): Document = js.native
  def open(url: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], features: String): Document = js.native
  def open(
    url: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    features: String,
    replace: Boolean
  ): Document = js.native
  def open(url: js.UndefOr[scala.Nothing], name: String): Document = js.native
  def open(
    url: js.UndefOr[scala.Nothing],
    name: String,
    features: js.UndefOr[scala.Nothing],
    replace: Boolean
  ): Document = js.native
  def open(url: js.UndefOr[scala.Nothing], name: String, features: String): Document = js.native
  def open(url: js.UndefOr[scala.Nothing], name: String, features: String, replace: Boolean): Document = js.native
  def open(url: String): Document = js.native
  def open(
    url: String,
    name: js.UndefOr[scala.Nothing],
    features: js.UndefOr[scala.Nothing],
    replace: Boolean
  ): Document = js.native
  def open(url: String, name: js.UndefOr[scala.Nothing], features: String): Document = js.native
  def open(url: String, name: js.UndefOr[scala.Nothing], features: String, replace: Boolean): Document = js.native
  def open(url: String, name: String): Document = js.native
  def open(url: String, name: String, features: js.UndefOr[scala.Nothing], replace: Boolean): Document = js.native
  def open(url: String, name: String, features: String): Document = js.native
  def open(url: String, name: String, features: String, replace: Boolean): Document = js.native
  
  /**
    * ❗ document.write is not available in packaged apps. ❗
    */
  def write(content: String*): Unit = js.native
}
