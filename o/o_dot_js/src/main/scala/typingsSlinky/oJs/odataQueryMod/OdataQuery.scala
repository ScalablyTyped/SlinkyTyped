package typingsSlinky.oJs.odataQueryMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OdataQuery
  extends /* key */ StringDictionary[js.Any] {
  @JSName("$compute")
  var $compute: js.UndefOr[String] = js.native
  @JSName("$count")
  var $count: js.UndefOr[Boolean] = js.native
  @JSName("$expand")
  var $expand: js.UndefOr[String] = js.native
  @JSName("$filter")
  var $filter: js.UndefOr[String] = js.native
  @JSName("$format")
  var $format: js.UndefOr[String] = js.native
  @JSName("$index")
  var $index: js.UndefOr[Double] = js.native
  @JSName("$orderby")
  var $orderby: js.UndefOr[String] = js.native
  @JSName("$search")
  var $search: js.UndefOr[String] = js.native
  @JSName("$select")
  var $select: js.UndefOr[String] = js.native
  @JSName("$skip")
  var $skip: js.UndefOr[Double] = js.native
  @JSName("$top")
  var $top: js.UndefOr[Double] = js.native
}

object OdataQuery {
  @scala.inline
  def apply(): OdataQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OdataQuery]
  }
  @scala.inline
  implicit class OdataQueryOps[Self <: OdataQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$compute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$compute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$compute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$compute")(js.undefined)
        ret
    }
    @scala.inline
    def with$count(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$count")(js.undefined)
        ret
    }
    @scala.inline
    def with$expand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$expand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$expand")(js.undefined)
        ret
    }
    @scala.inline
    def with$filter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$filter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$filter")(js.undefined)
        ret
    }
    @scala.inline
    def with$format(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$format: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$format")(js.undefined)
        ret
    }
    @scala.inline
    def with$index(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$index: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$index")(js.undefined)
        ret
    }
    @scala.inline
    def with$orderby(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$orderby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$orderby: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$orderby")(js.undefined)
        ret
    }
    @scala.inline
    def with$search(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$search: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$search")(js.undefined)
        ret
    }
    @scala.inline
    def with$select(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$select: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$select")(js.undefined)
        ret
    }
    @scala.inline
    def with$skip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$skip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$skip")(js.undefined)
        ret
    }
    @scala.inline
    def with$top(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$top: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$top")(js.undefined)
        ret
    }
  }
  
}

