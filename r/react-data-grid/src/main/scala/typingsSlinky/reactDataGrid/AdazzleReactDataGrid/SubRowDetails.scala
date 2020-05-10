package typingsSlinky.reactDataGrid.AdazzleReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about subrows.
  */
@js.native
trait SubRowDetails[T] extends js.Object {
  /**
    * Determines if the cell can expand.
    */
  var canExpand: js.UndefOr[Boolean] = js.native
  /**
    * Children data.
    */
  var children: js.UndefOr[js.Array[T]] = js.native
  /**
    * Determines if the row has already expanded.
    */
  var expanded: Boolean = js.native
  /**
    * Sets the field/column that will be use to expand the subrows.
    */
  var field: String = js.native
  var group: js.UndefOr[Boolean] = js.native
  var numberSiblings: js.UndefOr[Double] = js.native
  var siblingIndex: js.UndefOr[Double] = js.native
  var treeDepth: js.UndefOr[Double] = js.native
}

object SubRowDetails {
  @scala.inline
  def apply[T](expanded: Boolean, field: String): SubRowDetails[T] = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubRowDetails[T]]
  }
  @scala.inline
  implicit class SubRowDetailsOps[Self[t] <: SubRowDetails[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withExpanded(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanExpand(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanExpand: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberSiblings(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberSiblings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberSiblings: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberSiblings")(js.undefined)
        ret
    }
    @scala.inline
    def withSiblingIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblingIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiblingIndex: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblingIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeDepth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeDepth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeDepth")(js.undefined)
        ret
    }
  }
  
}

