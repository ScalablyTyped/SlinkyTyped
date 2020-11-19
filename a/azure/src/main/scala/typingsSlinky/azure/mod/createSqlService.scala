package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "createSqlService")
@js.native
object createSqlService extends js.Object {
  
  def apply(serverName: String, administratorLogin: String, administratorLoginPassword: String): SqlService = js.native
  def apply(
    serverName: String,
    administratorLogin: String,
    administratorLoginPassword: String,
    host: js.UndefOr[scala.Nothing],
    acsHost: js.UndefOr[scala.Nothing],
    authenticationProvider: String
  ): SqlService = js.native
  def apply(
    serverName: String,
    administratorLogin: String,
    administratorLoginPassword: String,
    host: js.UndefOr[scala.Nothing],
    acsHost: String
  ): SqlService = js.native
  def apply(
    serverName: String,
    administratorLogin: String,
    administratorLoginPassword: String,
    host: js.UndefOr[scala.Nothing],
    acsHost: String,
    authenticationProvider: String
  ): SqlService = js.native
  def apply(serverName: String, administratorLogin: String, administratorLoginPassword: String, host: String): SqlService = js.native
  def apply(
    serverName: String,
    administratorLogin: String,
    administratorLoginPassword: String,
    host: String,
    acsHost: js.UndefOr[scala.Nothing],
    authenticationProvider: String
  ): SqlService = js.native
  def apply(
    serverName: String,
    administratorLogin: String,
    administratorLoginPassword: String,
    host: String,
    acsHost: String
  ): SqlService = js.native
  def apply(
    serverName: String,
    administratorLogin: String,
    administratorLoginPassword: String,
    host: String,
    acsHost: String,
    authenticationProvider: String
  ): SqlService = js.native
}
