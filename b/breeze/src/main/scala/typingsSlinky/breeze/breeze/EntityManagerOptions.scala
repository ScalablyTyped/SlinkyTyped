package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityManagerOptions extends js.Object {
  var dataService: js.UndefOr[DataService] = js.native
  var keyGeneratorCtor: js.UndefOr[js.Function] = js.native
  var metadataStore: js.UndefOr[MetadataStore] = js.native
  var queryOptions: js.UndefOr[QueryOptions] = js.native
  var saveOptions: js.UndefOr[SaveOptions] = js.native
  var serviceName: js.UndefOr[String] = js.native
  var validationOptions: js.UndefOr[ValidationOptions] = js.native
}

object EntityManagerOptions {
  @scala.inline
  def apply(): EntityManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityManagerOptions]
  }
  @scala.inline
  implicit class EntityManagerOptionsOps[Self <: EntityManagerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataService(value: DataService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataService")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyGeneratorCtor(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyGeneratorCtor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyGeneratorCtor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyGeneratorCtor")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataStore(value: MetadataStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadataStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataStore")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryOptions(value: QueryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveOptions(value: SaveOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationOptions(value: ValidationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationOptions")(js.undefined)
        ret
    }
  }
  
}

