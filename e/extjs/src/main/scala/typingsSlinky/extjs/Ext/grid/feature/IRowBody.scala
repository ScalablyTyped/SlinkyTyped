package typingsSlinky.extjs.Ext.grid.feature

import typingsSlinky.extjs.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowBody extends IFeature {
  /** [Method] Provides additional data to the prepareData call within the grid view
  		* @param data Object The data for this particular record.
  		* @param idx Number The row index for this record.
  		* @param record Ext.data.Model The record instance
  		* @param orig Object The original result from the prepareData call to massage.
  		*/
  var getAdditionalData: js.UndefOr[
    js.Function4[
      /* data */ js.UndefOr[js.Any], 
      /* idx */ js.UndefOr[Double], 
      /* record */ js.UndefOr[IModel], 
      /* orig */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IRowBody {
  @scala.inline
  def apply(): IRowBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRowBody]
  }
  @scala.inline
  implicit class IRowBodyOps[Self <: IRowBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAdditionalData(
      value: (/* data */ js.UndefOr[js.Any], /* idx */ js.UndefOr[Double], /* record */ js.UndefOr[IModel], /* orig */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAdditionalData")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutGetAdditionalData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAdditionalData")(js.undefined)
        ret
    }
  }
  
}

