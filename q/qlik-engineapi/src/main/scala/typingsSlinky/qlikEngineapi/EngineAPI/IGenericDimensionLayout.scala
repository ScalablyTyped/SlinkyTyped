package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is the layout for GenericDimensionProperties.
  */
@js.native
trait IGenericDimensionLayout extends IGenericBaseLayout {
  /**
    * Identifier and type of the dimension.
    */
  var qDim: INxLibraryDimensionDef = js.native
  /**
    * Cardinal and tags related to the dimension.
    * Length of the longest value in the field.
    */
  var qDimInfos: js.Array[IGenericDimensionInfo] = js.native
  /*add new member */
  /**
    * Information about publishing and permissions.
    */
  @JSName("qMeta")
  var qMeta_IGenericDimensionLayout: INxMetaTitleDescriptionTag = js.native
}

object IGenericDimensionLayout {
  @scala.inline
  def apply(
    qDim: INxLibraryDimensionDef,
    qDimInfos: js.Array[IGenericDimensionInfo],
    qInfo: INxInfo,
    qMeta: INxMetaTitleDescriptionTag
  ): IGenericDimensionLayout = {
    val __obj = js.Dynamic.literal(qDim = qDim.asInstanceOf[js.Any], qDimInfos = qDimInfos.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericDimensionLayout]
  }
  @scala.inline
  implicit class IGenericDimensionLayoutOps[Self <: IGenericDimensionLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDim(value: INxLibraryDimensionDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDimInfos(value: js.Array[IGenericDimensionInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDimInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMeta(value: INxMetaTitleDescriptionTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMeta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

