package typingsSlinky.numeric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Random extends js.Object {
  
  def random(): Double = js.native
  
  def seedrandom(seed: String): String = js.native
  def seedrandom(seed: String, useEntropy: Boolean): String = js.native
  def seedrandom(seed: Double): String = js.native
  def seedrandom(seed: Double, useEntropy: Boolean): String = js.native
}
