package typingsSlinky.aceBuilds.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ace-builds", "VirtualRenderer")
@js.native
class VirtualRenderer protected ()
  extends typingsSlinky.aceBuilds.mod.Ace.VirtualRenderer {
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, theme: String) = this()
}

@JSImport("ace-builds", "VirtualRenderer")
@js.native
object VirtualRenderer
  extends Instantiable1[/* container */ HTMLElement, typingsSlinky.aceBuilds.mod.Ace.VirtualRenderer]
     with Instantiable2[
      /* container */ HTMLElement, 
      /* theme */ String, 
      typingsSlinky.aceBuilds.mod.Ace.VirtualRenderer
    ]

