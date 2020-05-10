package typingsSlinky.awsSdkClientS3Node.typesObjectVersionMod

import typingsSlinky.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledObjectVersion extends ObjectVersion {
  /**
    * <p>Date and time the object was last modified.</p>
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledObjectVersion: js.UndefOr[js.Date] = js.native
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner_UnmarshalledObjectVersion: js.UndefOr[UnmarshalledOwner] = js.native
}

object UnmarshalledObjectVersion {
  @scala.inline
  def apply(): UnmarshalledObjectVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledObjectVersion]
  }
  @scala.inline
  implicit class UnmarshalledObjectVersionOps[Self <: UnmarshalledObjectVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: UnmarshalledOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owner")(js.undefined)
        ret
    }
  }
  
}

