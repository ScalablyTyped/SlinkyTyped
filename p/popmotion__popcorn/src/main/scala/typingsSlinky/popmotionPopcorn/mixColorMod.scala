package typingsSlinky.popmotionPopcorn

import typingsSlinky.styleValueTypes.typesMod.HSLA
import typingsSlinky.styleValueTypes.typesMod.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@popmotion/popcorn/lib/utils/mix-color", JSImport.Namespace)
@js.native
object mixColorMod extends js.Object {
  
  def default(from: String, to: String): js.Function1[/* v */ Double, _] = js.native
  def default(from: String, to: HSLA): js.Function1[/* v */ Double, _] = js.native
  def default(from: String, to: RGBA): js.Function1[/* v */ Double, _] = js.native
  def default(from: HSLA, to: String): js.Function1[/* v */ Double, _] = js.native
  def default(from: HSLA, to: HSLA): js.Function1[/* v */ Double, _] = js.native
  def default(from: HSLA, to: RGBA): js.Function1[/* v */ Double, _] = js.native
  def default(from: RGBA, to: String): js.Function1[/* v */ Double, _] = js.native
  def default(from: RGBA, to: HSLA): js.Function1[/* v */ Double, _] = js.native
  def default(from: RGBA, to: RGBA): js.Function1[/* v */ Double, _] = js.native
  
  def mixLinearColor(from: Double, to: Double, v: Double): Double = js.native
}
