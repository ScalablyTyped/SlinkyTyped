package typingsSlinky.dropkickjs

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Dropkick protected ()
    extends typingsSlinky.dropkickjs.Dropkick {
    def this(id: String) = this()
    def this(id: HTMLElement) = this()
    def this(id: String, options: DropkickOptions) = this()
    def this(id: HTMLElement, options: DropkickOptions) = this()
  }
  
}

