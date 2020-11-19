package typingsSlinky.reactBeforeunload

import org.scalajs.dom.raw.Event
import slinky.core.ReactComponentClass
import typingsSlinky.reactBeforeunload.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-beforeunload", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Beforeunload: ReactComponentClass[Children] = js.native
  
  def useBeforeunload(): Unit = js.native
  def useBeforeunload(handler: UseBeforeunloadHandler): Unit = js.native
  
  type UseBeforeunloadHandler = js.Function1[/* arg */ Event, js.UndefOr[String | Unit]]
}
