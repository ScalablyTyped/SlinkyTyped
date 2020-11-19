package typingsSlinky.rellax.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rellax
  extends /**
  * Inits and starts the Parallax animations
  * @param el Single element or string with selector of elements
  * @param options Options
  */
Instantiable0[RellaxInstance]
     with Instantiable1[(/* el */ Element) | (/* el */ String), RellaxInstance]
     with Instantiable2[
      js.UndefOr[(/* el */ Element) | (/* el */ String)], 
      /* options */ RellaxOptions, 
      RellaxInstance
    ] {
  
  /**
    * Inits and starts the Parallax animations
    * @param el Single element or string with selector of elements
    * @param options Options
    */
  def apply(): RellaxInstance = js.native
  def apply(el: js.UndefOr[scala.Nothing], options: RellaxOptions): RellaxInstance = js.native
  def apply(el: String): RellaxInstance = js.native
  def apply(el: String, options: RellaxOptions): RellaxInstance = js.native
  def apply(el: Element): RellaxInstance = js.native
  def apply(el: Element, options: RellaxOptions): RellaxInstance = js.native
}
