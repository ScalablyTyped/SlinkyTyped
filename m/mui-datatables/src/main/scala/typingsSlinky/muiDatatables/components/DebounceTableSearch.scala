package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.DebouncedMUIDataTableSearch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DebounceTableSearch {
  @JSImport("mui-datatables", "DebounceTableSearch")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def onHide(value: /* args */ js.Any => _): this.type = set("onHide", js.Any.fromFunction1(value))
    @scala.inline
    def onSearch(value: /* args */ js.Any => _): this.type = set("onSearch", js.Any.fromFunction1(value))
    @scala.inline
    def options(value: js.Object): this.type = set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def searchText(value: String): this.type = set("searchText", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DebouncedMUIDataTableSearch): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(debounceWait: Double): Builder = {
    val __props = js.Dynamic.literal(debounceWait = debounceWait.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DebouncedMUIDataTableSearch]))
  }
}

