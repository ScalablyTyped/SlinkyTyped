package typingsSlinky.atNodelibFsDotWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outProvidersAsyncMod {
  import typingsSlinky.atNodelibFsDotWalk.outTypesMod.Entry
  import typingsSlinky.atNodelibFsDotWalk.outTypesMod.Errno

  type AsyncCallback = js.Function2[/* err */ Errno, /* entries */ js.Array[Entry], Unit]
}
