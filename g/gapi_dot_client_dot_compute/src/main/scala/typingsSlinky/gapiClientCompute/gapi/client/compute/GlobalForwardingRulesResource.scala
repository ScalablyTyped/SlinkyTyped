package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltFields
import typingsSlinky.gapiClientCompute.anon.FieldsForwardingRule
import typingsSlinky.gapiClientCompute.anon.ForwardingRuleKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalForwardingRulesResource extends js.Object {
  /** Deletes the specified GlobalForwardingRule resource. */
  def delete(request: FieldsForwardingRule): Request[Operation] = js.native
  /** Returns the specified GlobalForwardingRule resource. Get a list of available forwarding rules by making a list() request. */
  def get(request: ForwardingRuleKey): Request[ForwardingRule] = js.native
  /** Creates a GlobalForwardingRule resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  /** Retrieves a list of GlobalForwardingRule resources available to the specified project. */
  def list(request: Alt): Request[ForwardingRuleList] = js.native
  /** Changes target URL for the GlobalForwardingRule resource. The new target should be of the same type as the old target. */
  def setTarget(request: FieldsForwardingRule): Request[Operation] = js.native
}

object GlobalForwardingRulesResource {
  @scala.inline
  def apply(
    delete: FieldsForwardingRule => Request[Operation],
    get: ForwardingRuleKey => Request[ForwardingRule],
    insert: AltFields => Request[Operation],
    list: Alt => Request[ForwardingRuleList],
    setTarget: FieldsForwardingRule => Request[Operation]
  ): GlobalForwardingRulesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setTarget = js.Any.fromFunction1(setTarget))
    __obj.asInstanceOf[GlobalForwardingRulesResource]
  }
  @scala.inline
  implicit class GlobalForwardingRulesResourceOps[Self <: GlobalForwardingRulesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: FieldsForwardingRule => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: ForwardingRuleKey => Request[ForwardingRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AltFields => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Alt => Request[ForwardingRuleList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTarget(value: FieldsForwardingRule => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTarget")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

