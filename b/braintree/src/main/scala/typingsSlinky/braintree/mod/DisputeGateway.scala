package typingsSlinky.braintree.mod

import typingsSlinky.braintree.anon.Category
import typingsSlinky.braintree.anon.Content
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisputeGateway extends js.Object {
  def accept(disputeId: String): js.Promise[ValidatedResponse[Dispute]] = js.native
  def addFileEvidence(disputeId: String, evidence: Category): js.Promise[ValidatedResponse[Evidence]] = js.native
  def addTextEvidence(disputeId: String, evidence: Content): js.Promise[ValidatedResponse[Evidence]] = js.native
  def finalize(disputeId: String): js.Promise[ValidatedResponse[Dispute]] = js.native
  def find(disputeId: String): js.Promise[Dispute] = js.native
  def removeEvidence(disputeId: String, evidenceId: String): js.Promise[ValidatedResponse[Dispute]] = js.native
  def search(searchFn: js.Any): Readable = js.native
}

object DisputeGateway {
  @scala.inline
  def apply(
    accept: String => js.Promise[ValidatedResponse[Dispute]],
    addFileEvidence: (String, Category) => js.Promise[ValidatedResponse[Evidence]],
    addTextEvidence: (String, Content) => js.Promise[ValidatedResponse[Evidence]],
    finalize: String => js.Promise[ValidatedResponse[Dispute]],
    find: String => js.Promise[Dispute],
    removeEvidence: (String, String) => js.Promise[ValidatedResponse[Dispute]],
    search: js.Any => Readable
  ): DisputeGateway = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), addFileEvidence = js.Any.fromFunction2(addFileEvidence), addTextEvidence = js.Any.fromFunction2(addTextEvidence), finalize = js.Any.fromFunction1(finalize), find = js.Any.fromFunction1(find), removeEvidence = js.Any.fromFunction2(removeEvidence), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[DisputeGateway]
  }
  @scala.inline
  implicit class DisputeGatewayOps[Self <: DisputeGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: String => js.Promise[ValidatedResponse[Dispute]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddFileEvidence(value: (String, Category) => js.Promise[ValidatedResponse[Evidence]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFileEvidence")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddTextEvidence(value: (String, Content) => js.Promise[ValidatedResponse[Evidence]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTextEvidence")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFinalize(value: String => js.Promise[ValidatedResponse[Dispute]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFind(value: String => js.Promise[Dispute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveEvidence(value: (String, String) => js.Promise[ValidatedResponse[Dispute]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEvidence")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSearch(value: js.Any => Readable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

