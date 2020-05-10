package typingsSlinky.reactRouter

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocation[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsSlinky.reactRouter.reactRouterStrings.AnonLocation with TopLevel[js.Any] */] extends js.Object {
  var location: Location[LocationState] = js.native
  var `match`: typingsSlinky.reactRouter.mod.`match`[Params] = js.native
}

object AnonLocation {
  @scala.inline
  def apply[Params](location: Location[LocationState], `match`: `match`[Params]): AnonLocation[Params] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocation[Params]]
  }
  @scala.inline
  implicit class AnonLocationOps[Self[params] <: AnonLocation[params], Params] (val x: Self[Params]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Params] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Params]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Params] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Params] with Other]
    @scala.inline
    def withLocation(value: Location[LocationState]): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(value: `match`[Params]): Self[Params] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

