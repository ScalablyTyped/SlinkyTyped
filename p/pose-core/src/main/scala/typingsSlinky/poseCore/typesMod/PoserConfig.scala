package typingsSlinky.poseCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoserConfig[V]
  extends /* key */ StringDictionary[js.Any] {
  var ancestorValues: js.UndefOr[AncestorValueList[V]] = js.native
  var initialPose: js.UndefOr[String | js.Array[String]] = js.native
  var label: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[OnChangeCallbacks] = js.native
  var parentValues: js.UndefOr[ValueMap[V]] = js.native
  var passive: js.UndefOr[PassiveValueMap] = js.native
  var props: js.UndefOr[Props] = js.native
  var values: js.UndefOr[StringDictionary[V]] = js.native
}

object PoserConfig {
  @scala.inline
  def apply[V](): PoserConfig[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoserConfig[V]]
  }
  @scala.inline
  implicit class PoserConfigOps[Self[v] <: PoserConfig[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withAncestorValues(value: AncestorValueList[V]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancestorValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAncestorValues: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancestorValues")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialPose(value: String | js.Array[String]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialPose: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPose")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: OnChangeCallbacks): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChange: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withParentValues(value: ValueMap[V]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentValues: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentValues")(js.undefined)
        ret
    }
    @scala.inline
    def withPassive(value: PassiveValueMap): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassive: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passive")(js.undefined)
        ret
    }
    @scala.inline
    def withProps(value: Props): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: StringDictionary[V]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

