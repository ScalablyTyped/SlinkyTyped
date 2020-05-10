package typingsSlinky.googleapis.fusiontablesV1Mod.fusiontablesV1

import typingsSlinky.googleapis.AnonColors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a StyleFunction within a StyleSetting
  */
@js.native
trait SchemaStyleFunction extends js.Object {
  /**
    * Bucket function that assigns a style based on the range a column value
    * falls into.
    */
  var buckets: js.UndefOr[js.Array[SchemaBucket]] = js.native
  /**
    * Name of the column whose value is used in the style.
    */
  var columnName: js.UndefOr[String] = js.native
  /**
    * Gradient function that interpolates a range of colors based on column
    * value.
    */
  var gradient: js.UndefOr[AnonColors] = js.native
  /**
    * Stylers can be one of three kinds: &quot;fusiontables#fromColumn&quot; if
    * the column value is to be used as is, i.e., the column values can have
    * colors in #RRGGBBAA format or integer line widths or icon names;
    * &quot;fusiontables#gradient&quot; if the styling of the row is to be
    * based on applying the gradient function on the column value; or
    * &quot;fusiontables#buckets&quot; if the styling is to based on the bucket
    * into which the the column value falls.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaStyleFunction {
  @scala.inline
  def apply(): SchemaStyleFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStyleFunction]
  }
  @scala.inline
  implicit class SchemaStyleFunctionOps[Self <: SchemaStyleFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuckets(value: js.Array[SchemaBucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnName")(js.undefined)
        ret
    }
    @scala.inline
    def withGradient(value: AnonColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

