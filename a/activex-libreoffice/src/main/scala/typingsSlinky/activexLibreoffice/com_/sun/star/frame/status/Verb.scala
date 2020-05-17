package typingsSlinky.activexLibreoffice.com_.sun.star.frame.status

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a command that can be send to an OLE object
  *
  * For example, this can be used to select a font.
  * @since OOo 2.0
  */
@js.native
trait Verb extends js.Object {
  /** specifies the Id of the command. */
  var VerbId: Double = js.native
  /** specifies if the command is available for a constant object. */
  var VerbIsConst: Boolean = js.native
  /** specifies if the command should be visible in a menu. */
  var VerbIsOnMenu: Boolean = js.native
  /** specifies the name of the command. The name is localized. */
  var VerbName: String = js.native
}

object Verb {
  @scala.inline
  def apply(VerbId: Double, VerbIsConst: Boolean, VerbIsOnMenu: Boolean, VerbName: String): Verb = {
    val __obj = js.Dynamic.literal(VerbId = VerbId.asInstanceOf[js.Any], VerbIsConst = VerbIsConst.asInstanceOf[js.Any], VerbIsOnMenu = VerbIsOnMenu.asInstanceOf[js.Any], VerbName = VerbName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Verb]
  }
  @scala.inline
  implicit class VerbOps[Self <: Verb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerbId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerbId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbIsConst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerbIsConst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbIsOnMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerbIsOnMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerbName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

