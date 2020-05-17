package typingsSlinky.knockoutMapping.mod.global

import typingsSlinky.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutMappingUpdateOptions extends js.Object {
  var data: js.Any = js.native
  var observable: js.UndefOr[KnockoutObservable[_]] = js.native
  var parent: js.Any = js.native
  var target: js.Any = js.native
}

object KnockoutMappingUpdateOptions {
  @scala.inline
  def apply(data: js.Any, parent: js.Any, target: js.Any): KnockoutMappingUpdateOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutMappingUpdateOptions]
  }
  @scala.inline
  implicit class KnockoutMappingUpdateOptionsOps[Self <: KnockoutMappingUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObservable(value: KnockoutObservable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObservable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observable")(js.undefined)
        ret
    }
  }
  
}

