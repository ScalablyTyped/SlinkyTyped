package typingsSlinky.jose.mod.JWK

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jose.joseStrings.embedded
import typingsSlinky.jose.mod.keyOperation
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedX5C extends js.Object {
  
  def algorithms(): Set[String] = js.native
  def algorithms(operation: keyOperation): Set[String] = js.native
  
  val `type`: embedded = js.native
}
@JSImport("jose", "JWK.EmbeddedX5C")
@js.native
object EmbeddedX5C extends TopLevel[EmbeddedX5C]
