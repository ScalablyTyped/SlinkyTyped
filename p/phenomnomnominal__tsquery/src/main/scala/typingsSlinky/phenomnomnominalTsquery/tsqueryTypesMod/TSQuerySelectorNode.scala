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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndex(value: TSQuerySelectorNode): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: TSQuerySelectorNode): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(
      value: Equalssign | ExclamationmarkEqualssign | LessthansignEqualssign | Lessthansign | GreaterthansignEqualssign | Greaterthansign
    ): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: TSQuerySelectorNode): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorsVarargs(value: TSQuerySelectorNode*): Self = this.set("selectors", js.Array(value :_*))
    
    @scala.inline
    def setSelectors(value: js.Array[TSQuerySelectorNode]): Self = this.set("selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Boolean): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSQueryAttributeOperatorType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRegExp(value: js.RegExp): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TSQuerySelectorNode | js.RegExp | Double | String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
