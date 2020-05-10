package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Drive activity comprising one or more Actions by one or more
  * Actors on one or more Targets. Some Action groupings occur spontaneously,
  * such as moving an item into a shared folder triggering a permission change.
  * Other groupings of related Actions, such as multiple Actors editing one
  * item or moving multiple files into a new folder, are controlled by the
  * selection of a ConsolidationStrategy in the QueryDriveActivityRequest.
  */
@js.native
trait SchemaDriveActivity extends js.Object {
  /**
    * Details on all actions in this activity.
    */
  var actions: js.UndefOr[js.Array[SchemaAction]] = js.native
  /**
    * All actor(s) responsible for the activity.
    */
  var actors: js.UndefOr[js.Array[SchemaActor]] = js.native
  /**
    * Key information about the primary action for this activity. This is
    * either representative, or the most important, of all actions in the
    * activity, according to the ConsolidationStrategy in the request.
    */
  var primaryActionDetail: js.UndefOr[SchemaActionDetail] = js.native
  /**
    * All Drive objects this activity is about (e.g. file, folder, Team Drive).
    * This represents the state of the target immediately after the actions
    * occurred.
    */
  var targets: js.UndefOr[js.Array[SchemaTarget]] = js.native
  /**
    * The activity occurred over this time range.
    */
  var timeRange: js.UndefOr[SchemaTimeRange] = js.native
  /**
    * The activity occurred at this specific time.
    */
  var timestamp: js.UndefOr[String] = js.native
}

object SchemaDriveActivity {
  @scala.inline
  def apply(): SchemaDriveActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveActivity]
  }
  @scala.inline
  implicit class SchemaDriveActivityOps[Self <: SchemaDriveActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[SchemaAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withActors(value: js.Array[SchemaActor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actors")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryActionDetail(value: SchemaActionDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryActionDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryActionDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryActionDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: js.Array[SchemaTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeRange(value: SchemaTimeRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}

