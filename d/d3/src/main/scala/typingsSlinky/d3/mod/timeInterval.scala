package typingsSlinky.d3.mod

import typingsSlinky.d3Time.mod.CountableTimeInterval
import typingsSlinky.d3Time.mod.TimeInterval_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "timeInterval")
@js.native
object timeInterval extends js.Object {
  
  def apply(
    floor: js.Function1[/* date */ js.Date, Unit],
    offset: js.Function2[/* date */ js.Date, /* step */ Double, Unit]
  ): TimeInterval_ = js.native
  def apply(
    floor: js.Function1[/* date */ js.Date, Unit],
    offset: js.Function2[/* date */ js.Date, /* step */ Double, Unit],
    count: js.Function2[/* start */ js.Date, /* end */ js.Date, Double]
  ): CountableTimeInterval = js.native
  def apply(
    floor: js.Function1[/* date */ js.Date, Unit],
    offset: js.Function2[/* date */ js.Date, /* step */ Double, Unit],
    count: js.Function2[/* start */ js.Date, /* end */ js.Date, Double],
    field: js.Function1[/* date */ js.Date, Double]
  ): CountableTimeInterval = js.native
}
