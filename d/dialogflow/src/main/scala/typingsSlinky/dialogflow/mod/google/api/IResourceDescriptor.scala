package typingsSlinky.dialogflow.mod.google.api

import typingsSlinky.dialogflow.mod.google.api.ResourceDescriptor.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ResourceDescriptor. */
trait IResourceDescriptor extends js.Object {
  /** ResourceDescriptor history */
  var history: js.UndefOr[History | Null] = js.undefined
  /** ResourceDescriptor nameField */
  var nameField: js.UndefOr[String | Null] = js.undefined
  /** ResourceDescriptor pattern */
  var pattern: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** ResourceDescriptor type */
  var `type`: js.UndefOr[String | Null] = js.undefined
}

object IResourceDescriptor {
  @scala.inline
  def apply(
    history: js.UndefOr[Null | History] = js.undefined,
    nameField: js.UndefOr[Null | String] = js.undefined,
    pattern: js.UndefOr[Null | js.Array[String]] = js.undefined,
    `type`: js.UndefOr[Null | String] = js.undefined
  ): IResourceDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (!js.isUndefined(nameField)) __obj.updateDynamic("nameField")(nameField.asInstanceOf[js.Any])
    if (!js.isUndefined(pattern)) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceDescriptor]
  }
}

