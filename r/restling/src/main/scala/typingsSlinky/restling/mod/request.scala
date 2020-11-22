package typingsSlinky.restling.mod

import typingsSlinky.bluebird.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("restling", "request")
@js.native
object request extends js.Object {
  
  def apply(url: String): ^[RestlingResult] = js.native
  def apply(url: String, options: RestlingOptions): ^[RestlingResult] = js.native
}
