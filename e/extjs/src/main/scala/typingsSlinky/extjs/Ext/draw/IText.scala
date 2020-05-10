package typingsSlinky.extjs.Ext.draw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IText extends IComponent {
  /** [Config Option] (Number) */
  var degrees: js.UndefOr[Double] = js.native
  /** [Method] Sets the clockwise rotation angle relative to the horizontal axis
  		* @param degrees Number The clockwise angle (in degrees) from the horizontal axis by which the text should be rotated.
  		*/
  var setAngle: js.UndefOr[js.Function1[/* degrees */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Updates this item s text
  		* @param t String The text to display (html not accepted).
  		*/
  var setText: js.UndefOr[js.Function1[/* t */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var styleSelector: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.native
}

object IText {
  @scala.inline
  def apply(): IText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IText]
  }
  @scala.inline
  implicit class ITextOps[Self <: IText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degrees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDegrees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degrees")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAngle(value: /* degrees */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAngle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetText(value: /* t */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

