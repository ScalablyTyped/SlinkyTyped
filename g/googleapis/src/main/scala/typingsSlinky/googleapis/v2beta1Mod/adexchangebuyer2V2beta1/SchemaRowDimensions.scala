package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response may include multiple rows, breaking down along various
  * dimensions. Encapsulates the values of all dimensions for a given row.
  */
@js.native
trait SchemaRowDimensions extends js.Object {
  /**
    * The publisher identifier for this row, if a breakdown by
    * [BreakdownDimension.PUBLISHER_IDENTIFIER](https://developers.google.com/authorized-buyers/apis/reference/rest/v2beta1/bidders.accounts.filterSets#FilterSet.BreakdownDimension)
    * was requested.
    */
  var publisherIdentifier: js.UndefOr[String] = js.native
  /**
    * The time interval that this row represents.
    */
  var timeInterval: js.UndefOr[SchemaTimeInterval] = js.native
}

object SchemaRowDimensions {
  @scala.inline
  def apply(): SchemaRowDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRowDimensions]
  }
  @scala.inline
  implicit class SchemaRowDimensionsOps[Self <: SchemaRowDimensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublisherIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisherIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeInterval(value: SchemaTimeInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeInterval")(js.undefined)
        ret
    }
  }
  
}

