package typingsSlinky.gapiClientDatastore.gapi.client.datastore

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GqlQuery extends js.Object {
  /**
    * When false, the query string must not contain any literals and instead must
    * bind all values. For example,
    * `SELECT &#42; FROM Kind WHERE a = 'string literal'` is not allowed, while
    * `SELECT &#42; FROM Kind WHERE a = @value` is.
    */
  var allowLiterals: js.UndefOr[Boolean] = js.native
  /**
    * For each non-reserved named binding site in the query string, there must be
    * a named parameter with that name, but not necessarily the inverse.
    *
    * Key must match regex `A-Za-z_$&#42;`, must not match regex
    * `__.&#42;__`, and must not be `""`.
    */
  var namedBindings: js.UndefOr[Record[String, GqlQueryParameter]] = js.native
  /**
    * Numbered binding site @1 references the first numbered parameter,
    * effectively using 1-based indexing, rather than the usual 0.
    *
    * For each binding site numbered i in `query_string`, there must be an i-th
    * numbered parameter. The inverse must also be true.
    */
  var positionalBindings: js.UndefOr[js.Array[GqlQueryParameter]] = js.native
  /**
    * A string of the format described
    * [here](https://cloud.google.com/datastore/docs/apis/gql/gql_reference).
    */
  var queryString: js.UndefOr[String] = js.native
}

object GqlQuery {
  @scala.inline
  def apply(): GqlQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GqlQuery]
  }
  @scala.inline
  implicit class GqlQueryOps[Self <: GqlQuery] (val x: Self) extends AnyVal {
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
    def withNamedBindings(value: Record[String, GqlQueryParameter]): Self = {
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
    def withPositionalBindings(value: js.Array[GqlQueryParameter]): Self = {
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

