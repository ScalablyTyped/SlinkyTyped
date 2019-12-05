package typingsSlinky.agDashGrid.distLibMainMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agDashGrid.distLibEntitiesColumnGroupChildMod.ColumnGroupChild
import typingsSlinky.agDashGrid.distLibRenderingBeansMod.Beans
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "SetLeftFeature")
@js.native
class SetLeftFeature protected ()
  extends typingsSlinky.agDashGrid.distLibRenderingFeaturesSetLeftFeatureMod.SetLeftFeature {
  def this(columnOrGroup: ColumnGroupChild, eCell: HTMLElement, beans: Beans) = this()
  def this(
    columnOrGroup: ColumnGroupChild,
    eCell: HTMLElement,
    beans: Beans,
    colsSpanning: js.Array[typingsSlinky.agDashGrid.distLibEntitiesColumnMod.Column]
  ) = this()
}

