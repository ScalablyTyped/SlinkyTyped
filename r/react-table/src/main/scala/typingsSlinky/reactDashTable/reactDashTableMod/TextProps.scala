package typingsSlinky.reactDashTable.reactDashTableMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps extends js.Object {
  /** Default: 'Loading...' */
  var loadingText: TagMod[Any]
  /** Default: 'Next' */
  var nextText: TagMod[Any]
  /** Default: 'No rows found' */
  var noDataText: TagMod[Any] | ReactComponentClass[js.Object]
  /** Default: 'of' */
  var ofText: TagMod[Any]
  /** Default: 'Page' */
  var pageText: TagMod[Any]
  /** Default: 'Previous' */
  var previousText: TagMod[Any]
  /** Default: 'rows' */
  var rowsText: String
}

object TextProps {
  @scala.inline
  def apply(
    loadingText: TagMod[Any],
    nextText: TagMod[Any],
    noDataText: TagMod[Any] | ReactComponentClass[js.Object],
    ofText: TagMod[Any],
    pageText: TagMod[Any],
    previousText: TagMod[Any],
    rowsText: String
  ): TextProps = {
    val __obj = js.Dynamic.literal(loadingText = loadingText.asInstanceOf[js.Any], nextText = nextText.asInstanceOf[js.Any], noDataText = noDataText.asInstanceOf[js.Any], ofText = ofText.asInstanceOf[js.Any], pageText = pageText.asInstanceOf[js.Any], previousText = previousText.asInstanceOf[js.Any], rowsText = rowsText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextProps]
  }
}

