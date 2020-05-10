package typingsSlinky.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A [GQL
  * query](https://cloud.google.com/datastore/docs/apis/gql/gql_reference).
  */
@js.native
trait SchemaGqlQuery extends js.Object {
  /**
    * When false, the query string must not contain any literals and instead
    * must bind all values. For example, `SELECT * FROM Kind WHERE a =
    * &#39;string literal&#39;` is not allowed, while `SELECT * FROM Kind WHERE
    * a = @value` is.
    */
  var allowLiterals: js.UndefOr[Boolean] = js.native
  /**
    * For each non-reserved named binding site in the query string, there must
    * be a named parameter with that name, but not necessarily the inverse. Key
    * must match regex `A-Za-z_$*`, must not match regex `__.*__`, and must not
    * be `&quot;&quot;`.
    */
  var namedBindings: js.UndefOr[StringDictionary[SchemaGqlQueryParameter]] = js.native
  /**
    * Numbered binding site @1 references the first numbered parameter,
    * effectively using 1-based indexing, rather than the usual 0.  For each
    * binding site numbered i in `query_string`, there must be an i-th numbered
    * parameter. The inverse must also be true.
    */
  var positionalBindings: js.UndefOr[js.Array[SchemaGqlQueryParameter]] = js.native
  /**
    * A string of the format described
    * [here](https://cloud.google.com/datastore/docs/apis/gql/gql_reference).
    */
  var queryString: js.UndefOr[String] = js.native
}

object SchemaGqlQuery {
  @scala.inline
  def apply(): SchemaGqlQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGqlQuery]
  }
  @scala.inline
  implicit class SchemaGqlQueryOps[Self <: SchemaGqlQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowLiterals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLiterals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowLiterals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLiterals")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedBindings(value: StringDictionary[SchemaGqlQueryParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedBindings")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionalBindings(value: js.Array[SchemaGqlQueryParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionalBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionalBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionalBindings")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(js.undefined)
        ret
    }
  }
  
}

