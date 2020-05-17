package typingsSlinky.ngFacebook.mod.ngFacebook

import typingsSlinky.facebookJsSdk.facebook.InitParams
import typingsSlinky.ngFacebook.anon.PartialInitParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFacebookProvider extends js.Object {
  def getAppId(): String = js.native
  def getCustomInit(): InitParams = js.native
  def getPermissions(): String = js.native
  def getVersion(): String = js.native
  def setAppId(appId: String): IFacebookProvider = js.native
  def setCustomInit(customInit: PartialInitParams): IFacebookProvider = js.native
  def setPermissions(permissions: String): IFacebookProvider = js.native
  def setPermissions(permissions: js.Array[String]): IFacebookProvider = js.native
  def setVersion(version: String): IFacebookProvider = js.native
}

