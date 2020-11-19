package typingsSlinky.randomJs

import typingsSlinky.randomJs.typesMod.StringDistribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("random-js/dist/distribution/string", JSImport.Namespace)
@js.native
object stringMod extends js.Object {
  
  def string(): StringDistribution = js.native
  def string(pool: String): StringDistribution = js.native
}
