package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A transformation to apply to text that is identified as a specific
  * info_type.
  */
@js.native
trait SchemaInfoTypeTransformation extends js.Object {
  /**
    * Config for character mask.
    */
  var characterMaskConfig: js.UndefOr[SchemaCharacterMaskConfig] = js.native
  /**
    * Config for crypto hash.
    */
  var cryptoHashConfig: js.UndefOr[SchemaCryptoHashConfig] = js.native
  /**
    * Config for date shift.
    */
  var dateShiftConfig: js.UndefOr[SchemaDateShiftConfig] = js.native
  /**
    * InfoTypes to apply this transformation to. If this is not specified, the
    * transformation applies to any info_type.
    */
  var infoTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Config for text redaction.
    */
  var redactConfig: js.UndefOr[SchemaRedactConfig] = js.native
  /**
    * Config for replace with InfoType.
    */
  var replaceWithInfoTypeConfig: js.UndefOr[SchemaReplaceWithInfoTypeConfig] = js.native
}

object SchemaInfoTypeTransformation {
  @scala.inline
  def apply(): SchemaInfoTypeTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInfoTypeTransformation]
  }
  @scala.inline
  implicit class SchemaInfoTypeTransformationOps[Self <: SchemaInfoTypeTransformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacterMaskConfig(value: SchemaCharacterMaskConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterMaskConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacterMaskConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterMaskConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withCryptoHashConfig(value: SchemaCryptoHashConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoHashConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCryptoHashConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoHashConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDateShiftConfig(value: SchemaDateShiftConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateShiftConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateShiftConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateShiftConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withRedactConfig(value: SchemaRedactConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redactConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedactConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redactConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceWithInfoTypeConfig(value: SchemaReplaceWithInfoTypeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWithInfoTypeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceWithInfoTypeConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWithInfoTypeConfig")(js.undefined)
        ret
    }
  }
  
}

