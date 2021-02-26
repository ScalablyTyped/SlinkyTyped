package typingsSlinky.k6.htmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/html", "FormElement")
@js.native
abstract class FormElement () extends Element {
  
  /** Contained form control elements. */
  def elements(): js.Array[Element] = js.native
  
  /** Number of contained form control elements. */
  def length(): Double = js.native
  
  /** Form submission HTTP method. */
  def method(): String = js.native
}
