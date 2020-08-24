package typingsSlinky.openfin

import org.scalajs.dom.raw.Window
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.utilEntityTypeMod.EntityTypeHelpers
import typingsSlinky.openfin.v2MainMod.Frame
import typingsSlinky.openfin.viewViewMod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/fin", JSImport.Namespace)
@js.native
object finMod extends js.Object {
  @js.native
  trait Fin extends EventEmitter {
    var Application: typingsSlinky.openfin.applicationMod.default = js.native
    var Clipboard: typingsSlinky.openfin.clipboardMod.default = js.native
    var ExternalApplication: typingsSlinky.openfin.externalApplicationExternalApplicationMod.default = js.native
    var ExternalWindow: typingsSlinky.openfin.externalWindowExternalWindowMod.default = js.native
    var Frame: typingsSlinky.openfin.frameFrameMod.default = js.native
    var GlobalHotkey: typingsSlinky.openfin.apiGlobalHotkeyMod.default = js.native
    var InterApplicationBus: typingsSlinky.openfin.interappbusMod.default = js.native
    var Notification: typingsSlinky.openfin.notificationMod.default = js.native
    var Platform: typingsSlinky.openfin.platformPlatformMod.default = js.native
    var System: typingsSlinky.openfin.systemSystemMod.default = js.native
    var View: typingsSlinky.openfin.viewViewMod.default = js.native
    var Window: typingsSlinky.openfin.windowWindowMod.default = js.native
    val me: (View | Window | Frame | js.Object) with Identity with EntityTypeHelpers = js.native
    var wire: js.Any = js.native
  }
  
  @js.native
  class default protected () extends Fin {
    def this(wire: typingsSlinky.openfin.transportMod.default) = this()
  }
  
}

