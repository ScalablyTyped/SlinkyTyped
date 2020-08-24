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
  def apply[/* <: / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    * / typingsSlinky.reactRouter.reactRouterStrings.Location with org.scalablytyped.runtime.TopLevel[js.Any] */ Params](location: typingsSlinky.history.mod.Location[LocationState], `match`: `match`[Params]): Location[Params] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location[Params]]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location[_], /* <: / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    * / typingsSlinky.reactRouter.reactRouterStrings.Location with org.scalablytyped.runtime.TopLevel[js.Any] */ Params] (val x: Self with Location[Params]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocation(value: typingsSlinky.history.mod.Location[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatch(value: `match`[Params]): Self = this.set("match", value.asInstanceOf[js.Any])
  }
  
}

