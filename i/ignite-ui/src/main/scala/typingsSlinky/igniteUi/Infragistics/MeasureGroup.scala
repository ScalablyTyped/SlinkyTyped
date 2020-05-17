package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeasureGroup extends js.Object {
  /**
  	 * Returns the caption of the measure group used when displaying the name of the measure group to the user.
  	 *
  	 * @param value
  	 */
  def caption(value: js.Object): String = js.native
  /**
  	 * Returns the name of the catalog to which this measure group belongs.
  	 *
  	 * @param value
  	 */
  def catalogName(value: js.Object): String = js.native
  /**
  	 * Returns the name of the cube to which this measure group belongs
  	 *
  	 * @param value
  	 */
  def cubeName(value: js.Object): String = js.native
  /**
  	 * Returns a user-friendly description of the measure group.
  	 *
  	 * @param value
  	 */
  def description(value: js.Object): String = js.native
  /**
  	 * Returns the name of the measure group.
  	 *
  	 * @param value
  	 */
  def name(value: js.Object): String = js.native
}

object MeasureGroup {
  @scala.inline
  def apply(
    caption: js.Object => String,
    catalogName: js.Object => String,
    cubeName: js.Object => String,
    description: js.Object => String,
    name: js.Object => String
  ): MeasureGroup = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction1(caption), catalogName = js.Any.fromFunction1(catalogName), cubeName = js.Any.fromFunction1(cubeName), description = js.Any.fromFunction1(description), name = js.Any.fromFunction1(name))
    __obj.asInstanceOf[MeasureGroup]
  }
  @scala.inline
  implicit class MeasureGroupOps[Self <: MeasureGroup] (val x: Self) extends AnyVal {
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
    def withCatalogName(value: js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCubeName(value: js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubeName")(js.Any.fromFunction1(value))
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
  }
  
}

