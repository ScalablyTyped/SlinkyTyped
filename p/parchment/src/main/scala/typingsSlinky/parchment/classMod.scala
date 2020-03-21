package typingsSlinky.parchment

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/attributor/class", JSImport.Namespace)
@js.native
object classMod extends js.Object {
  @js.native
  trait ClassAttributor
    extends typingsSlinky.parchment.attributorMod.default
  
  @js.native
  class default () extends ClassAttributor
  
  /* static members */
  @js.native
  object default extends js.Object {
    def keys(node: HTMLElement): js.Array[String] = js.native
  }
  
}

