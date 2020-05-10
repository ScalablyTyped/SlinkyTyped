package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties about a dimension.
  */
@js.native
trait SchemaDimensionProperties extends js.Object {
  /**
    * The developer metadata associated with a single row or column.
    */
  var developerMetadata: js.UndefOr[js.Array[SchemaDeveloperMetadata]] = js.native
  /**
    * True if this dimension is being filtered. This field is read-only.
    */
  var hiddenByFilter: js.UndefOr[Boolean] = js.native
  /**
    * True if this dimension is explicitly hidden.
    */
  var hiddenByUser: js.UndefOr[Boolean] = js.native
  /**
    * The height (if a row) or width (if a column) of the dimension in pixels.
    */
  var pixelSize: js.UndefOr[Double] = js.native
}

object SchemaDimensionProperties {
  @scala.inline
  def apply(): SchemaDimensionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionProperties]
  }
  @scala.inline
  implicit class SchemaDimensionPropertiesOps[Self <: SchemaDimensionProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeveloperMetadata(value: js.Array[SchemaDeveloperMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenByFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenByFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenByFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenByFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenByUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenByUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenByUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenByUser")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelSize")(js.undefined)
        ret
    }
  }
  
}

