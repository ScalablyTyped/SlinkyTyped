package typingsSlinky.fullcalendar

import typingsSlinky.fullcalendar.listEventRendererMod.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/ListEventRenderer", JSImport.Namespace)
@js.native
object listEventRendererMod extends js.Object {
  @js.native
  class Default ()
    extends typingsSlinky.fullcalendar.eventRendererMod.default {
    def fgSegHtml(seg: js.Any): String = js.native
  }
  
  @js.native
  class default () extends Default
  
}

