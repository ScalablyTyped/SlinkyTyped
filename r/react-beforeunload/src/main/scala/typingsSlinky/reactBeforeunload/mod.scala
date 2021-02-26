package typingsSlinky.reactBeforeunload

import org.scalajs.dom.raw.Event
import slinky.core.ReactComponentClass
import typingsSlinky.reactBeforeunload.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-beforeunload", "Beforeunload")
  @js.native
  val Beforeunload: ReactComponentClass[Children] = js.native
  
  @JSImport("react-beforeunload", "useBeforeunload")
  @js.native
  def useBeforeunload(): Unit = js.native
  @JSImport("react-beforeunload", "useBeforeunload")
  @js.native
  def useBeforeunload(handler: UseBeforeunloadHandler): Unit = js.native
  
  type UseBeforeunloadHandler = js.Function1[/* arg */ Event, js.UndefOr[String | Unit]]
}
