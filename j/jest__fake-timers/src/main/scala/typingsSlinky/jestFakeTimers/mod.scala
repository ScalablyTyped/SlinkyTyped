package typingsSlinky.jestFakeTimers

import typingsSlinky.jestFakeTimers.anon.Config
import typingsSlinky.jestFakeTimers.jestFakeTimersMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/fake-timers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class JestFakeTimers[TimerRef] protected () extends default[TimerRef] {
    def this(hasGlobalModuleMockerTimerConfigConfigMaxLoops: Config[TimerRef]) = this()
  }
}
