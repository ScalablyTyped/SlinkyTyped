package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SELinuxOptions are the labels to be applied to the container
  */
@js.native
trait SELinuxOptions extends js.Object {
  /**
    * Level is SELinux level label that applies to the container.
    */
  val level: String = js.native
  /**
    * Role is a SELinux role label that applies to the container.
    */
  val role: String = js.native
  /**
    * Type is a SELinux type label that applies to the container.
    */
  val `type`: String = js.native
  /**
    * User is a SELinux user label that applies to the container.
    */
  val user: String = js.native
}

object SELinuxOptions {
  @scala.inline
  def apply(level: String, role: String, `type`: String, user: String): SELinuxOptions = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SELinuxOptions]
  }
  @scala.inline
  implicit class SELinuxOptionsOps[Self <: SELinuxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

