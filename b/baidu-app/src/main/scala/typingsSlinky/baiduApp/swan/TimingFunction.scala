package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 界面-----动画
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.baiduApp.baiduAppStrings.linear
  - typingsSlinky.baiduApp.baiduAppStrings.ease
  - typingsSlinky.baiduApp.baiduAppStrings.`ease-in`
  - typingsSlinky.baiduApp.baiduAppStrings.`ease-in-out`
  - typingsSlinky.baiduApp.baiduAppStrings.`ease-out`
  - typingsSlinky.baiduApp.baiduAppStrings.`step-start`
  - typingsSlinky.baiduApp.baiduAppStrings.`step-end`
*/
trait TimingFunction extends js.Object

object TimingFunction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ease: typingsSlinky.baiduApp.baiduAppStrings.ease = this.cast("ease")
  @scala.inline
  def `ease-in`: typingsSlinky.baiduApp.baiduAppStrings.`ease-in` = this.cast("ease-in")
  @scala.inline
  def `ease-in-out`: typingsSlinky.baiduApp.baiduAppStrings.`ease-in-out` = this.cast("ease-in-out")
  @scala.inline
  def `ease-out`: typingsSlinky.baiduApp.baiduAppStrings.`ease-out` = this.cast("ease-out")
  @scala.inline
  def linear: typingsSlinky.baiduApp.baiduAppStrings.linear = this.cast("linear")
  @scala.inline
  def `step-end`: typingsSlinky.baiduApp.baiduAppStrings.`step-end` = this.cast("step-end")
  @scala.inline
  def `step-start`: typingsSlinky.baiduApp.baiduAppStrings.`step-start` = this.cast("step-start")
}

