package typingsSlinky.resemblejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResembleComparison extends js.Object {
  def ignoreAntialiasing(): ResembleComparison = js.native
  def ignoreColors(): ResembleComparison = js.native
  def ignoreNothing(): ResembleComparison = js.native
  /**
    * Run the analysis and get the comparison result
    */
  def onComplete(callback: js.Function1[/* result */ ResembleComparisonResult, Unit]): Unit = js.native
  def repaint(): ResembleComparison = js.native
}

object ResembleComparison {
  @scala.inline
  def apply(
    ignoreAntialiasing: () => ResembleComparison,
    ignoreColors: () => ResembleComparison,
    ignoreNothing: () => ResembleComparison,
    onComplete: js.Function1[/* result */ ResembleComparisonResult, Unit] => Unit,
    repaint: () => ResembleComparison
  ): ResembleComparison = {
    val __obj = js.Dynamic.literal(ignoreAntialiasing = js.Any.fromFunction0(ignoreAntialiasing), ignoreColors = js.Any.fromFunction0(ignoreColors), ignoreNothing = js.Any.fromFunction0(ignoreNothing), onComplete = js.Any.fromFunction1(onComplete), repaint = js.Any.fromFunction0(repaint))
    __obj.asInstanceOf[ResembleComparison]
  }
  @scala.inline
  implicit class ResembleComparisonOps[Self <: ResembleComparison] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreAntialiasing(value: () => ResembleComparison): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAntialiasing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIgnoreColors(value: () => ResembleComparison): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreColors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIgnoreNothing(value: () => ResembleComparison): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreNothing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnComplete(value: js.Function1[/* result */ ResembleComparisonResult, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRepaint(value: () => ResembleComparison): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repaint")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

