package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for 1P/3P metadata about a user&#39;s level.
  */
@js.native
trait SchemaPlayerLevel extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerLevel.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The level for the user.
    */
  var level: js.UndefOr[Double] = js.native
  /**
    * The maximum experience points for this level.
    */
  var maxExperiencePoints: js.UndefOr[String] = js.native
  /**
    * The minimum experience points for this level.
    */
  var minExperiencePoints: js.UndefOr[String] = js.native
}

object SchemaPlayerLevel {
  @scala.inline
  def apply(): SchemaPlayerLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerLevel]
  }
  @scala.inline
  implicit class SchemaPlayerLevelOps[Self <: SchemaPlayerLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxExperiencePoints(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExperiencePoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxExperiencePoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExperiencePoints")(js.undefined)
        ret
    }
    @scala.inline
    def withMinExperiencePoints(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minExperiencePoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinExperiencePoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minExperiencePoints")(js.undefined)
        ret
    }
  }
  
}

