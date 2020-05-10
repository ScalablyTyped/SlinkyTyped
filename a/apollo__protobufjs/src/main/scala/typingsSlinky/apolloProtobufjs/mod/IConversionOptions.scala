package typingsSlinky.apolloProtobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConversionOptions extends js.Object {
  /** Sets empty arrays for missing repeated fields even if `defaults=false` */
  var arrays: js.UndefOr[Boolean] = js.native
  /**
    * Bytes value conversion type.
    * Valid values are `Array` and (a base64 encoded) `String` (the global types).
    * Defaults to copy the present value, which usually is a Buffer under node and an Uint8Array in the browser.
    */
  var bytes: js.UndefOr[js.Function] = js.native
  /** Also sets default values on the resulting object */
  var defaults: js.UndefOr[Boolean] = js.native
  /**
    * Enum value conversion type.
    * Only valid value is `String` (the global type).
    * Defaults to copy the present value, which is the numeric id.
    */
  var enums: js.UndefOr[js.Function] = js.native
  /** Performs additional JSON compatibility conversions, i.e. NaN and Infinity to strings */
  var json: js.UndefOr[Boolean] = js.native
  /**
    * Long conversion type.
    * Valid values are `String` and `Number` (the global types).
    * Defaults to copy the present value, which is a possibly unsafe number without and a {@link Long} with a long library.
    */
  var longs: js.UndefOr[js.Function] = js.native
  /** Sets empty objects for missing map fields even if `defaults=false` */
  var objects: js.UndefOr[Boolean] = js.native
  /** Includes virtual oneof properties set to the present field's name, if any */
  var oneofs: js.UndefOr[Boolean] = js.native
}

object IConversionOptions {
  @scala.inline
  def apply(): IConversionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConversionOptions]
  }
  @scala.inline
  implicit class IConversionOptionsOps[Self <: IConversionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrays")(js.undefined)
        ret
    }
    @scala.inline
    def withBytes(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withEnums(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnums: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enums")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def withLongs(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longs")(js.undefined)
        ret
    }
    @scala.inline
    def withObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(js.undefined)
        ret
    }
    @scala.inline
    def withOneofs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneofs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneofs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneofs")(js.undefined)
        ret
    }
  }
  
}

