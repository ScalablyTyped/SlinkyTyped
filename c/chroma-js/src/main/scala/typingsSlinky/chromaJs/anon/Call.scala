package typingsSlinky.chromaJs.anon

import typingsSlinky.chromaJs.mod.Color
import typingsSlinky.chromaJs.mod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def apply(t: Double): Color = js.native
  
  def scale(): Scale[Color] = js.native
}
