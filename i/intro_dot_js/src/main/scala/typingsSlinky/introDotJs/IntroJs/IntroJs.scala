package typingsSlinky.introDotJs.IntroJs

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntroJs extends js.Object {
  def addHints(): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def exit(): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def goToStep(step: Double): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def goToStepNumber(stepId: Double): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def hideHint(stepId: Double): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def hideHints(): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def nextStep(): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def onafterchange(callback: js.Function1[/* element */ HTMLElement, _]): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def onbeforechange(callback: js.Function1[/* element */ HTMLElement, _]): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def onchange(callback: js.Function1[/* element */ HTMLElement, _]): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def oncomplete(callback: js.Function): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def onexit(callback: js.Function): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def onhintclick(callback: js.Function3[/* hintElement */ HTMLElement, /* item */ Step, /* stepId */ Double, _]): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def onhintclose(callback: js.Function1[/* stepId */ Double, _]): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def onhintsadded(callback: js.Function): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def previousStep(): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def refresh(): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def removeHint(stepId: Double): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def removeHints(): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def setOption(option: String, value: String): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def setOption(option: String, value: Boolean): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def setOption(option: String, value: Double): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def setOptions(options: Options): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def showHint(stepId: Double): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def showHints(): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
  def start(): typingsSlinky.introDotJs.IntroJs.IntroJs = js.native
}

