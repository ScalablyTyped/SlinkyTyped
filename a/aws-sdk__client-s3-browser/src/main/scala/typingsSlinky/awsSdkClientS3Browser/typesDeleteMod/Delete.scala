package typingsSlinky.awsSdkClientS3Browser.typesDeleteMod

import typingsSlinky.awsSdkClientS3Browser.typesObjectIdentifierMod.ObjectIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delete extends js.Object {
  /**
    * _ObjectIdentifierList shape
    */
  var Objects: js.Array[ObjectIdentifier] | js.Iterable[ObjectIdentifier] = js.native
  /**
    * <p>Element to enable quiet mode for the request. When you add this element, you must set its value to true.</p>
    */
  var Quiet: js.UndefOr[Boolean] = js.native
}

object Delete {
  @scala.inline
  def apply(Objects: js.Array[ObjectIdentifier] | js.Iterable[ObjectIdentifier]): Delete = {
    val __obj = js.Dynamic.literal(Objects = Objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
  @scala.inline
  implicit class DeleteOps[Self <: Delete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectsIterable(value: js.Iterable[ObjectIdentifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjects(value: js.Array[ObjectIdentifier] | js.Iterable[ObjectIdentifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuiet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quiet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuiet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quiet")(js.undefined)
        ret
    }
  }
  
}

