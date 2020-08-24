package typingsSlinky.reactMdProgress

import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdProgress.circularProgressMod.CircularProgressProps
import typingsSlinky.reactMdProgress.getProgressA11yMod.ProgressA11y
import typingsSlinky.reactMdProgress.linearProgressMod.LinearProgressProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/progress", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val CircularProgress: ForwardRefExoticComponent[CircularProgressProps with RefAttributes[HTMLSpanElement]] = js.native
  val LinearProgress: ForwardRefExoticComponent[LinearProgressProps with RefAttributes[HTMLSpanElement]] = js.native
  def getProgressA11y(progressId: String, progressing: Boolean): js.UndefOr[ProgressA11y] = js.native
}

