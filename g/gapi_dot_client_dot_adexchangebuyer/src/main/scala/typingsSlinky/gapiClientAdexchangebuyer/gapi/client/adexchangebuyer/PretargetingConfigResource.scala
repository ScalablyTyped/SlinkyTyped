package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer.AnonConfigId
import typingsSlinky.gapiClientAdexchangebuyer.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PretargetingConfigResource extends js.Object {
  /** Deletes an existing pretargeting config. */
  def delete(request: AnonConfigId): Request_[Unit] = js.native
  /** Gets a specific pretargeting configuration */
  def get(request: AnonConfigId): Request_[PretargetingConfig] = js.native
  /** Inserts a new pretargeting configuration. */
  def insert(request: AnonQuotaUser): Request_[PretargetingConfig] = js.native
  /** Retrieves a list of the authenticated user's pretargeting configurations. */
  def list(request: AnonQuotaUser): Request_[PretargetingConfigList] = js.native
  /** Updates an existing pretargeting config. This method supports patch semantics. */
  def patch(request: AnonConfigId): Request_[PretargetingConfig] = js.native
  /** Updates an existing pretargeting config. */
  def update(request: AnonConfigId): Request_[PretargetingConfig] = js.native
}

object PretargetingConfigResource {
  @scala.inline
  def apply(
    delete: AnonConfigId => Request_[Unit],
    get: AnonConfigId => Request_[PretargetingConfig],
    insert: AnonQuotaUser => Request_[PretargetingConfig],
    list: AnonQuotaUser => Request_[PretargetingConfigList],
    patch: AnonConfigId => Request_[PretargetingConfig],
    update: AnonConfigId => Request_[PretargetingConfig]
  ): PretargetingConfigResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PretargetingConfigResource]
  }
  @scala.inline
  implicit class PretargetingConfigResourceOps[Self <: PretargetingConfigResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonConfigId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonConfigId => Request_[PretargetingConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonQuotaUser => Request_[PretargetingConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonQuotaUser => Request_[PretargetingConfigList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonConfigId => Request_[PretargetingConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonConfigId => Request_[PretargetingConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

