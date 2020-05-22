package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.EntityType.AutoExpansionMode
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.EntityType.IEntity
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.EntityType.Kind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an EntityType. */
trait IEntityType extends js.Object {
  /** EntityType autoExpansionMode */
  var autoExpansionMode: js.UndefOr[AutoExpansionMode | Null] = js.undefined
  /** EntityType displayName */
  var displayName: js.UndefOr[String | Null] = js.undefined
  /** EntityType enableFuzzyExtraction */
  var enableFuzzyExtraction: js.UndefOr[Boolean | Null] = js.undefined
  /** EntityType entities */
  var entities: js.UndefOr[js.Array[IEntity] | Null] = js.undefined
  /** EntityType kind */
  var kind: js.UndefOr[Kind | Null] = js.undefined
  /** EntityType name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IEntityType {
  @scala.inline
  def apply(
    autoExpansionMode: js.UndefOr[Null | AutoExpansionMode] = js.undefined,
    displayName: js.UndefOr[Null | String] = js.undefined,
    enableFuzzyExtraction: js.UndefOr[Null | Boolean] = js.undefined,
    entities: js.UndefOr[Null | js.Array[IEntity]] = js.undefined,
    kind: js.UndefOr[Null | Kind] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined
  ): IEntityType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoExpansionMode)) __obj.updateDynamic("autoExpansionMode")(autoExpansionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(displayName)) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFuzzyExtraction)) __obj.updateDynamic("enableFuzzyExtraction")(enableFuzzyExtraction.asInstanceOf[js.Any])
    if (!js.isUndefined(entities)) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (!js.isUndefined(kind)) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityType]
  }
}

