package typingsSlinky.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationResult extends js.Object {
  /**
    * Whether a conflict was detected for this mutation. Always false when a
    * conflict detection strategy field is not set in the mutation.
    */
  var conflictDetected: js.UndefOr[Boolean] = js.native
  /**
    * The automatically allocated key.
    * Set only when the mutation allocated a key.
    */
  var key: js.UndefOr[Key] = js.native
  /**
    * The version of the entity on the server after processing the mutation. If
    * the mutation doesn't change anything on the server, then the version will
    * be the version of the current entity or, if no entity is present, a version
    * that is strictly greater than the version of any previous entity and less
    * than the version of any possible future entity.
    */
  var version: js.UndefOr[String] = js.native
}

object MutationResult {
  @scala.inline
  def apply(): MutationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationResult]
  }
  @scala.inline
  implicit class MutationResultOps[Self <: MutationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConflictDetected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictDetected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflictDetected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictDetected")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

