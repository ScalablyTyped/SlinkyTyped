package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPlanRequest extends js.Object {
  /**
    * The programming language of the code to perform the mapping.
    */
  var Language: js.UndefOr[typingsSlinky.awsSdk.glueMod.Language] = js.native
  /**
    * The parameters for the mapping.
    */
  var Location: js.UndefOr[typingsSlinky.awsSdk.glueMod.Location] = js.native
  /**
    * The list of mappings from a source table to target tables.
    */
  var Mapping: MappingList = js.native
  /**
    * The target tables.
    */
  var Sinks: js.UndefOr[CatalogEntries] = js.native
  /**
    * The source table.
    */
  var Source: CatalogEntry = js.native
}

object GetPlanRequest {
  @scala.inline
  def apply(Mapping: MappingList, Source: CatalogEntry): GetPlanRequest = {
    val __obj = js.Dynamic.literal(Mapping = Mapping.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlanRequest]
  }
  @scala.inline
  implicit class GetPlanRequestOps[Self <: GetPlanRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMapping(value: MappingList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: CatalogEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: Language): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(js.undefined)
        ret
    }
    @scala.inline
    def withSinks(value: CatalogEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sinks")(js.undefined)
        ret
    }
  }
  
}

