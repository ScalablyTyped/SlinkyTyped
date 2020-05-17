package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes a verb. */
@js.native
trait VerbDescriptor extends js.Object {
  /**
    * specifies the attributes of the verb.
    *
    * It can take values from {@link VerbAttributes} .
    */
  var VerbAttributes: Double = js.native
  /**
    * specifies the flags that are set for the verb.
    *
    * The flags can be used to build the verb's menu.
    */
  var VerbFlags: Double = js.native
  /** specifies the id of the verb. */
  var VerbID: Double = js.native
  /** specifies the name of the verb. */
  var VerbName: String = js.native
}

object VerbDescriptor {
  @scala.inline
  def apply(VerbAttributes: Double, VerbFlags: Double, VerbID: Double, VerbName: String): VerbDescriptor = {
    val __obj = js.Dynamic.literal(VerbAttributes = VerbAttributes.asInstanceOf[js.Any], VerbFlags = VerbFlags.asInstanceOf[js.Any], VerbID = VerbID.asInstanceOf[js.Any], VerbName = VerbName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerbDescriptor]
  }
  @scala.inline
  implicit class VerbDescriptorOps[Self <: VerbDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerbAttributes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerbAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerbFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerbID")(value.asInstanceOf[js.Any])
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

