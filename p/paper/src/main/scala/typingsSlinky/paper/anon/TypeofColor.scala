package typingsSlinky.paper.anon

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.paper.paper.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofColor
  extends Instantiable3[/* red */ Double, /* green */ Double, /* blue */ Double, Color]
     with Instantiable4[/* red */ Double, /* green */ Double, /* blue */ Double, /* alpha */ Double, Color] {
  
  /** 
    * Returns a color object with random {@link #red}, {@link #green}
    * and {@link #blue} values between `0` and `1`.
    * 
    * @return the newly created color object
    */
  def random(): Color = js.native
}
