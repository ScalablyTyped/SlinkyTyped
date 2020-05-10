package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDestinationTableProperties extends js.Object {
  /**
    * [Optional] The description for the destination table. This will only be
    * used if the destination table is newly created. If the table already
    * exists and a value different than the current description is provided,
    * the job will fail.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Optional] The friendly name for the destination table. This will only be
    * used if the destination table is newly created. If the table already
    * exists and a value different than the current friendly name is provided,
    * the job will fail.
    */
  var friendlyName: js.UndefOr[String] = js.native
  /**
    * [Optional] The labels associated with this table. You can use these to
    * organize and group your tables. This will only be used if the destination
    * table is newly created. If the table already exists and labels are
    * different than the current labels are provided, the job will fail.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaDestinationTableProperties {
  @scala.inline
  def apply(): SchemaDestinationTableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDestinationTableProperties]
  }
  @scala.inline
  implicit class SchemaDestinationTablePropertiesOps[Self <: SchemaDestinationTableProperties] (val x: Self) extends AnyVal {
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
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriendlyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
  }
  
}

