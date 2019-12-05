package typingsSlinky.raven

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ravenMod {
  import org.scalablytyped.runtime.StringDictionary

  type CaptureCallback = js.Function2[/* sendErr */ js.UndefOr[js.Error | Null], /* eventId */ js.Any, Unit]
  type DataCallback = js.Function1[/* data */ StringDictionary[js.Any], js.Any]
  type FatalErrorCallback = js.Function3[
    /* err */ js.Error, 
    /* sendErr */ js.UndefOr[js.Error | Null], 
    /* eventId */ String, 
    Unit
  ]
  type ShouldSendCallback = js.Function1[/* data */ StringDictionary[js.Any], Boolean]
  type parseUserCallback = js.Function1[/* req */ js.Any, js.Any]
}
