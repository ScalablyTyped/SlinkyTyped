package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchyStructure extends js.Object {
  /**
    * Information about level five.
    */
  var LevelFive: js.UndefOr[HierarchyLevel] = js.native
  /**
    * Information about level four.
    */
  var LevelFour: js.UndefOr[HierarchyLevel] = js.native
  /**
    * Information about level one.
    */
  var LevelOne: js.UndefOr[HierarchyLevel] = js.native
  /**
    * Information about level three.
    */
  var LevelThree: js.UndefOr[HierarchyLevel] = js.native
  /**
    * Information about level two.
    */
  var LevelTwo: js.UndefOr[HierarchyLevel] = js.native
}

object HierarchyStructure {
  @scala.inline
  def apply(): HierarchyStructure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyStructure]
  }
  @scala.inline
  implicit class HierarchyStructureOps[Self <: HierarchyStructure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevelFive(value: HierarchyLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LevelFive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelFive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LevelFive")(js.undefined)
        ret
    }
    @scala.inline
    def withLevelFour(value: HierarchyLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LevelFour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelFour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LevelFour")(js.undefined)
        ret
    }
    @scala.inline
    def withLevelOne(value: HierarchyLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LevelOne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelOne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LevelOne")(js.undefined)
        ret
    }
    @scala.inline
    def withLevelThree(value: HierarchyLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LevelThree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelThree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LevelThree")(js.undefined)
        ret
    }
    @scala.inline
    def withLevelTwo(value: HierarchyLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LevelTwo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelTwo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LevelTwo")(js.undefined)
        ret
    }
  }
  
}

