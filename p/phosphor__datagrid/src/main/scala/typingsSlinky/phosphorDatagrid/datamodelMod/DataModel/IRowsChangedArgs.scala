package typingsSlinky.phosphorDatagrid.datamodelMod.DataModel

import typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.`rows-inserted`
import typingsSlinky.phosphorDatagrid.phosphorDatagridStrings.`rows-removed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `changed` signal.
  *
  * #### Notes
  * Data models should emit the `changed` signal with this args object
  * type when rows are inserted or removed.
  */
@js.native
trait IRowsChangedArgs extends ChangedArgs {
  /**
    * The index of the first modified row.
    */
  val index: Double = js.native
  /**
    * The region which contains the modified rows.
    */
  val region: RowRegion = js.native
  /**
    * The number of modified rows.
    */
  val span: Double = js.native
  /**
    * The discriminated type of the args object.
    */
  val `type`: `rows-inserted` | `rows-removed` = js.native
}

object IRowsChangedArgs {
  @scala.inline
  def apply(index: Double, region: RowRegion, span: Double, `type`: `rows-inserted` | `rows-removed`): IRowsChangedArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowsChangedArgs]
  }
  @scala.inline
  implicit class IRowsChangedArgsOps[Self <: IRowsChangedArgs] (val x: Self) extends AnyVal {
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
    def withRegion(value: RowRegion): Self = {
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
    def withType(value: `rows-inserted` | `rows-removed`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

