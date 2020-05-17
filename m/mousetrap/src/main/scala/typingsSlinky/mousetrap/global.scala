package typingsSlinky.mousetrap

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Mousetrap () extends MousetrapInstance {
    def this(el: Element) = this()
  }
  
  @js.native
  object Mousetrap extends TopLevel[MousetrapStatic]
  
}

