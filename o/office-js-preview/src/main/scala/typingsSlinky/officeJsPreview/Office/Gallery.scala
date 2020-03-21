package typingsSlinky.officeJsPreview.Office

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a gallery that displays a collection of related items or controls in the ribbon.
  */
trait Gallery extends Control {
  /**
    * Used to refresh the gallery control including optional data to be passed to the gallery control at the time of refresh action.
    */
  var refreshData: js.UndefOr[StringDictionary[String | Null]] = js.undefined
}

object Gallery {
  @scala.inline
  def apply(
    id: String,
    enabled: js.UndefOr[Boolean] = js.undefined,
    refreshData: StringDictionary[String | Null] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Gallery = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (refreshData != null) __obj.updateDynamic("refreshData")(refreshData.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gallery]
  }
}

