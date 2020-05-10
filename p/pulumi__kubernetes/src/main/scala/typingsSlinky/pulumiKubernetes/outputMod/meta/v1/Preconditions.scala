package typingsSlinky.pulumiKubernetes.outputMod.meta.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
  */
@js.native
trait Preconditions extends js.Object {
  /**
    * Specifies the target ResourceVersion
    */
  val resourceVersion: String = js.native
  /**
    * Specifies the target UID.
    */
  val uid: String = js.native
}

object Preconditions {
  @scala.inline
  def apply(resourceVersion: String, uid: String): Preconditions = {
    val __obj = js.Dynamic.literal(resourceVersion = resourceVersion.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preconditions]
  }
  @scala.inline
  implicit class PreconditionsOps[Self <: Preconditions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

