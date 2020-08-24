package typingsSlinky.materialTopAppBar

import typingsSlinky.materialTopAppBar.anon.PartialMDCTopAppBarAdapte
import typingsSlinky.materialTopAppBar.materialTopAppBarMod.MDCTopAppBarBaseFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/top-app-bar/standard/foundation", JSImport.Namespace)
@js.native
object standardFoundationMod extends js.Object {
  @js.native
  class MDCTopAppBarFoundation () extends MDCTopAppBarBaseFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
  
  @js.native
  class default () extends MDCTopAppBarFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
  
}

