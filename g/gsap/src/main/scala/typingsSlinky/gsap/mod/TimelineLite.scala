package typingsSlinky.gsap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gsap", "TimelineLite")
@js.native
class TimelineLite ()
  extends typingsSlinky.gsap.gsap.TimelineLite {
  def this(vars: js.Object) = this()
}
object TimelineLite {
  
  /**
    * Seamlessly transfers all tweens, timelines, and [optionally] delayed calls from the root timeline into a new TimelineLite so that you can perform advanced tasks on a seemingly global
    * basis without affecting tweens/timelines that you create after the export.
    */
  /* static member */
  @JSImport("gsap", "TimelineLite.exportRoot")
  @js.native
  def exportRoot(): typingsSlinky.gsap.gsap.TimelineLite = js.native
  @JSImport("gsap", "TimelineLite.exportRoot")
  @js.native
  def exportRoot(vars: js.UndefOr[scala.Nothing], omitDelayedCalls: Boolean): typingsSlinky.gsap.gsap.TimelineLite = js.native
  @JSImport("gsap", "TimelineLite.exportRoot")
  @js.native
  def exportRoot(vars: js.Object): typingsSlinky.gsap.gsap.TimelineLite = js.native
  @JSImport("gsap", "TimelineLite.exportRoot")
  @js.native
  def exportRoot(vars: js.Object, omitDelayedCalls: Boolean): typingsSlinky.gsap.gsap.TimelineLite = js.native
}
