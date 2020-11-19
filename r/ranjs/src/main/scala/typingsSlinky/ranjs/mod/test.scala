package typingsSlinky.ranjs.mod

import typingsSlinky.ranjs.anon.Chi2
import typingsSlinky.ranjs.anon.Passed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ranjs", "test")
@js.native
object test extends js.Object {
  
  def bartlett(dataSets: js.Array[js.Array[Double]], alpha: Double): Chi2 = js.native
  
  def mannWhitney(dataSets: js.Array[js.Array[Double]], alpha: Double): Passed = js.native
}
