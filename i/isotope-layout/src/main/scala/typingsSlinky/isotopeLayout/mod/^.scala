package typingsSlinky.isotopeLayout.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("isotope-layout", JSImport.Namespace)
@js.native
object ^ extends TopLevel[
      (Instantiable2[/* elementOrSelector */ String, /* options */ IsotopeOptions, Isotope]) with (Instantiable2[/* elementOrSelector */ HTMLElement, /* options */ IsotopeOptions, Isotope])
    ] {
  
  def data(element: String): Isotope = js.native
  /**
    * Get the Isotope instance via its element. Isotope.data() is useful for getting the Isotope instance in JavaScript, after it has been initalized in HTML.
    */
  def data(element: HTMLElement): Isotope = js.native
}
