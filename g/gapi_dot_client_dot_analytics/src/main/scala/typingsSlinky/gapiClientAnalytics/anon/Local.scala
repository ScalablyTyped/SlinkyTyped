package typingsSlinky.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Local extends js.Object {
  /**
    * Effective permissions represent all the permissions that a user has for this entity. These include any implied permissions (e.g., EDIT implies VIEW) or
    * inherited permissions from the parent entity. Effective permissions are read-only.
    */
  var effective: js.UndefOr[js.Array[String]] = js.native
  /** Permissions that a user has been assigned at this very level. Does not include any implied or inherited permissions. Local permissions are modifiable. */
  var local: js.UndefOr[js.Array[String]] = js.native
}

object Local {
  @scala.inline
  def apply(): Local = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Local]
  }
  @scala.inline
  implicit class LocalOps[Self <: Local] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffective(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effective")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(js.undefined)
        ret
    }
  }
  
}

