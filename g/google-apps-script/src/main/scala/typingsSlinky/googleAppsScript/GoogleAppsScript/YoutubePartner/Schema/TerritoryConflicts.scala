package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerritoryConflicts extends js.Object {
  var conflictingOwnership: js.UndefOr[js.Array[ConflictingOwnership]] = js.native
  var territory: js.UndefOr[String] = js.native
}

object TerritoryConflicts {
  @scala.inline
  def apply(): TerritoryConflicts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerritoryConflicts]
  }
  @scala.inline
  implicit class TerritoryConflictsOps[Self <: TerritoryConflicts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConflictingOwnership(value: js.Array[ConflictingOwnership]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictingOwnership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflictingOwnership: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictingOwnership")(js.undefined)
        ret
    }
    @scala.inline
    def withTerritory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("territory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerritory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("territory")(js.undefined)
        ret
    }
  }
  
}

