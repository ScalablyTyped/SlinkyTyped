package typingsSlinky.parchment.attributorMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/attributor/attributor", JSImport.Default)
@js.native
class default protected () extends Attributor {
  def this(attrName: String, keyName: String) = this()
  def this(attrName: String, keyName: String, options: AttributorOptions) = this()
}

/* static members */
@JSImport("parchment/dist/src/attributor/attributor", JSImport.Default)
@js.native
object default extends js.Object {
  def keys(node: HTMLElement): js.Array[String] = js.native
}

