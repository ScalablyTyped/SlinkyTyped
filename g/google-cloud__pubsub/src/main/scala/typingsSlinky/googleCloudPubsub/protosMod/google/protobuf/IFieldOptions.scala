package typingsSlinky.googleCloudPubsub.protosMod.google.protobuf

import typingsSlinky.googleCloudPubsub.protosMod.google.api.FieldBehavior
import typingsSlinky.googleCloudPubsub.protosMod.google.api.IResourceReference
import typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FieldOptions.CType
import typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.FieldOptions.JSType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FieldOptions. */
@js.native
trait IFieldOptions extends js.Object {
  /** FieldOptions .google.api.fieldBehavior */
  @JSName(".google.api.fieldBehavior")
  var DotgoogleDotapiDotfieldBehavior: js.UndefOr[js.Array[FieldBehavior] | Null] = js.native
  /** FieldOptions .google.api.resourceReference */
  @JSName(".google.api.resourceReference")
  var DotgoogleDotapiDotresourceReference: js.UndefOr[IResourceReference | Null] = js.native
  /** FieldOptions ctype */
  var ctype: js.UndefOr[
    CType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldOptions.CType * / any */ String) | Null
  ] = js.native
  /** FieldOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.native
  /** FieldOptions jstype */
  var jstype: js.UndefOr[
    JSType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldOptions.JSType * / any */ String) | Null
  ] = js.native
  /** FieldOptions lazy */
  var `lazy`: js.UndefOr[Boolean | Null] = js.native
  /** FieldOptions packed */
  var packed: js.UndefOr[Boolean | Null] = js.native
  /** FieldOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.native
  /** FieldOptions weak */
  var weak: js.UndefOr[Boolean | Null] = js.native
}

object IFieldOptions {
  @scala.inline
  def apply(): IFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldOptions]
  }
  @scala.inline
  implicit class IFieldOptionsOps[Self <: IFieldOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDotgoogleDotapiDotfieldBehavior(value: js.Array[FieldBehavior]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.api.fieldBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotgoogleDotapiDotfieldBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.api.fieldBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withDotgoogleDotapiDotfieldBehaviorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.api.fieldBehavior")(null)
        ret
    }
    @scala.inline
    def withDotgoogleDotapiDotresourceReference(value: IResourceReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.api.resourceReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotgoogleDotapiDotresourceReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.api.resourceReference")(js.undefined)
        ret
    }
    @scala.inline
    def withDotgoogleDotapiDotresourceReferenceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.api.resourceReference")(null)
        ret
    }
    @scala.inline
    def withCtype(
      value: CType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldOptions.CType * / any */ String)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctype")(js.undefined)
        ret
    }
    @scala.inline
    def withCtypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctype")(null)
        ret
    }
    @scala.inline
    def withDeprecated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecatedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(null)
        ret
    }
    @scala.inline
    def withJstype(
      value: JSType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldOptions.JSType * / any */ String)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jstype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJstype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jstype")(js.undefined)
        ret
    }
    @scala.inline
    def withJstypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jstype")(null)
        ret
    }
    @scala.inline
    def withLazy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(null)
        ret
    }
    @scala.inline
    def withPacked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPacked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packed")(js.undefined)
        ret
    }
    @scala.inline
    def withPackedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packed")(null)
        ret
    }
    @scala.inline
    def withUninterpretedOption(value: js.Array[IUninterpretedOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUninterpretedOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOption")(js.undefined)
        ret
    }
    @scala.inline
    def withUninterpretedOptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOption")(null)
        ret
    }
    @scala.inline
    def withWeak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weak")(js.undefined)
        ret
    }
    @scala.inline
    def withWeakNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weak")(null)
        ret
    }
  }
  
}

