package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdexchangebuyer.anon.ConfigId
import typingsSlinky.gapiClientAdexchangebuyer.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PretargetingConfigResource extends js.Object {
  /** Deletes an existing pretargeting config. */
  def delete(request: ConfigId): Request[Unit] = js.native
  /** Gets a specific pretargeting configuration */
  def get(request: ConfigId): Request[PretargetingConfig] = js.native
  /** Inserts a new pretargeting configuration. */
  def insert(request: QuotaUser): Request[PretargetingConfig] = js.native
  /** Retrieves a list of the authenticated user's pretargeting configurations. */
  def list(request: QuotaUser): Request[PretargetingConfigList] = js.native
  /** Updates an existing pretargeting config. This method supports patch semantics. */
  def patch(request: ConfigId): Request[PretargetingConfig] = js.native
  /** Updates an existing pretargeting config. */
  def update(request: ConfigId): Request[PretargetingConfig] = js.native
}

object PretargetingConfigResource {
  @scala.inline
  def apply(
    delete: ConfigId => Request[Unit],
    get: ConfigId => Request[PretargetingConfig],
    insert: QuotaUser => Request[PretargetingConfig],
    list: QuotaUser => Request[PretargetingConfigList],
    patch: ConfigId => Request[PretargetingConfig],
    update: ConfigId => Request[PretargetingConfig]
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
    def withDelete(value: ConfigId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: ConfigId => Request[PretargetingConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: QuotaUser => Request[PretargetingConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: QuotaUser => Request[PretargetingConfigList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: ConfigId => Request[PretargetingConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: ConfigId => Request[PretargetingConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

