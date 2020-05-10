package typingsSlinky.onfleetNodeOnfleet.workersMod

import typingsSlinky.onfleetNodeOnfleet.AnonAppVersion
import typingsSlinky.onfleetNodeOnfleet.destinationsMod.Location
import typingsSlinky.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnfleetWorker extends js.Object {
  var accountStatus: String = js.native
  var activeTask: String | Null = js.native
  var capacity: Double = js.native
  var delayTime: Double | Null = js.native
  var displayName: String = js.native
  var id: String = js.native
  var imageUrl: String | Null = js.native
  var location: Location = js.native
  var metadata: js.Array[OnfleetMetadata] = js.native
  var name: String = js.native
  var onDuty: Boolean = js.native
  var organization: String = js.native
  var phone: String = js.native
  var tasks: js.Array[String] = js.native
  var teams: js.Array[String] = js.native
  var timeCreated: Double = js.native
  var timeLastModified: Double = js.native
  var timeLastSeen: Double = js.native
  var userData: AnonAppVersion = js.native
  var vehicle: Vehicle | Null = js.native
}

object OnfleetWorker {
  @scala.inline
  def apply(
    accountStatus: String,
    capacity: Double,
    displayName: String,
    id: String,
    location: Location,
    metadata: js.Array[OnfleetMetadata],
    name: String,
    onDuty: Boolean,
    organization: String,
    phone: String,
    tasks: js.Array[String],
    teams: js.Array[String],
    timeCreated: Double,
    timeLastModified: Double,
    timeLastSeen: Double,
    userData: AnonAppVersion
  ): OnfleetWorker = {
    val __obj = js.Dynamic.literal(accountStatus = accountStatus.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onDuty = onDuty.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], timeLastSeen = timeLastSeen.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetWorker]
  }
  @scala.inline
  implicit class OnfleetWorkerOps[Self <: OnfleetWorker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
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
    def withMetadata(value: js.Array[OnfleetMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDuty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDuty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTasks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeams(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeLastModified(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeLastSeen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLastSeen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserData(value: AnonAppVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveTask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveTaskNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTask")(null)
        ret
    }
    @scala.inline
    def withDelayTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelayTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayTime")(null)
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(null)
        ret
    }
    @scala.inline
    def withVehicle(value: Vehicle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVehicleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicle")(null)
        ret
    }
  }
  
}

