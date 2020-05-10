package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hasLabels extends js.Object {
  def applyLabel(name: String): Unit = js.native
  def labels(): AdWordsSelector[Label] = js.native
  def removeLabel(name: String): Unit = js.native
}

object hasLabels {
  @scala.inline
  def apply(applyLabel: String => Unit, labels: () => AdWordsSelector[Label], removeLabel: String => Unit): hasLabels = {
    val __obj = js.Dynamic.literal(applyLabel = js.Any.fromFunction1(applyLabel), labels = js.Any.fromFunction0(labels), removeLabel = js.Any.fromFunction1(removeLabel))
    __obj.asInstanceOf[hasLabels]
  }
  @scala.inline
  implicit class hasLabelsOps[Self <: hasLabels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyLabel(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabels(value: () => AdWordsSelector[Label]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveLabel(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLabel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

