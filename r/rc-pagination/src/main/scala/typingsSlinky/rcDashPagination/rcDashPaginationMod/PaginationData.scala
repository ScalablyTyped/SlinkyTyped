package typingsSlinky.rcDashPagination.rcDashPaginationMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationData extends js.Object {
  var className: String
  var current: Double
  var defaultCurrent: Double
  var defaultPageSize: Double
  var hideOnSinglePage: Boolean
  var jumpNextIcon: ReactComponentClass[js.Object] | TagMod[Any]
  var jumpPrevIcon: ReactComponentClass[js.Object] | TagMod[Any]
  var locale: js.Object
  var nextIcon: ReactComponentClass[js.Object] | TagMod[Any]
  var pageSize: Double
  var pageSizeOptions: js.Array[String]
  var prefixCls: String
  var prevIcon: ReactComponentClass[js.Object] | TagMod[Any]
  var selectComponentClass: ReactComponentClass[js.Object]
  var selectPrefixCls: String
  var showLessItems: Boolean
  var showPrevNextJumpers: Boolean
  var showQuickJumper: Boolean | js.Object
  var showSizeChanger: Boolean
  var showTitle: Boolean
  var style: CSSProperties
  var total: Double
}

object PaginationData {
  @scala.inline
  def apply(
    className: String,
    current: Double,
    defaultCurrent: Double,
    defaultPageSize: Double,
    hideOnSinglePage: Boolean,
    jumpNextIcon: ReactComponentClass[js.Object] | TagMod[Any],
    jumpPrevIcon: ReactComponentClass[js.Object] | TagMod[Any],
    locale: js.Object,
    nextIcon: ReactComponentClass[js.Object] | TagMod[Any],
    pageSize: Double,
    pageSizeOptions: js.Array[String],
    prefixCls: String,
    prevIcon: ReactComponentClass[js.Object] | TagMod[Any],
    selectComponentClass: ReactComponentClass[js.Object],
    selectPrefixCls: String,
    showLessItems: Boolean,
    showPrevNextJumpers: Boolean,
    showQuickJumper: Boolean | js.Object,
    showSizeChanger: Boolean,
    showTitle: Boolean,
    style: CSSProperties,
    total: Double
  ): PaginationData = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], defaultCurrent = defaultCurrent.asInstanceOf[js.Any], defaultPageSize = defaultPageSize.asInstanceOf[js.Any], hideOnSinglePage = hideOnSinglePage.asInstanceOf[js.Any], jumpNextIcon = jumpNextIcon.asInstanceOf[js.Any], jumpPrevIcon = jumpPrevIcon.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], nextIcon = nextIcon.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pageSizeOptions = pageSizeOptions.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], prevIcon = prevIcon.asInstanceOf[js.Any], selectComponentClass = selectComponentClass.asInstanceOf[js.Any], selectPrefixCls = selectPrefixCls.asInstanceOf[js.Any], showLessItems = showLessItems.asInstanceOf[js.Any], showPrevNextJumpers = showPrevNextJumpers.asInstanceOf[js.Any], showQuickJumper = showQuickJumper.asInstanceOf[js.Any], showSizeChanger = showSizeChanger.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaginationData]
  }
}

