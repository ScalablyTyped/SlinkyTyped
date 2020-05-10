package typingsSlinky.inquirer.paginatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the functionality to draw paginated content using a `ScreenManager`.
  */
@js.native
trait Paginator extends js.Object {
  /**
    * Gets or sets the index of the last focused line.
    */
  var lastIndex: Double = js.native
  /**
    * Gets or sets the index of the currently focused line.
    */
  var pointer: Double = js.native
  /**
    * Gets or sets an object for drawing the paginated content.
    */
  var screen: typingsSlinky.inquirer.screenManagerMod.^ = js.native
  /**
    * Paginates the specified `content`.
    *
    * @param content
    * The content to paginate.
    *
    * @param selectedIndex
    * The number of the selected line.
    *
    * @returns
    * The paginated content.
    */
  def paginate(content: String, selectedIndex: Double): String = js.native
}

object Paginator {
  @scala.inline
  def apply(
    lastIndex: Double,
    paginate: (String, Double) => String,
    pointer: Double,
    screen: typingsSlinky.inquirer.screenManagerMod.^
  ): Paginator = {
    val __obj = js.Dynamic.literal(lastIndex = lastIndex.asInstanceOf[js.Any], paginate = js.Any.fromFunction2(paginate), pointer = pointer.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paginator]
  }
  @scala.inline
  implicit class PaginatorOps[Self <: Paginator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaginate(value: (String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPointer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreen(value: typingsSlinky.inquirer.screenManagerMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

