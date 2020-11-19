package typingsSlinky.popperJs.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.popperJs.anon.BaseModifiernamestring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popper.js", JSImport.Default)
@js.native
class default protected () extends Popper {
  def this(reference: ReferenceObject, popper: Element) = this()
  def this(reference: Element, popper: Element) = this()
  def this(reference: ReferenceObject, popper: Element, options: PopperOptions) = this()
  def this(reference: Element, popper: Element, options: PopperOptions) = this()
}
/* static members */
@JSImport("popper.js", JSImport.Default)
@js.native
object default extends js.Object {
  
  var Defaults: PopperOptions = js.native
  
  var modifiers: js.Array[BaseModifiernamestring] = js.native
  
  var placements: js.Array[Placement] = js.native
}
