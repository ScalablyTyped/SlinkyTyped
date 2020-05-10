package typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod

import typingsSlinky.firebaseFirestore.coreTypesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecWatchEntity extends js.Object {
  /** [<key>, <version>, <value>] */
  var doc: js.UndefOr[SpecDocument] = js.native
  /** [<key>, <version>, <value>][] */
  var docs: js.UndefOr[js.Array[SpecDocument]] = js.native
  var key: js.UndefOr[String] = js.native
  /** [<target-id>, ...] */
  var removedTargets: js.UndefOr[js.Array[TargetId]] = js.native
  /** [<target-id>, ...] */
  var targets: js.UndefOr[js.Array[TargetId]] = js.native
}

object SpecWatchEntity {
  @scala.inline
  def apply(): SpecWatchEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecWatchEntity]
  }
  @scala.inline
  implicit class SpecWatchEntityOps[Self <: SpecWatchEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoc(value: SpecDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(js.undefined)
        ret
    }
    @scala.inline
    def withDocs(value: js.Array[SpecDocument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
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
    def withRemovedTargets(value: js.Array[TargetId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovedTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedTargets")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: js.Array[TargetId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
  }
  
}

