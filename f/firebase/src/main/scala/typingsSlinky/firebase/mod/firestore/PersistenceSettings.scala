package typingsSlinky.firebase.mod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistenceSettings extends js.Object {
  /**
    * Whether to synchronize the in-memory state of multiple tabs. Setting this
    * to 'true' in all open tabs enables shared access to local persistence,
    * shared execution of queries and latency-compensated local document updates
    * across all connected instances.
    *
    * @deprecated This setting is deprecated. To enabled synchronization between
    * multiple tabs, please use `synchronizeTabs: true` instead.
    */
  var experimentalTabSynchronization: js.UndefOr[Boolean] = js.native
  /**
    * Whether to synchronize the in-memory state of multiple tabs. Setting this
    * to 'true' in all open tabs enables shared access to local persistence,
    * shared execution of queries and latency-compensated local document updates
    * across all connected instances.
    *
    * To enable this mode, `synchronizeTabs:true` needs to be set globally in all
    * active tabs. If omitted or set to 'false', `enablePersistence()` will fail
    * in all but the first tab.
    */
  var synchronizeTabs: js.UndefOr[Boolean] = js.native
}

object PersistenceSettings {
  @scala.inline
  def apply(): PersistenceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceSettings]
  }
  @scala.inline
  implicit class PersistenceSettingsOps[Self <: PersistenceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExperimentalTabSynchronization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalTabSynchronization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentalTabSynchronization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimentalTabSynchronization")(js.undefined)
        ret
    }
    @scala.inline
    def withSynchronizeTabs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronizeTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronizeTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronizeTabs")(js.undefined)
        ret
    }
  }
  
}

