package typingsSlinky.lokijs

import typingsSlinky.lokijs.lokijsStrings.compoundsort
import typingsSlinky.lokijs.lokijsStrings.eqJoin
import typingsSlinky.lokijs.lokijsStrings.find
import typingsSlinky.lokijs.lokijsStrings.limit
import typingsSlinky.lokijs.lokijsStrings.map
import typingsSlinky.lokijs.lokijsStrings.mapReduce
import typingsSlinky.lokijs.lokijsStrings.offset
import typingsSlinky.lokijs.lokijsStrings.remove
import typingsSlinky.lokijs.lokijsStrings.simplesort
import typingsSlinky.lokijs.lokijsStrings.sort
import typingsSlinky.lokijs.lokijsStrings.update
import typingsSlinky.lokijs.lokijsStrings.where
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transform extends js.Object {
  var dataOptions: js.UndefOr[js.Any] = js.native
  var desc: js.UndefOr[Boolean] = js.native
  var joinData: js.UndefOr[js.Any] = js.native
  var leftJoinKey: js.UndefOr[js.Any] = js.native
  var mapFun: js.UndefOr[js.Any] = js.native
  var mapFunction: js.UndefOr[js.Any] = js.native
  var property: js.UndefOr[String] = js.native
  var reduceFunction: js.UndefOr[js.Any] = js.native
  var rightJoinKey: js.UndefOr[js.Any] = js.native
  var `type`: find | where | simplesort | compoundsort | sort | limit | offset | map | eqJoin | mapReduce | update | remove = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object Transform {
  @scala.inline
  def apply(
    `type`: find | where | simplesort | compoundsort | sort | limit | offset | map | eqJoin | mapReduce | update | remove
  ): Transform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  @scala.inline
  implicit class TransformOps[Self <: Transform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(
      value: find | where | simplesort | compoundsort | sort | limit | offset | map | eqJoin | mapReduce | update | remove
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDesc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(js.undefined)
        ret
    }
    @scala.inline
    def withJoinData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoinData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinData")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftJoinKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftJoinKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftJoinKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftJoinKey")(js.undefined)
        ret
    }
    @scala.inline
    def withMapFun(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapFun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapFun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapFun")(js.undefined)
        ret
    }
    @scala.inline
    def withMapFunction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(js.undefined)
        ret
    }
    @scala.inline
    def withReduceFunction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduceFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReduceFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduceFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withRightJoinKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightJoinKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightJoinKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightJoinKey")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

