package typingsSlinky.algoliasearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the option used when creating user key
  */
@js.native
trait ApiKeyOptions extends js.Object {
  /**
    * Specify a description to describe where the key is used.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Specify the list of targeted indices
    */
  var indexes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specify the maximum number of hits this API key can retrieve in one call
    */
  var maxHitsPerQuery: js.UndefOr[Boolean] = js.native
  /**
    * Specify the maximum number of API calls allowed from an IP address per hour
    */
  var maxQueriesPerIPPerHour: js.UndefOr[Double] = js.native
  /**
    * Specify the list of query parameters
    */
  var queryParameters: js.UndefOr[QueryParameters] = js.native
  /**
    * Specify the list of referers
    */
  var referers: js.UndefOr[js.Array[String]] = js.native
  /**
    * Add a validity period. The key will be valid for a specific period of time (in seconds).
    */
  var validity: js.UndefOr[Double] = js.native
}

object ApiKeyOptions {
  @scala.inline
  def apply(): ApiKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKeyOptions]
  }
  @scala.inline
  implicit class ApiKeyOptionsOps[Self <: ApiKeyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withIndexes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHitsPerQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHitsPerQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHitsPerQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHitsPerQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxQueriesPerIPPerHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxQueriesPerIPPerHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxQueriesPerIPPerHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxQueriesPerIPPerHour")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParameters(value: QueryParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withReferers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referers")(js.undefined)
        ret
    }
    @scala.inline
    def withValidity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validity")(js.undefined)
        ret
    }
  }
  
}

