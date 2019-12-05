package typingsSlinky.reactDashBeforeunload

import org.scalajs.dom.raw.Event
import slinky.core.ReactComponentClass
import typingsSlinky.reactDashBeforeunload.reactDashBeforeunloadMod.UseBeforeunloadHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-beforeunload", JSImport.Namespace)
@js.native
object reactDashBeforeunloadMod extends js.Object {
  val Beforeunload: ReactComponentClass[Anon_Children] = js.native
  def useBeforeunload(): Unit = js.native
  def useBeforeunload(handler: UseBeforeunloadHandler): Unit = js.native
  type UseBeforeunloadHandler = js.Function1[/* arg */ Event, js.UndefOr[String | Unit]]
}

