package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the metagame config resource
  */
@js.native
trait SchemaMetagameConfig extends js.Object {
  /**
    * Current version of the metagame configuration data. When this data is
    * updated, the version number will be increased by one.
    */
  var currentVersion: js.UndefOr[Double] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#metagameConfig.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The list of player levels.
    */
  var playerLevels: js.UndefOr[js.Array[SchemaPlayerLevel]] = js.native
}

object SchemaMetagameConfig {
  @scala.inline
  def apply(): SchemaMetagameConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetagameConfig]
  }
  @scala.inline
  implicit class SchemaMetagameConfigOps[Self <: SchemaMetagameConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayerLevels(value: js.Array[SchemaPlayerLevel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerLevels")(js.undefined)
        ret
    }
  }
  
}

