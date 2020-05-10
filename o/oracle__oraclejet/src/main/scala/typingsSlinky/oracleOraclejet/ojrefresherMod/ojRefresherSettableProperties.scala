package typingsSlinky.oracleOraclejet.ojrefresherMod

import org.scalajs.dom.raw.Element
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojRefresherSettableProperties extends baseComponentSettableProperties {
  var target: Element = js.native
  var text: String = js.native
  var threshold: Double = js.native
  def refreshContent(): js.Promise[_] = js.native
}

object ojRefresherSettableProperties {
  @scala.inline
  def apply(refreshContent: () => js.Promise[_], target: Element, text: String, threshold: Double): ojRefresherSettableProperties = {
    val __obj = js.Dynamic.literal(refreshContent = js.Any.fromFunction0(refreshContent), target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRefresherSettableProperties]
  }
  @scala.inline
  implicit class ojRefresherSettablePropertiesOps[Self <: ojRefresherSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRefreshContent(value: () => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTarget(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

