package typingsSlinky.parquetjs.fieldInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldInterface extends js.Object {
  var compression: js.UndefOr[String] = js.native
  var dLevelMax: Double = js.native
  var encoding: js.UndefOr[String] = js.native
  var fieldCount: js.UndefOr[Double] = js.native
  var fields: js.UndefOr[StringDictionary[FieldInterface]] = js.native
  var isNested: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  var originalType: js.UndefOr[String | Null] = js.native
  var path: js.Array[String] = js.native
  var primitiveType: js.UndefOr[String | Null] = js.native
  var rLevelMax: Double = js.native
  var repetitionType: String = js.native
  var typeLength: js.UndefOr[Double | Null] = js.native
}

object FieldInterface {
  @scala.inline
  def apply(dLevelMax: Double, name: String, path: js.Array[String], rLevelMax: Double, repetitionType: String): FieldInterface = {
    val __obj = js.Dynamic.literal(dLevelMax = dLevelMax.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rLevelMax = rLevelMax.asInstanceOf[js.Any], repetitionType = repetitionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInterface]
  }
  @scala.inline
  implicit class FieldInterfaceOps[Self <: FieldInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDLevelMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dLevelMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRLevelMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rLevelMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepetitionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repetitionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: StringDictionary[FieldInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNested")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalType")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalType")(null)
        ret
    }
    @scala.inline
    def withPrimitiveType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primitiveType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimitiveType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primitiveType")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimitiveTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primitiveType")(null)
        ret
    }
    @scala.inline
    def withTypeLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeLength")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeLengthNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeLength")(null)
        ret
    }
  }
  
}

