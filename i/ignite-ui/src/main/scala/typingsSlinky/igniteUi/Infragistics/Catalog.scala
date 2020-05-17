package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Catalog extends js.Object {
  /**
  	 * Returns the caption of the catalog used when displaying the name of the catalog to the user.
  	 *
  	 * @param value
  	 */
  def caption(value: js.Object): String = js.native
  /**
  	 * Returns the description of the catalog which is a human-readable description of the catalog
  	 *
  	 * @param value
  	 */
  def description(value: js.Object): String = js.native
  /**
  	 * Returns the name of the catalog.
  	 *
  	 * @param value
  	 */
  def name(value: js.Object): String = js.native
  /**
  	 * Returns the unique name of the catalog.
  	 *
  	 * @param value
  	 */
  def uniqueName(value: js.Object): String = js.native
}

object Catalog {
  @scala.inline
  def apply(
    caption: js.Object => String,
    description: js.Object => String,
    name: js.Object => String,
    uniqueName: js.Object => String
  ): Catalog = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction1(caption), description = js.Any.fromFunction1(description), name = js.Any.fromFunction1(name), uniqueName = js.Any.fromFunction1(uniqueName))
    __obj.asInstanceOf[Catalog]
  }
  @scala.inline
  implicit class CatalogOps[Self <: Catalog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaption(value: js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDescription(value: js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUniqueName(value: js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

