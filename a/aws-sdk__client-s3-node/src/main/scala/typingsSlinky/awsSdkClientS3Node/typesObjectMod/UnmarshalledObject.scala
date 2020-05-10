package typingsSlinky.awsSdkClientS3Node.typesObjectMod

import typingsSlinky.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledObject extends Object {
  /**
    * _LastModified shape
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledObject: js.UndefOr[js.Date] = js.native
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner_UnmarshalledObject: js.UndefOr[UnmarshalledOwner] = js.native
}

object UnmarshalledObject {
  @scala.inline
  def apply(): UnmarshalledObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledObject]
  }
  @scala.inline
  implicit class UnmarshalledObjectOps[Self <: UnmarshalledObject] (val x: Self) extends AnyVal {
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

