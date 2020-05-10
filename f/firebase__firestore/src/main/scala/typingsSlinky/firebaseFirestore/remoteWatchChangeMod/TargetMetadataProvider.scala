package typingsSlinky.firebaseFirestore.remoteWatchChangeMod

import typingsSlinky.firebaseFirestore.coreTypesMod.TargetId
import typingsSlinky.firebaseFirestore.localTargetDataMod.TargetData
import typingsSlinky.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetMetadataProvider extends js.Object {
  /**
    * Returns the set of remote document keys for the given target ID as of the
    * last raised snapshot.
    */
  def getRemoteKeysForTarget(targetId: TargetId): DocumentKeySet_ = js.native
  /**
    * Returns the TargetData for an active target ID or 'null' if this target
    * has become inactive
    */
  def getTargetDataForTarget(targetId: TargetId): TargetData | Null = js.native
}

object TargetMetadataProvider {
  @scala.inline
  def apply(
    getRemoteKeysForTarget: TargetId => DocumentKeySet_,
    getTargetDataForTarget: TargetId => TargetData | Null
  ): TargetMetadataProvider = {
    val __obj = js.Dynamic.literal(getRemoteKeysForTarget = js.Any.fromFunction1(getRemoteKeysForTarget), getTargetDataForTarget = js.Any.fromFunction1(getTargetDataForTarget))
    __obj.asInstanceOf[TargetMetadataProvider]
  }
  @scala.inline
  implicit class TargetMetadataProviderOps[Self <: TargetMetadataProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRemoteKeysForTarget(value: TargetId => DocumentKeySet_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemoteKeysForTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTargetDataForTarget(value: TargetId => TargetData | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTargetDataForTarget")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

