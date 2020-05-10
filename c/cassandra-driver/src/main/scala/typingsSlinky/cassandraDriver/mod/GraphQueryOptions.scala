package typingsSlinky.cassandraDriver.mod

import typingsSlinky.cassandraDriver.typesMod.types.consistencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQueryOptions extends QueryOptions {
  var graphLanguage: js.UndefOr[String] = js.native
  var graphName: js.UndefOr[String] = js.native
  var graphReadConsistency: js.UndefOr[consistencies] = js.native
  var graphSource: js.UndefOr[String] = js.native
  var graphWriteConsistency: js.UndefOr[consistencies] = js.native
}

object GraphQueryOptions {
  @scala.inline
  def apply(): GraphQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQueryOptions]
  }
  @scala.inline
  implicit class GraphQueryOptionsOps[Self <: GraphQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGraphLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphName")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphReadConsistency(value: consistencies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphReadConsistency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphReadConsistency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphReadConsistency")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphSource")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphWriteConsistency(value: consistencies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphWriteConsistency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphWriteConsistency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphWriteConsistency")(js.undefined)
        ret
    }
  }
  
}

