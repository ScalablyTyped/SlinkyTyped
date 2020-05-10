package typingsSlinky.fullpageJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonToSections extends js.Object {
  /**
    * Extension of fullpage.js. Requires fullpage.js >= 2.8.5.
    * Turns horizontal slides into vertical sections.
    */
  def toSections(): Unit = js.native
  /**
    * Extension of fullpage.js. Requires fullpage.js >= 2.8.5.
    * Turns back the original slides (now converted into
    * vertical sections) into horizontal slides again.
    */
  def toSlides(): Unit = js.native
}

object AnonToSections {
  @scala.inline
  def apply(toSections: () => Unit, toSlides: () => Unit): AnonToSections = {
    val __obj = js.Dynamic.literal(toSections = js.Any.fromFunction0(toSections), toSlides = js.Any.fromFunction0(toSlides))
    __obj.asInstanceOf[AnonToSections]
  }
  @scala.inline
  implicit class AnonToSectionsOps[Self <: AnonToSections] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToSections(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSections")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSlides(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSlides")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

