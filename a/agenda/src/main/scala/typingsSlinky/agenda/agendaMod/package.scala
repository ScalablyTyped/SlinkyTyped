package typingsSlinky.agenda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object agendaMod {
  import org.scalablytyped.runtime.StringDictionary

  type Callback = js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  type JobAttributesData = StringDictionary[js.Any]
  type ResultCallback[T] = js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[T], Unit]
}
