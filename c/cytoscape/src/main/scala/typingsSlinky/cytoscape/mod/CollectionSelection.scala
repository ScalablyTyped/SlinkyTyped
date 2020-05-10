package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/layout
  */
@js.native
trait CollectionSelection extends js.Object {
  def deselect(): this.type = js.native
  /**
    * Make the elements selected (NB other elements outside the collection are not affected).
    * http://js.cytoscape.org/#eles.select
    */
  def select(): this.type = js.native
  /**
    * Make the selection states of the elements mutable.
    * http://js.cytoscape.org/#eles.selectify
    */
  def selectify(): this.type = js.native
  /**
    * Make the elements not selected (NB other elements outside the collection are not affected).
    * http://js.cytoscape.org/#eles.unselect
    */
  def unselect(): this.type = js.native
  /**
    * Make the selection states of the elements immutable.
    * http://js.cytoscape.org/#eles.unselectify
    */
  def unselectify(): this.type = js.native
}

object CollectionSelection {
  @scala.inline
  def apply(
    deselect: () => CollectionSelection,
    select: () => CollectionSelection,
    selectify: () => CollectionSelection,
    unselect: () => CollectionSelection,
    unselectify: () => CollectionSelection
  ): CollectionSelection = {
    val __obj = js.Dynamic.literal(deselect = js.Any.fromFunction0(deselect), select = js.Any.fromFunction0(select), selectify = js.Any.fromFunction0(selectify), unselect = js.Any.fromFunction0(unselect), unselectify = js.Any.fromFunction0(unselectify))
    __obj.asInstanceOf[CollectionSelection]
  }
  @scala.inline
  implicit class CollectionSelectionOps[Self <: CollectionSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeselect(value: () => CollectionSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelect(value: () => CollectionSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectify(value: () => CollectionSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectify")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnselect(value: () => CollectionSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnselectify(value: () => CollectionSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectify")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

