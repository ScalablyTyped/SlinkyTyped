package typingsSlinky.phosphorDatagrid.datamodelMod.DataModel

import typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.`columns-inserted`
import typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.`columns-removed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `changed` signal.
  *
  * #### Notes
  * Data models should emit the `changed` signal with this args object
  * type when columns are inserted or removed.
  */
@js.native
trait IColumnsChangedArgs extends ChangedArgs {
  /**
    * The index of the first modified column.
    */
  val index: Double = js.native
  /**
    * The region which contains the modified columns.
    */
  val region: ColumnRegion = js.native
  /**
    * The number of modified columns.
    */
  val span: Double = js.native
  /**
    * The discriminated type of the args object.
    */
  val `type`: `columns-inserted` | `columns-removed` = js.native
}

object IColumnsChangedArgs {
  @scala.inline
  def apply(index: Double, region: ColumnRegion, span: Double, `type`: `columns-inserted` | `columns-removed`): IColumnsChangedArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnsChangedArgs]
  }
  @scala.inline
  implicit class IColumnsChangedArgsOps[Self <: IColumnsChangedArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: ColumnRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `columns-inserted` | `columns-removed`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

