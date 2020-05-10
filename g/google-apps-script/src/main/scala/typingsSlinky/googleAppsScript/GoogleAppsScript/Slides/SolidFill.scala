package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A solid color fill.
  *
  * SolidFill objects are detached and immutable, so do not reflect changes made after
  * they have been created.
  */
@js.native
trait SolidFill extends js.Object {
  def getAlpha(): Double = js.native
  def getColor(): Color = js.native
}

object SolidFill {
  @scala.inline
  def apply(getAlpha: () => Double, getColor: () => Color): SolidFill = {
    val __obj = js.Dynamic.literal(getAlpha = js.Any.fromFunction0(getAlpha), getColor = js.Any.fromFunction0(getColor))
    __obj.asInstanceOf[SolidFill]
  }
  @scala.inline
  implicit class SolidFillOps[Self <: SolidFill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAlpha(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlpha")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetColor(value: () => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColor")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

