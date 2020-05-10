package typingsSlinky.officeUiFabricReact.scrollablePaneDetailsListExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollablePaneDetailsListExampleItem extends js.Object {
  var key: Double | String = js.native
  var test1: String = js.native
  var test2: String = js.native
  var test3: String = js.native
  var test4: String = js.native
  var test5: String = js.native
  var test6: String = js.native
}

object IScrollablePaneDetailsListExampleItem {
  @scala.inline
  def apply(
    key: Double | String,
    test1: String,
    test2: String,
    test3: String,
    test4: String,
    test5: String,
    test6: String
  ): IScrollablePaneDetailsListExampleItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], test1 = test1.asInstanceOf[js.Any], test2 = test2.asInstanceOf[js.Any], test3 = test3.asInstanceOf[js.Any], test4 = test4.asInstanceOf[js.Any], test5 = test5.asInstanceOf[js.Any], test6 = test6.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollablePaneDetailsListExampleItem]
  }
  @scala.inline
  implicit class IScrollablePaneDetailsListExampleItemOps[Self <: IScrollablePaneDetailsListExampleItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest5(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest6(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test6")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

