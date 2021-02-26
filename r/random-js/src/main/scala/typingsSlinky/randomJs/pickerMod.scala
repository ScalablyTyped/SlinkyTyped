package typingsSlinky.randomJs

import typingsSlinky.randomJs.typesMod.Distribution
import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerMod {
  
  @JSImport("random-js/dist/distribution/picker", "picker")
  @js.native
  def picker[T](source: ArrayLike[T]): Distribution[T] = js.native
  @JSImport("random-js/dist/distribution/picker", "picker")
  @js.native
  def picker[T](source: ArrayLike[T], begin: js.UndefOr[scala.Nothing], end: Double): Distribution[T] = js.native
  @JSImport("random-js/dist/distribution/picker", "picker")
  @js.native
  def picker[T](source: ArrayLike[T], begin: Double): Distribution[T] = js.native
  @JSImport("random-js/dist/distribution/picker", "picker")
  @js.native
  def picker[T](source: ArrayLike[T], begin: Double, end: Double): Distribution[T] = js.native
}
