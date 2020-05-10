package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Per source result count information.
  */
@js.native
trait SchemaSourceResultCount extends js.Object {
  /**
    * Whether there are more search results for this source.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.native
  /**
    * The estimated result count for this source.
    */
  var resultCountEstimate: js.UndefOr[String] = js.native
  /**
    * The exact result count for this source.
    */
  var resultCountExact: js.UndefOr[String] = js.native
  /**
    * The source the result count information is associated with.
    */
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaSourceResultCount {
  @scala.inline
  def apply(): SchemaSourceResultCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceResultCount]
  }
  @scala.inline
  implicit class SchemaSourceResultCountOps[Self <: SchemaSourceResultCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasMoreResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasMoreResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreResults")(js.undefined)
        ret
    }
    @scala.inline
    def withResultCountEstimate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCountEstimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultCountEstimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCountEstimate")(js.undefined)
        ret
    }
    @scala.inline
    def withResultCountExact(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCountExact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultCountExact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCountExact")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: SchemaSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

