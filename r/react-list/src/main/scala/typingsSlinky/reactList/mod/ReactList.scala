package typingsSlinky.reactList.mod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactList
  extends Component[ReactListProps, js.Object, js.Any] {
  
  def getVisibleRange(): js.Array[Double] = js.native
  
  def scrollAround(index: Double): Unit = js.native
  
  def scrollTo(index: Double): Unit = js.native
}
