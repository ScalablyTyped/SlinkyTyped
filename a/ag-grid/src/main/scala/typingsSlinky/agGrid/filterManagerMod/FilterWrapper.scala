package typingsSlinky.agGrid.filterManagerMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.iFilterMod.IFilterComp
import typingsSlinky.agGrid.utilsMod.ExternalPromise
import typingsSlinky.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterWrapper extends js.Object {
  var column: Column = js.native
  var compiledElement: js.Any = js.native
  var filterPromise: Promise[IFilterComp] = js.native
  var guiPromise: ExternalPromise[HTMLElement] = js.native
  var scope: js.Any = js.native
}

object FilterWrapper {
  @scala.inline
  def apply(
    column: Column,
    compiledElement: js.Any,
    filterPromise: Promise[IFilterComp],
    guiPromise: ExternalPromise[HTMLElement],
    scope: js.Any
  ): FilterWrapper = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compiledElement = compiledElement.asInstanceOf[js.Any], filterPromise = filterPromise.asInstanceOf[js.Any], guiPromise = guiPromise.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterWrapper]
  }
  @scala.inline
  implicit class FilterWrapperOps[Self <: FilterWrapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompiledElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiledElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterPromise(value: Promise[IFilterComp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPromise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuiPromise(value: ExternalPromise[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guiPromise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

