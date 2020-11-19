package typingsSlinky.ldclientJs.mod

import typingsSlinky.ldclientJsCommon.mod.LDUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ldclient-js", "initialize")
@js.native
object initialize extends js.Object {
  
  def apply(envKey: String, user: LDUser): LDClient = js.native
  def apply(envKey: String, user: LDUser, options: LDOptions): LDClient = js.native
}
