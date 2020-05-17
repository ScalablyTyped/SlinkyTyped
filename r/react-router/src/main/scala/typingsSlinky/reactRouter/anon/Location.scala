package typingsSlinky.reactRouter.anon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsSlinky.reactRouter.reactRouterStrings.Location with TopLevel[js.Any] */] extends js.Object {
  var location: typingsSlinky.history.mod.Location[LocationState] = js.native
  var `match`: typingsSlinky.reactRouter.mod.`match`[Params] = js.native
}

object Location {
  @scala.inline
  def apply[Params](location: typingsSlinky.history.mod.Location[LocationState], `match`: `match`[Params]): Location[Params] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location[Params]]
  }
  @scala.inline
  implicit class LocationOps[Self[params] <: Location[params], Params] (val x: Self[Params]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Params] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Params]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Params] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Params] with Other]
    @scala.inline
    def withLocation(value: typingsSlinky.history.mod.Location[LocationState]): Self[Params] = {
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

