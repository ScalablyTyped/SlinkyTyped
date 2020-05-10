package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericDimensionInfo...
  */
@js.native
trait IGenericDimensionInfo extends js.Object {
  /**
    * If set to true a logical AND (instead of a logical OR) is used when making selections in a field.
    * The default value is false.
    */
  var qAndMode: Boolean = js.native
  /**
    * Length of the longest value in the field.
    */
  var qApprMaxGlyphCount: Double = js.native
  /**
    * Number of distinct field values
    */
  var qCardinal: Double = js.native
  /**
    * If set to true, it means that the field is a semantic.
    */
  var qIsSemantic: Boolean = js.native
  /**
    * Gives information on a field. For example, it can return the type of the field.
    * Examples: key, text, ASCII
    */
  var qTags: js.Array[String] = js.native
}

object IGenericDimensionInfo {
  @scala.inline
  def apply(
    qAndMode: Boolean,
    qApprMaxGlyphCount: Double,
    qCardinal: Double,
    qIsSemantic: Boolean,
    qTags: js.Array[String]
  ): IGenericDimensionInfo = {
    val __obj = js.Dynamic.literal(qAndMode = qAndMode.asInstanceOf[js.Any], qApprMaxGlyphCount = qApprMaxGlyphCount.asInstanceOf[js.Any], qCardinal = qCardinal.asInstanceOf[js.Any], qIsSemantic = qIsSemantic.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericDimensionInfo]
  }
  @scala.inline
  implicit class IGenericDimensionInfoOps[Self <: IGenericDimensionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQAndMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAndMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQApprMaxGlyphCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qApprMaxGlyphCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQCardinal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCardinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIsSemantic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsSemantic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

