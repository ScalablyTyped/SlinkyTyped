package typingsSlinky.jupyterlabFilebrowser.listingMod.DirListing

import typingsSlinky.jupyterlabFilebrowser.jupyterlabFilebrowserStrings.ascending
import typingsSlinky.jupyterlabFilebrowser.jupyterlabFilebrowserStrings.descending
import typingsSlinky.jupyterlabFilebrowser.jupyterlabFilebrowserStrings.last_modified
import typingsSlinky.jupyterlabFilebrowser.jupyterlabFilebrowserStrings.name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A sort state.
  */
@js.native
trait ISortState extends js.Object {
  /**
    * The direction of sort.
    */
  var direction: ascending | descending = js.native
  /**
    * The sort key.
    */
  var key: name | last_modified = js.native
}

object ISortState {
  @scala.inline
  def apply(direction: ascending | descending, key: name | last_modified): ISortState = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISortState]
  }
  @scala.inline
  implicit class ISortStateOps[Self <: ISortState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: ascending | descending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: name | last_modified): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

