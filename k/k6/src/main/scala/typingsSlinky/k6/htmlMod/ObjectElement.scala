package typingsSlinky.k6.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/html", "ObjectElement")
@js.native
abstract class ObjectElement () extends Element {
  
  /** Owning <form> element. */
  def form(): js.UndefOr[FormElement] = js.native
}
