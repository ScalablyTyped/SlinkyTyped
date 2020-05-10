package typingsSlinky.openssiWebsdk.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProofSelection extends js.Object {
  var attributes: StringDictionary[AttributeChoice] = js.native
  var predicates: StringDictionary[PredicateChoice] = js.native
}

object ProofSelection {
  @scala.inline
  def apply(attributes: StringDictionary[AttributeChoice], predicates: StringDictionary[PredicateChoice]): ProofSelection = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], predicates = predicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofSelection]
  }
  @scala.inline
  implicit class ProofSelectionOps[Self <: ProofSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: StringDictionary[AttributeChoice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredicates(value: StringDictionary[PredicateChoice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

