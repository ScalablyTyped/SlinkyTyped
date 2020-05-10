package typingsSlinky.lowdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdapterOptions[SchemaT] extends js.Object {
  var defaultValue: js.UndefOr[SchemaT] = js.native
  var deserialize: js.UndefOr[js.Function1[/* serializedData */ String, SchemaT]] = js.native
  var serialize: js.UndefOr[js.Function1[/* data */ SchemaT, String]] = js.native
}

object AdapterOptions {
  @scala.inline
  def apply[SchemaT](): AdapterOptions[SchemaT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdapterOptions[SchemaT]]
  }
  @scala.inline
  implicit class AdapterOptionsOps[Self[schemat] <: AdapterOptions[schemat], SchemaT] (val x: Self[SchemaT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[SchemaT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[SchemaT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[SchemaT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[SchemaT] with Other]
    @scala.inline
    def withDefaultValue(value: SchemaT): Self[SchemaT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[SchemaT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDeserialize(value: /* serializedData */ String => SchemaT): Self[SchemaT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeserialize: Self[SchemaT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialize(value: /* data */ SchemaT => String): Self[SchemaT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSerialize: Self[SchemaT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.undefined)
        ret
    }
  }
  
}

