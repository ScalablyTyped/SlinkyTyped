package typingsSlinky.reactFacebookLogin.mod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.Node
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactFacebookLogin.reactFacebookLoginStrings.medium
import typingsSlinky.reactFacebookLogin.reactFacebookLoginStrings.metro
import typingsSlinky.reactFacebookLogin.reactFacebookLoginStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactFacebookLoginProps extends js.Object {
  
  var appId: String = js.native
  
  var authType: js.UndefOr[String] = js.native
  
  var autoLoad: js.UndefOr[Boolean] = js.native
  
  var buttonStyle: js.UndefOr[CSSProperties] = js.native
  
  def callback(userInfo: ReactFacebookFailureResponse): Unit = js.native
  def callback(userInfo: ReactFacebookLoginInfo): Unit = js.native
  
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  
  var cookie: js.UndefOr[Boolean] = js.native
  
  var cssClass: js.UndefOr[String] = js.native
  
  var disableMobileRedirect: js.UndefOr[Boolean] = js.native
  
  var fields: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[ReactElement] = js.native
  
  var isDisabled: js.UndefOr[Boolean] = js.native
  
  var isMobile: js.UndefOr[Boolean] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var onClick: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.native
  
  var onFailure: js.UndefOr[js.Function1[/* response */ ReactFacebookFailureResponse, Unit]] = js.native
  
  var reAuthenticate: js.UndefOr[Boolean] = js.native
  
  var redirectUri: js.UndefOr[String] = js.native
  
  var responseType: js.UndefOr[String] = js.native
  
  var returnScopes: js.UndefOr[Boolean] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[small | medium | metro] = js.native
  
  var state: js.UndefOr[String] = js.native
  
  var tag: js.UndefOr[Node | ReactComponentClass[_]] = js.native
  
  var textButton: js.UndefOr[String] = js.native
  
  var typeButton: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[String] = js.native
  
  var xfbml: js.UndefOr[Boolean] = js.native
}
