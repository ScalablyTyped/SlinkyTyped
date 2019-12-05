package typingsSlinky.inputDashMoment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputDashMomentMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.moment.momentMod.Moment

  type InputMoment = ReactComponentClass[InputMomentProps]
  type OnChangeListener = js.Function1[/* m */ Moment, Unit]
  type OnSaveListener = js.Function0[Unit]
}
