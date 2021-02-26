package typingsSlinky.reactMdProgress

import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdProgress.circularProgressMod.CircularProgressProps
import typingsSlinky.reactMdProgress.getProgressA11yMod.ProgressA11y
import typingsSlinky.reactMdProgress.linearProgressMod.LinearProgressProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/progress", "CircularProgress")
  @js.native
  val CircularProgress: ForwardRefExoticComponent[CircularProgressProps with RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/progress", "LinearProgress")
  @js.native
  val LinearProgress: ForwardRefExoticComponent[LinearProgressProps with RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/progress", "getProgressA11y")
  @js.native
  def getProgressA11y(progressId: String, progressing: Boolean): js.UndefOr[ProgressA11y] = js.native
}
