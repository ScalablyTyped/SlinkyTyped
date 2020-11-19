package typingsSlinky.lolex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LolexWithContext extends js.Object {
  
  def createClock[TClock /* <: Clock */](): TClock = js.native
  def createClock[TClock /* <: Clock */](now: js.UndefOr[scala.Nothing], loopLimit: Double): TClock = js.native
  def createClock[TClock /* <: Clock */](now: Double): TClock = js.native
  def createClock[TClock /* <: Clock */](now: Double, loopLimit: Double): TClock = js.native
  def createClock[TClock /* <: Clock */](now: js.Date): TClock = js.native
  def createClock[TClock /* <: Clock */](now: js.Date, loopLimit: Double): TClock = js.native
  
  def install[TClock /* <: Clock */](): InstalledClock[TClock] = js.native
  def install[TClock /* <: Clock */](opts: LolexInstallOpts): InstalledClock[TClock] = js.native
  
  var timers: GlobalTimers[TimerId] = js.native
  
  def withGlobal(global: js.Object): LolexWithContext = js.native
}
