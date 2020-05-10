package typingsSlinky.phenomnomnominalTsquery.tsqueryTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.Equalssign
import typingsSlinky.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.ExclamationmarkEqualssign
import typingsSlinky.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.Greaterthansign
import typingsSlinky.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.GreaterthansignEqualssign
import typingsSlinky.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.Lessthansign
import typingsSlinky.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.LessthansignEqualssign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSQuerySelectorNode
  extends /* key */ StringDictionary[
      TSQuerySelectorNode | js.Array[TSQuerySelectorNode] | js.RegExp | Boolean | Double | String
    ] {
  var index: TSQuerySelectorNode = js.native
  var left: TSQuerySelectorNode = js.native
  var name: String = js.native
  var operator: Equalssign | ExclamationmarkEqualssign | LessthansignEqualssign | Lessthansign | GreaterthansignEqualssign | Greaterthansign = js.native
  var right: TSQuerySelectorNode = js.native
  var selectors: js.Array[TSQuerySelectorNode] = js.native
  var subject: Boolean = js.native
  var `type`: TSQueryAttributeOperatorType = js.native
  var value: TSQuerySelectorNode | js.RegExp | Double | String = js.native
}

object TSQuerySelectorNode {
  @scala.inline
  def apply(
    index: TSQuerySelectorNode,
    left: TSQuerySelectorNode,
    name: String,
    operator: Equalssign | ExclamationmarkEqualssign | LessthansignEqualssign | Lessthansign | GreaterthansignEqualssign | Greaterthansign,
    right: TSQuerySelectorNode,
    selectors: js.Array[TSQuerySelectorNode],
    subject: Boolean,
    `type`: TSQueryAttributeOperatorType,
    value: TSQuerySelectorNode | js.RegExp | Double | String
  ): TSQuerySelectorNode = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSQuerySelectorNode]
  }
  @scala.inline
  implicit class TSQuerySelectorNodeOps[Self <: TSQuerySelectorNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: TSQuerySelectorNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: TSQuerySelectorNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(
      value: Equalssign | ExclamationmarkEqualssign | LessthansignEqualssign | Lessthansign | GreaterthansignEqualssign | Greaterthansign
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: TSQuerySelectorNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectors(value: js.Array[TSQuerySelectorNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TSQueryAttributeOperatorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: TSQuerySelectorNode | js.RegExp | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

