package typingsSlinky.ionicons.stencilCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VNode extends js.Object {
  @JSName("$attrs$")
  var DollarattrsDollar: js.UndefOr[js.Any] = js.native
  @JSName("$children$")
  var DollarchildrenDollar: js.UndefOr[js.Array[VNode]] = js.native
  @JSName("$elm$")
  var DollarelmDollar: js.UndefOr[js.Any] = js.native
  @JSName("$flags$")
  var DollarflagsDollar: Double = js.native
  @JSName("$key$")
  var DollarkeyDollar: js.UndefOr[String | Double] = js.native
  @JSName("$name$")
  var DollarnameDollar: js.UndefOr[String] = js.native
  @JSName("$tag$")
  var DollartagDollar: js.UndefOr[String | Double | js.Function] = js.native
  @JSName("$text$")
  var DollartextDollar: js.UndefOr[String] = js.native
}

object VNode {
  @scala.inline
  def apply(DollarflagsDollar: Double): VNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$flags$")(DollarflagsDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode]
  }
  @scala.inline
  implicit class VNodeOps[Self <: VNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDollarflagsDollar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$flags$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDollarattrsDollar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$attrs$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDollarattrsDollar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$attrs$")(js.undefined)
        ret
    }
    @scala.inline
    def withDollarchildrenDollar(value: js.Array[VNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$children$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDollarchildrenDollar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$children$")(js.undefined)
        ret
    }
    @scala.inline
    def withDollarelmDollar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$elm$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDollarelmDollar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$elm$")(js.undefined)
        ret
    }
    @scala.inline
    def withDollarkeyDollar(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$key$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDollarkeyDollar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$key$")(js.undefined)
        ret
    }
    @scala.inline
    def withDollarnameDollar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$name$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDollarnameDollar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$name$")(js.undefined)
        ret
    }
    @scala.inline
    def withDollartagDollar(value: String | Double | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$tag$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDollartagDollar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$tag$")(js.undefined)
        ret
    }
    @scala.inline
    def withDollartextDollar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$text$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDollartextDollar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$text$")(js.undefined)
        ret
    }
  }
  
}

