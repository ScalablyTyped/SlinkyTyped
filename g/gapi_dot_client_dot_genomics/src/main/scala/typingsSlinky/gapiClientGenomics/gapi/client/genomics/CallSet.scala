package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallSet extends js.Object {
  /** The date this call set was created in milliseconds from the epoch. */
  var created: js.UndefOr[String] = js.native
  /** The server-generated call set ID, unique across all call sets. */
  var id: js.UndefOr[String] = js.native
  /**
    * A map of additional call set information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.native
  /** The call set name. */
  var name: js.UndefOr[String] = js.native
  /** The sample ID this call set corresponds to. */
  var sampleId: js.UndefOr[String] = js.native
  /**
    * The IDs of the variant sets this call set belongs to. This field must
    * have exactly length one, as a call set belongs to a single variant set.
    * This field is repeated for compatibility with the
    * [GA4GH 0.5.1
    * API](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variants.avdl#L76).
    */
  var variantSetIds: js.UndefOr[js.Array[String]] = js.native
}

object CallSet {
  @scala.inline
  def apply(): CallSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallSet]
  }
  @scala.inline
  implicit class CallSetOps[Self <: CallSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: Record[String, js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleId")(js.undefined)
        ret
    }
    @scala.inline
    def withVariantSetIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantSetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariantSetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantSetIds")(js.undefined)
        ret
    }
  }
  
}

