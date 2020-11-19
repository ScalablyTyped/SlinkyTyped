package typingsSlinky.antdMobile.gridMod

import slinky.core.facade.ReactElement
import typingsSlinky.antdMobile.anon.InitialSlideWidth
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grid
  extends Component[GridProps, js.Any, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MGrid(): Unit = js.native
  
  def getRows(rowCount: Double, dataLength: Double): js.Array[_] = js.native
  
  def renderCarousel(rowsArr: js.Array[_], pageCount: Double, rowCount: Double): js.Array[_] = js.native
  
  def renderItem(dataItem: js.Any, index: Double, columnNum: Double, renderItem: js.Any): ReactElement = js.native
  
  @JSName("state")
  var state_Grid: InitialSlideWidth = js.native
}
