package typingsSlinky.reactUltimatePagination.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUltimatePaginationOptions extends js.Object {
  /**
    * A React.js component that will be used as a wrapper for pagination items
    */
  var WrapperComponent: js.UndefOr[String | ReactComponentClass[_]] = js.native
  /**
    * An object that is used as a map from the item type to the React.js component that will be used to render this item
    */
  var itemTypeToComponent: ItemTypeToComponent = js.native
}

object CreateUltimatePaginationOptions {
  @scala.inline
  def apply(itemTypeToComponent: ItemTypeToComponent): CreateUltimatePaginationOptions = {
    val __obj = js.Dynamic.literal(itemTypeToComponent = itemTypeToComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUltimatePaginationOptions]
  }
  @scala.inline
  implicit class CreateUltimatePaginationOptionsOps[Self <: CreateUltimatePaginationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemTypeToComponent(value: ItemTypeToComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTypeToComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapperComponentFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WrapperComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapperComponentComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WrapperComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapperComponent(value: String | ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WrapperComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WrapperComponent")(js.undefined)
        ret
    }
  }
  
}

