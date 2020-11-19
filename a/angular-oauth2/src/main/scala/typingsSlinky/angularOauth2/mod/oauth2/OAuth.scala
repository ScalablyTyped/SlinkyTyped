package typingsSlinky.angularOauth2.mod.oauth2

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth extends js.Object {
  
  def getAccessToken(data: Data): IPromise[String] = js.native
  def getAccessToken(data: Data, options: js.Any): IPromise[String] = js.native
  
  def getRefreshToken(): IPromise[String] = js.native
  def getRefreshToken(data: js.UndefOr[scala.Nothing], options: js.Any): IPromise[String] = js.native
  def getRefreshToken(data: Data): IPromise[String] = js.native
  def getRefreshToken(data: Data, options: js.Any): IPromise[String] = js.native
  
  def isAuthenticated(): Boolean = js.native
  
  def revokeToken(): IPromise[String] = js.native
  def revokeToken(data: js.UndefOr[scala.Nothing], options: js.Any): IPromise[String] = js.native
  def revokeToken(data: Data): IPromise[String] = js.native
  def revokeToken(data: Data, options: js.Any): IPromise[String] = js.native
}
