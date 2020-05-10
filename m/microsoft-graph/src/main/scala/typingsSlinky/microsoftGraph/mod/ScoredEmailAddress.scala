package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScoredEmailAddress extends js.Object {
  // The email address.
  var address: js.UndefOr[String] = js.native
  var itemId: js.UndefOr[String] = js.native
  /**
    * The relevance score of the email address. A relevance score is used as a sort key, in relation to the other returned
    * results. A higher relevance score value corresponds to a more relevant result. Relevance is determined by the user’s
    * communication and collaboration patterns and business relationships.
    */
  var relevanceScore: js.UndefOr[Double] = js.native
  var selectionLikelihood: js.UndefOr[SelectionLikelihoodInfo] = js.native
}

object ScoredEmailAddress {
  @scala.inline
  def apply(): ScoredEmailAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScoredEmailAddress]
  }
  @scala.inline
  implicit class ScoredEmailAddressOps[Self <: ScoredEmailAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(js.undefined)
        ret
    }
    @scala.inline
    def withRelevanceScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevanceScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelevanceScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevanceScore")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionLikelihood(value: SelectionLikelihoodInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionLikelihood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionLikelihood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionLikelihood")(js.undefined)
        ret
    }
  }
  
}

