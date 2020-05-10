package typingsSlinky.knockoutKogrid

import typingsSlinky.knockoutKogrid.kg.DomUtilityService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKg extends js.Object {
  var domUtilityService: DomUtilityService = js.native
  /** Default aggregate template */
  def aggregateTemplate(): String = js.native
  /** Default cell template. Can be overriden in GridOptions.cellTemplate */
  def defaultCellTemplate(): String = js.native
  /** Default grid template */
  def defaultGridTemplate(): String = js.native
  /** Default headercell template. Can be overriden in GridOptions.headerCellTemplate */
  def defaultHeaderCellTemplate(): String = js.native
  /** Default headerrow template. Can be overriden in GridOptions.headerRowTemplate */
  def defaultHeaderRowTemplate(): String = js.native
  /** Default row template. Can be overriden in GridOptions.rowTemplate */
  def defaultRowTemplate(): String = js.native
}

object IKg {
  @scala.inline
  def apply(
    aggregateTemplate: () => String,
    defaultCellTemplate: () => String,
    defaultGridTemplate: () => String,
    defaultHeaderCellTemplate: () => String,
    defaultHeaderRowTemplate: () => String,
    defaultRowTemplate: () => String,
    domUtilityService: DomUtilityService
  ): IKg = {
    val __obj = js.Dynamic.literal(aggregateTemplate = js.Any.fromFunction0(aggregateTemplate), defaultCellTemplate = js.Any.fromFunction0(defaultCellTemplate), defaultGridTemplate = js.Any.fromFunction0(defaultGridTemplate), defaultHeaderCellTemplate = js.Any.fromFunction0(defaultHeaderCellTemplate), defaultHeaderRowTemplate = js.Any.fromFunction0(defaultHeaderRowTemplate), defaultRowTemplate = js.Any.fromFunction0(defaultRowTemplate), domUtilityService = domUtilityService.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKg]
  }
  @scala.inline
  implicit class IKgOps[Self <: IKg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregateTemplate(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateTemplate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefaultCellTemplate(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCellTemplate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefaultGridTemplate(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultGridTemplate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefaultHeaderCellTemplate(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeaderCellTemplate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefaultHeaderRowTemplate(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeaderRowTemplate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefaultRowTemplate(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRowTemplate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDomUtilityService(value: DomUtilityService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domUtilityService")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

