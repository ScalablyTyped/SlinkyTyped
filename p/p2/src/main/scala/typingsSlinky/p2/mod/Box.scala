package typingsSlinky.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Box")
@js.native
class Box () extends Convex {
  def this(options: BoxOptions) = this()
  
  var height: Double = js.native
  
  var width: Double = js.native
}
