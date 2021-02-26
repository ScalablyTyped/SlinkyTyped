package typingsSlinky.devexpressUtils

import typingsSlinky.devexpressUtils.offsetsMod.Offsets
import typingsSlinky.devexpressUtils.typesMod.ICloneable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paddingsMod {
  
  @JSImport("@devexpress/utils/lib/geometry/paddings", "Paddings")
  @js.native
  class Paddings protected ()
    extends Offsets
       with ICloneable[Paddings] {
    def this(left: Double, right: Double, top: Double, bottom: Double) = this()
  }
  /* static members */
  object Paddings {
    
    @JSImport("@devexpress/utils/lib/geometry/paddings", "Paddings.empty")
    @js.native
    def empty(): Paddings = js.native
  }
}
