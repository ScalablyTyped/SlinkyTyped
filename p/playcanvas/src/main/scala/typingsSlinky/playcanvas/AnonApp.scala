package typingsSlinky.playcanvas

import typingsSlinky.playcanvas.pc.Application
import typingsSlinky.playcanvas.pc.Entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApp extends js.Object {
  var app: Application = js.native
  var entity: Entity = js.native
}

object AnonApp {
  @scala.inline
  def apply(app: Application, entity: Entity): AnonApp = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApp]
  }
  @scala.inline
  implicit class AnonAppOps[Self <: AnonApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntity(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

