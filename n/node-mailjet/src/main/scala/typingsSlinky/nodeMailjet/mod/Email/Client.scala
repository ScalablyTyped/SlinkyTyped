package typingsSlinky.nodeMailjet.mod.Email

import typingsSlinky.nodeMailjet.mod.ConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends js.Object {
  
  def get(action: String): GetResource = js.native
  def get(action: String, options: ConfigOptions): GetResource = js.native
  
  def post(action: String): PostResource = js.native
  def post(action: String, options: ConfigOptions): PostResource = js.native
  
  def put(action: String): PutResource = js.native
  def put(action: String, options: ConfigOptions): PutResource = js.native
}
