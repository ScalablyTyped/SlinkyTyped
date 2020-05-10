package typingsSlinky.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subject matches the originator of a request, as identified by the request authentication
  * system. There are three ways of matching an originator; by user, group, or service account.
  */
@js.native
trait Subject extends js.Object {
  val group: GroupSubject = js.native
  /**
    * Required
    */
  val kind: String = js.native
  val serviceAccount: ServiceAccountSubject = js.native
  val user: UserSubject = js.native
}

object Subject {
  @scala.inline
  def apply(group: GroupSubject, kind: String, serviceAccount: ServiceAccountSubject, user: UserSubject): Subject = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subject]
  }
  @scala.inline
  implicit class SubjectOps[Self <: Subject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroup(value: GroupSubject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceAccount(value: ServiceAccountSubject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: UserSubject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

