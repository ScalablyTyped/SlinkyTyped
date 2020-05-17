package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cube extends js.Object {
  /**
  	 * Returns the caption of the cube used when displaying the name of the cube to the user.
  	 *
  	 * @param value
  	 */
  def caption(value: js.Object): String = js.native
  /**
  	 * Returns the type of the cube which is a value from the $.ig.CubeType enumeration.
  	 *
  	 *             $.ig.CubeType.prototype.cube = 0;
  	 *             $.ig.CubeType.prototype.dimension = 1;
  	 *             $.ig.CubeType.prototype.unknown = 2;
  	 *
  	 * @param value
  	 */
  def cubeType(value: js.Object): Double = js.native
  /**
  	 * Returns a user-friendly description of the cube.
  	 *
  	 * @param value
  	 */
  def description(value: js.Object): String = js.native
  /**
  	 * Returns the date and time on which the cube was last processed.
  	 *
  	 * @param value
  	 */
  def lastProcessed(value: js.Object): js.Object = js.native
  /**
  	 * Returns the date and time on which the cube was last updated.
  	 *
  	 * @param value
  	 */
  def lastUpdated(value: js.Object): js.Object = js.native
  /**
  	 * Returns the name of the cube.
  	 *
  	 * @param value
  	 */
  def name(value: js.Object): String = js.native
  /**
  	 * Returns the unique name of the cube.
  	 *
  	 * @param value
  	 */
  def uniqueName(value: js.Object): String = js.native
}

object Cube {
  @scala.inline
  def apply(
    caption: js.Object => String,
    cubeType: js.Object => Double,
    description: js.Object => String,
    lastProcessed: js.Object => js.Object,
    lastUpdated: js.Object => js.Object,
    name: js.Object => String,
    uniqueName: js.Object => String
  ): Cube = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction1(caption), cubeType = js.Any.fromFunction1(cubeType), description = js.Any.fromFunction1(description), lastProcessed = js.Any.fromFunction1(lastProcessed), lastUpdated = js.Any.fromFunction1(lastUpdated), name = js.Any.fromFunction1(name), uniqueName = js.Any.fromFunction1(uniqueName))
    __obj.asInstanceOf[Cube]
  }
  @scala.inline
  implicit class CubeOps[Self <: Cube] (val x: Self) extends AnyVal {
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
    def withCubeType(value: js.Object => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubeType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDescription(value: js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLastProcessed(value: js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastProcessed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLastUpdated(value: js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdated")(js.Any.fromFunction1(value))
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

