package typingsSlinky.braintree.mod

import typingsSlinky.braintree.anon.Category
import typingsSlinky.braintree.anon.Content
import typingsSlinky.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisputeGateway extends StObject {
  
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
    finalize_ : String => js.Promise[ValidatedResponse[Dispute]],
    find: String => js.Promise[Dispute],
    removeEvidence: (String, String) => js.Promise[ValidatedResponse[Dispute]],
    search: js.Any => Readable
  ): DisputeGateway = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), addFileEvidence = js.Any.fromFunction2(addFileEvidence), addTextEvidence = js.Any.fromFunction2(addTextEvidence), find = js.Any.fromFunction1(find), removeEvidence = js.Any.fromFunction2(removeEvidence), search = js.Any.fromFunction1(search))
    __obj.updateDynamic("finalize")(js.Any.fromFunction1(finalize_))
    __obj.asInstanceOf[DisputeGateway]
  }
  
  @scala.inline
  implicit class DisputeGatewayMutableBuilder[Self <: DisputeGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: String => js.Promise[ValidatedResponse[Dispute]]): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddFileEvidence(value: (String, Category) => js.Promise[ValidatedResponse[Evidence]]): Self = StObject.set(x, "addFileEvidence", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddTextEvidence(value: (String, Content) => js.Promise[ValidatedResponse[Evidence]]): Self = StObject.set(x, "addTextEvidence", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFinalize_(value: String => js.Promise[ValidatedResponse[Dispute]]): Self = StObject.set(x, "finalize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFind(value: String => js.Promise[Dispute]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveEvidence(value: (String, String) => js.Promise[ValidatedResponse[Dispute]]): Self = StObject.set(x, "removeEvidence", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSearch(value: js.Any => Readable): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
  }
}
