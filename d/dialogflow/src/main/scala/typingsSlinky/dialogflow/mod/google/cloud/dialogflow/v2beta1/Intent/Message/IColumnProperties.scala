package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.ColumnProperties.HorizontalAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ColumnProperties. */
trait IColumnProperties extends js.Object {
  /** ColumnProperties header */
  var header: js.UndefOr[String | Null] = js.undefined
  /** ColumnProperties horizontalAlignment */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | Null] = js.undefined
}

object IColumnProperties {
  @scala.inline
  def apply(
    header: js.UndefOr[Null | String] = js.undefined,
    horizontalAlignment: js.UndefOr[Null | HorizontalAlignment] = js.undefined
  ): IColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalAlignment)) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnProperties]
  }
}

