package typingsSlinky.reduxPersistTransformFilter

import typingsSlinky.reduxPersist.typesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-persist-transform-filter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default[State, Raw](reducerName: String): Transform[State, Raw, _, _] = js.native
  def default[State, Raw](reducerName: String, inboundPaths: js.UndefOr[scala.Nothing], outboundPaths: js.Array[String]): Transform[State, Raw, _, _] = js.native
  def default[State, Raw](reducerName: String, inboundPaths: js.Array[String]): Transform[State, Raw, _, _] = js.native
  def default[State, Raw](reducerName: String, inboundPaths: js.Array[String], outboundPaths: js.Array[String]): Transform[State, Raw, _, _] = js.native
}
