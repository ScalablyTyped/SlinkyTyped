package typingsSlinky.pulumiAws.placementGroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.placementStrategyMod.PlacementStrategy
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementGroupState extends js.Object {
  /**
    * The name of the placement group.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the placement group.
    */
  val placementGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * The placement strategy.
    */
  val strategy: js.UndefOr[Input[PlacementStrategy]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object PlacementGroupState {
  @scala.inline
  def apply(): PlacementGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementGroupState]
  }
  @scala.inline
  implicit class PlacementGroupStateOps[Self <: PlacementGroupState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementGroupId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: Input[PlacementStrategy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

