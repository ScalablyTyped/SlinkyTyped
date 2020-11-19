package typingsSlinky.ecmarkup.figureMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ecmarkup.contextMod.Context
import typingsSlinky.ecmarkup.specMod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup/lib/Figure", JSImport.Default)
@js.native
class default protected () extends Figure {
  def this(spec: Spec, node: HTMLElement) = this()
}
/* static members */
@JSImport("ecmarkup/lib/Figure", JSImport.Default)
@js.native
object default extends js.Object {
  
  var elements: js.Array[String] = js.native
  
  def enter(hasSpecNode: Context): Unit = js.native
}
