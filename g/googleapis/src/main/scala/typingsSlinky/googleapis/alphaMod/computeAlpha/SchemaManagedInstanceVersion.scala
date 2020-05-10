package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedInstanceVersion extends js.Object {
  /**
    * [Output Only] The intended template of the instance. This field is empty
    * when current_action is one of { DELETING, ABANDONING }.
    */
  var instanceTemplate: js.UndefOr[String] = js.native
  /**
    * [Output Only] Name of the version.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaManagedInstanceVersion {
  @scala.inline
  def apply(): SchemaManagedInstanceVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstanceVersion]
  }
  @scala.inline
  implicit class SchemaManagedInstanceVersionOps[Self <: SchemaManagedInstanceVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTemplate")(js.undefined)
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

