package typingsSlinky.phaser.Phaser.Types.GameObjects.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Font metrics for a Text Style object.
  */
@js.native
trait TextMetrics extends js.Object {
  /**
    * The ascent of the font.
    */
  var ascent: Double = js.native
  /**
    * The descent of the font.
    */
  var descent: Double = js.native
  /**
    * The size of the font.
    */
  var fontSize: Double = js.native
}

object TextMetrics {
  @scala.inline
  def apply(ascent: Double, descent: Double, fontSize: Double): TextMetrics = {
    val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMetrics]
  }
  @scala.inline
  implicit class TextMetricsOps[Self <: TextMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

