package typingsSlinky.ionicons.stencilCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode extends js.Object {
  @JSName("$attrs$")
  var DollarattrsDollar: js.UndefOr[js.Any] = js.undefined
  @JSName("$children$")
  var DollarchildrenDollar: js.UndefOr[js.Array[VNode]] = js.undefined
  @JSName("$elm$")
  var DollarelmDollar: js.UndefOr[js.Any] = js.undefined
  @JSName("$flags$")
  var DollarflagsDollar: Double
  @JSName("$key$")
  var DollarkeyDollar: js.UndefOr[String | Double] = js.undefined
  @JSName("$name$")
  var DollarnameDollar: js.UndefOr[String] = js.undefined
  @JSName("$tag$")
  var DollartagDollar: js.UndefOr[String | Double | js.Function] = js.undefined
  @JSName("$text$")
  var DollartextDollar: js.UndefOr[String] = js.undefined
}

object VNode {
  @scala.inline
  def apply(
    DollarflagsDollar: Double,
    DollarattrsDollar: js.Any = null,
    DollarchildrenDollar: js.Array[VNode] = null,
    DollarelmDollar: js.Any = null,
    DollarkeyDollar: String | Double = null,
    DollarnameDollar: String = null,
    DollartagDollar: String | Double | js.Function = null,
    DollartextDollar: String = null
  ): VNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$flags$")(DollarflagsDollar.asInstanceOf[js.Any])
    if (DollarattrsDollar != null) __obj.updateDynamic("$attrs$")(DollarattrsDollar.asInstanceOf[js.Any])
    if (DollarchildrenDollar != null) __obj.updateDynamic("$children$")(DollarchildrenDollar.asInstanceOf[js.Any])
    if (DollarelmDollar != null) __obj.updateDynamic("$elm$")(DollarelmDollar.asInstanceOf[js.Any])
    if (DollarkeyDollar != null) __obj.updateDynamic("$key$")(DollarkeyDollar.asInstanceOf[js.Any])
    if (DollarnameDollar != null) __obj.updateDynamic("$name$")(DollarnameDollar.asInstanceOf[js.Any])
    if (DollartagDollar != null) __obj.updateDynamic("$tag$")(DollartagDollar.asInstanceOf[js.Any])
    if (DollartextDollar != null) __obj.updateDynamic("$text$")(DollartextDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode]
  }
}

