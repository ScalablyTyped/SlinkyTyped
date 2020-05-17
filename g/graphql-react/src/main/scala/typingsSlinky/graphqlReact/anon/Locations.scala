package typingsSlinky.graphqlReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locations extends js.Object {
  var locations: js.Array[Column] = js.native
  var message: String = js.native
  var path: js.Array[String] = js.native
}

object Locations {
  @scala.inline
  def apply(locations: js.Array[Column], message: String, path: js.Array[String]): Locations = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locations]
  }
  @scala.inline
  implicit class LocationsOps[Self <: Locations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocations(value: js.Array[Column]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

