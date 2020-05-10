package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalDatabaseBlueprint extends js.Object {
  /**
    * The ID for the database blueprint.
    */
  var blueprintId: js.UndefOr[String] = js.native
  /**
    * The database software of the database blueprint (for example, MySQL).
    */
  var engine: js.UndefOr[RelationalDatabaseEngine] = js.native
  /**
    * The description of the database engine for the database blueprint.
    */
  var engineDescription: js.UndefOr[String] = js.native
  /**
    * The database engine version for the database blueprint (for example, 5.7.23).
    */
  var engineVersion: js.UndefOr[String] = js.native
  /**
    * The description of the database engine version for the database blueprint.
    */
  var engineVersionDescription: js.UndefOr[String] = js.native
  /**
    * A Boolean value indicating whether the engine version is the default for the database blueprint.
    */
  var isEngineDefault: js.UndefOr[Boolean] = js.native
}

object RelationalDatabaseBlueprint {
  @scala.inline
  def apply(): RelationalDatabaseBlueprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseBlueprint]
  }
  @scala.inline
  implicit class RelationalDatabaseBlueprintOps[Self <: RelationalDatabaseBlueprint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlueprintId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueprintId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlueprintId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueprintId")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: RelationalDatabaseEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersionDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersionDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersionDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersionDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEngineDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEngineDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEngineDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEngineDefault")(js.undefined)
        ret
    }
  }
  
}

