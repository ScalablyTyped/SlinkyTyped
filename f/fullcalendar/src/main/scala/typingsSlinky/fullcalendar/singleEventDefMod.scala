package typingsSlinky.fullcalendar

import typingsSlinky.fullcalendar.singleEventDefMod.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/SingleEventDef", JSImport.Namespace)
@js.native
object singleEventDefMod extends js.Object {
  @js.native
  class Default ()
    extends typingsSlinky.fullcalendar.eventDefMod.default {
    var dateProfile: js.Any = js.native
    def buildInstance(): typingsSlinky.fullcalendar.eventInstanceMod.default = js.native
    def buildInstances(): js.Array[typingsSlinky.fullcalendar.eventInstanceMod.default] = js.native
    def rezone(): Unit = js.native
  }
  
  @js.native
  class default () extends Default
  
}

