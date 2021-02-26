package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Orientation extends StObject
@JSImport("azdata", "Orientation")
@js.native
object Orientation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Orientation with String] = js.native
  
  @js.native
  sealed trait Horizontal extends Orientation
  /* "horizontal" */ val Horizontal: typingsSlinky.azdata.mod.Orientation.Horizontal with String = js.native
  
  @js.native
  sealed trait Vertical extends Orientation
  /* "vertial" */ val Vertical: typingsSlinky.azdata.mod.Orientation.Vertical with String = js.native
}
