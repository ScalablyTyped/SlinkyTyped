package typingsSlinky.onfleetNodeOnfleet.hubsMod

import typingsSlinky.onfleetNodeOnfleet.anon.Apartment
import typingsSlinky.onfleetNodeOnfleet.destinationsMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnfleetHub extends js.Object {
  var address: Apartment = js.native
  var id: String = js.native
  var location: Location = js.native
  var name: String = js.native
  var teams: js.Array[String] = js.native
}

object OnfleetHub {
  @scala.inline
  def apply(address: Apartment, id: String, location: Location, name: String, teams: js.Array[String]): OnfleetHub = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetHub]
  }
  @scala.inline
  implicit class OnfleetHubOps[Self <: OnfleetHub] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: Apartment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeams(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teams")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

