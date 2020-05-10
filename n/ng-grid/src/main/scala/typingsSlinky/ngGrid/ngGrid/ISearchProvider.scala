package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchProvider extends js.Object {
  var extFilter: Boolean = js.native
  var fieldMap: js.Any = js.native
  def evalFilter(): Unit = js.native
}

object ISearchProvider {
  @scala.inline
  def apply(evalFilter: () => Unit, extFilter: Boolean, fieldMap: js.Any): ISearchProvider = {
    val __obj = js.Dynamic.literal(evalFilter = js.Any.fromFunction0(evalFilter), extFilter = extFilter.asInstanceOf[js.Any], fieldMap = fieldMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchProvider]
  }
  @scala.inline
  implicit class ISearchProviderOps[Self <: ISearchProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvalFilter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExtFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

