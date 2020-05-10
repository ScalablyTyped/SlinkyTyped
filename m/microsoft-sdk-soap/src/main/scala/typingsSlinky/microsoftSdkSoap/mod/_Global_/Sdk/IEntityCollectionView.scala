package typingsSlinky.microsoftSdkSoap.mod._Global_.Sdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEntityCollectionView extends js.Object {
  var entities: js.Array[IEntityView] = js.native
  var entityName: java.lang.String = js.native
  var minActiveRowVersion: java.lang.String = js.native
  var moreRecords: scala.Boolean = js.native
  var pagingCookie: java.lang.String = js.native
  var totalRecordCount: scala.Double = js.native
  var totalRecordCountLimitExceeded: scala.Boolean = js.native
}

object IEntityCollectionView {
  @scala.inline
  def apply(
    entities: js.Array[IEntityView],
    entityName: java.lang.String,
    minActiveRowVersion: java.lang.String,
    moreRecords: scala.Boolean,
    pagingCookie: java.lang.String,
    totalRecordCount: scala.Double,
    totalRecordCountLimitExceeded: scala.Boolean
  ): IEntityCollectionView = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], entityName = entityName.asInstanceOf[js.Any], minActiveRowVersion = minActiveRowVersion.asInstanceOf[js.Any], moreRecords = moreRecords.asInstanceOf[js.Any], pagingCookie = pagingCookie.asInstanceOf[js.Any], totalRecordCount = totalRecordCount.asInstanceOf[js.Any], totalRecordCountLimitExceeded = totalRecordCountLimitExceeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityCollectionView]
  }
  @scala.inline
  implicit class IEntityCollectionViewOps[Self <: IEntityCollectionView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntities(value: js.Array[IEntityView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinActiveRowVersion(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minActiveRowVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoreRecords(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagingCookie(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingCookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalRecordCount(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRecordCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalRecordCountLimitExceeded(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRecordCountLimitExceeded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

