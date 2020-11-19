package typingsSlinky.pem.mod

import typingsSlinky.pem.anon.ClientKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pem", "createCSR")
@js.native
object createCSR extends js.Object {
  
  def apply(callback: Callback[ClientKey]): Unit = js.native
  def apply(options: CSRCreationOptions, callback: Callback[ClientKey]): Unit = js.native
}
