package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectIdentifierAndLinkNameTuple extends js.Object {
  /**
    * The name of the link between the parent and the child object.
    */
  var LinkName: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.LinkName] = js.native
  /**
    * The ID that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
}

object ObjectIdentifierAndLinkNameTuple {
  @scala.inline
  def apply(): ObjectIdentifierAndLinkNameTuple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectIdentifierAndLinkNameTuple]
  }
  @scala.inline
  implicit class ObjectIdentifierAndLinkNameTupleOps[Self <: ObjectIdentifierAndLinkNameTuple] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinkName(value: LinkName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkName")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectIdentifier(value: ObjectIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectIdentifier")(js.undefined)
        ret
    }
  }
  
}

