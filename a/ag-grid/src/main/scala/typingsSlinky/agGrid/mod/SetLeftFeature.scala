package typingsSlinky.agGrid.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.beansMod.Beans
import typingsSlinky.agGrid.columnGroupChildMod.ColumnGroupChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "SetLeftFeature")
@js.native
class SetLeftFeature protected ()
  extends typingsSlinky.agGrid.setLeftFeatureMod.SetLeftFeature {
  def this(columnOrGroup: ColumnGroupChild, eCell: HTMLElement, beans: Beans) = this()
  def this(
    columnOrGroup: ColumnGroupChild,
    eCell: HTMLElement,
    beans: Beans,
    colsSpanning: js.Array[typingsSlinky.agGrid.columnMod.Column]
  ) = this()
}
