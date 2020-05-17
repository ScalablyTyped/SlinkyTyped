package typingsSlinky.jestFakeTimers.jestFakeTimersMod

import typingsSlinky.jestFakeTimers.anon.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/fake-timers/build/jestFakeTimers", JSImport.Default)
@js.native
class default[TimerRef] protected () extends FakeTimers[TimerRef] {
  def this(hasGlobalModuleMockerTimerConfigConfigMaxLoops: Config[TimerRef]) = this()
}

