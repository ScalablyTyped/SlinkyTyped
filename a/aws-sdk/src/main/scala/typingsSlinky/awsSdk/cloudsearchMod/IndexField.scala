package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexField extends js.Object {
  var DateArrayOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.DateArrayOptions] = js.native
  var DateOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.DateOptions] = js.native
  var DoubleArrayOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.DoubleArrayOptions] = js.native
  var DoubleOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.DoubleOptions] = js.native
  /**
    * A string that represents the name of an index field. CloudSearch supports regular index fields as well as dynamic fields. A dynamic field's name defines a pattern that begins or ends with a wildcard. Any document fields that don't map to a regular index field but do match a dynamic field's pattern are configured with the dynamic field's indexing options.  Regular field names begin with a letter and can contain the following characters: a-z (lowercase), 0-9, and _ (underscore). Dynamic field names must begin or end with a wildcard (*). The wildcard can also be the only character in a dynamic field name. Multiple wildcards, and wildcards embedded within a string are not supported.  The name score is reserved and cannot be used as a field name. To reference a document's ID, you can use the name _id. 
    */
  var IndexFieldName: DynamicFieldName = js.native
  var IndexFieldType: typingsSlinky.awsSdk.cloudsearchMod.IndexFieldType = js.native
  var IntArrayOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.IntArrayOptions] = js.native
  var IntOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.IntOptions] = js.native
  var LatLonOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.LatLonOptions] = js.native
  var LiteralArrayOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.LiteralArrayOptions] = js.native
  var LiteralOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.LiteralOptions] = js.native
  var TextArrayOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.TextArrayOptions] = js.native
  var TextOptions: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.TextOptions] = js.native
}

object IndexField {
  @scala.inline
  def apply(IndexFieldName: DynamicFieldName, IndexFieldType: IndexFieldType): IndexField = {
    val __obj = js.Dynamic.literal(IndexFieldName = IndexFieldName.asInstanceOf[js.Any], IndexFieldType = IndexFieldType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexField]
  }
  @scala.inline
  implicit class IndexFieldOps[Self <: IndexField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexFieldName(value: DynamicFieldName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexFieldType(value: IndexFieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexFieldType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateArrayOptions(value: DateArrayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateArrayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateArrayOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateArrayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDateOptions(value: DateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleArrayOptions(value: DoubleArrayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoubleArrayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleArrayOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoubleArrayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleOptions(value: DoubleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoubleOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoubleOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIntArrayOptions(value: IntArrayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntArrayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntArrayOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntArrayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIntOptions(value: IntOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLatLonOptions(value: LatLonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatLonOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatLonOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatLonOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLiteralArrayOptions(value: LiteralArrayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LiteralArrayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiteralArrayOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LiteralArrayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLiteralOptions(value: LiteralOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LiteralOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiteralOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LiteralOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTextArrayOptions(value: TextArrayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextArrayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextArrayOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextArrayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOptions(value: TextOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextOptions")(js.undefined)
        ret
    }
  }
  
}

