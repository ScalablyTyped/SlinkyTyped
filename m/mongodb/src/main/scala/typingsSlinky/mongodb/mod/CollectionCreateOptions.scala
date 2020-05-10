package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.mongodbStrings.error
import typingsSlinky.mongodb.mongodbStrings.moderate
import typingsSlinky.mongodb.mongodbStrings.off
import typingsSlinky.mongodb.mongodbStrings.strict
import typingsSlinky.mongodb.mongodbStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionCreateOptions extends CommonOptions {
  var autoIndexId: js.UndefOr[Boolean] = js.native
  var capped: js.UndefOr[Boolean] = js.native
  var collation: js.UndefOr[CollationDocument] = js.native
  var flags: js.UndefOr[scala.Double] = js.native
  var indexOptionDefaults: js.UndefOr[js.Object] = js.native
  var max: js.UndefOr[scala.Double] = js.native
  var pipeline: js.UndefOr[js.Array[_]] = js.native
  var pkFactory: js.UndefOr[js.Object] = js.native
  var raw: js.UndefOr[Boolean] = js.native
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  var serializeFunctions: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[scala.Double] = js.native
  var storageEngine: js.UndefOr[js.Object] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var validationAction: js.UndefOr[error | warn] = js.native
  var validationLevel: js.UndefOr[off | strict | moderate] = js.native
  var validator: js.UndefOr[js.Object] = js.native
  var viewOn: js.UndefOr[String] = js.native
}

object CollectionCreateOptions {
  @scala.inline
  def apply(): CollectionCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionCreateOptions]
  }
  @scala.inline
  implicit class CollectionCreateOptionsOps[Self <: CollectionCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoIndexId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndexId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoIndexId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIndexId")(js.undefined)
        ret
    }
    @scala.inline
    def withCapped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capped")(js.undefined)
        ret
    }
    @scala.inline
    def withCollation(value: CollationDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(js.undefined)
        ret
    }
    @scala.inline
    def withFlags(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexOptionDefaults(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOptionDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexOptionDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOptionDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withPipeline(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeline")(js.undefined)
        ret
    }
    @scala.inline
    def withPkFactory(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPkFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withReadPreference(value: ReadPreferenceOrMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializeFunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializeFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeFunctions")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageEngine(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageEngine")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationAction(value: error | warn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationAction")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationLevel(value: off | strict | moderate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withValidator(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.undefined)
        ret
    }
    @scala.inline
    def withViewOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewOn")(js.undefined)
        ret
    }
  }
  
}

