package typingsSlinky.ldapjs.mod

import typingsSlinky.ldapjs.anon.PagePause
import typingsSlinky.ldapjs.ldapjsStrings.base
import typingsSlinky.ldapjs.ldapjsStrings.one
import typingsSlinky.ldapjs.ldapjsStrings.sub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchOptions extends js.Object {
  /** Defaults to the empty set, which means all attributes */
  var attributes: js.UndefOr[String | js.Array[String]] = js.native
  var derefAliases: js.UndefOr[Double] = js.native
  /**  Defaults to (objectclass=*) */
  var filter: js.UndefOr[String | Filter] = js.native
  var paged: js.UndefOr[Boolean | PagePause] = js.native
  /** Defaults to base */
  var scope: js.UndefOr[base | one | sub] = js.native
  /** Defaults to 0 (unlimited) */
  var sizeLimit: js.UndefOr[Double] = js.native
  /** Timeout in seconds. Defaults to 10. Lots of servers will ignore this! */
  var timeLimit: js.UndefOr[Double] = js.native
  var typesOnly: js.UndefOr[Boolean] = js.native
}

object SearchOptions {
  @scala.inline
  def apply(): SearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptions]
  }
  @scala.inline
  implicit class SearchOptionsOps[Self <: SearchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDerefAliases(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derefAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDerefAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derefAliases")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String | Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withPaged(value: Boolean | PagePause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paged")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: base | one | sub): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withTypesOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typesOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypesOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typesOnly")(js.undefined)
        ret
    }
  }
  
}

