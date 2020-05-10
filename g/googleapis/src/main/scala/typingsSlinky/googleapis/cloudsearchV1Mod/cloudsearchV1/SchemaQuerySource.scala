package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of sources that the user can search using the query API.
  */
@js.native
trait SchemaQuerySource extends js.Object {
  /**
    * Display name of the data source.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * List of all operators applicable for this source.
    */
  var operators: js.UndefOr[js.Array[SchemaQueryOperator]] = js.native
  /**
    * A short name or alias for the source.  This value can be used with the
    * &#39;source&#39; operator.
    */
  var shortName: js.UndefOr[String] = js.native
  /**
    * Name of the source
    */
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaQuerySource {
  @scala.inline
  def apply(): SchemaQuerySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuerySource]
  }
  @scala.inline
  implicit class SchemaQuerySourceOps[Self <: SchemaQuerySource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withOperators(value: js.Array[SchemaQueryOperator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operators")(js.undefined)
        ret
    }
    @scala.inline
    def withShortName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(js.undefined)
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

