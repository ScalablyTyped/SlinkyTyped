package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains floating objects base settings.
  */
@js.native
trait FloatingObjectInfo extends js.Object {
  /**
    * Gets the parent sub-document what stores the current floating object.
    */
  val parentSubDocument: SubDocument = js.native
  /**
    * Gets the position of the floating object's anchor in the parent sub-document.
    */
  val position: Double = js.native
}

object FloatingObjectInfo {
  @scala.inline
  def apply(parentSubDocument: SubDocument, position: Double): FloatingObjectInfo = {
    val __obj = js.Dynamic.literal(parentSubDocument = parentSubDocument.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingObjectInfo]
  }
  @scala.inline
  implicit class FloatingObjectInfoOps[Self <: FloatingObjectInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParentSubDocument(value: SubDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSubDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

