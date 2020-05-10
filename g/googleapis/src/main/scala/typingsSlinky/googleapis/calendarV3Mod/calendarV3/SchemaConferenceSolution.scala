package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaConferenceSolution extends js.Object {
  /**
    * The user-visible icon for this solution.
    */
  var iconUri: js.UndefOr[String] = js.native
  /**
    * The key which can uniquely identify the conference solution for this
    * event.
    */
  var key: js.UndefOr[SchemaConferenceSolutionKey] = js.native
  /**
    * The user-visible name of this solution. Not localized.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaConferenceSolution {
  @scala.inline
  def apply(): SchemaConferenceSolution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceSolution]
  }
  @scala.inline
  implicit class SchemaConferenceSolutionOps[Self <: SchemaConferenceSolution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUri")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: SchemaConferenceSolutionKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

