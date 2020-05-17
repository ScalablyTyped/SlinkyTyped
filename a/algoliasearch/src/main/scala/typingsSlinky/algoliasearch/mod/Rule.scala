package typingsSlinky.algoliasearch.mod

import typingsSlinky.algoliasearch.anon.Anchoring
import typingsSlinky.algoliasearch.anon.Promote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a query rule object
  */
@js.native
trait Rule extends js.Object {
  /**
    * Condition of the rule
    */
  var condition: js.UndefOr[Anchoring] = js.native
  /**
    * Consequence of the rule. At least one of the following must be used:
    */
  var consequence: Promote = js.native
  /**
    * This field is intended for rule management purposes,
    * in particular to ease searching for rules and presenting them to human readers.
    * It is not interpreted by the API.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * ObjectID of the synonym
    */
  var objectID: String = js.native
}

object Rule {
  @scala.inline
  def apply(consequence: Promote, objectID: String): Rule = {
    val __obj = js.Dynamic.literal(consequence = consequence.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsequence(value: Promote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCondition(value: Anchoring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

