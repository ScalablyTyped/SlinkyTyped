package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.AutoExpansionMode
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.IEntity
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityType.Kind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an EntityType. */
@js.native
trait IEntityType extends js.Object {
  /** EntityType autoExpansionMode */
  var autoExpansionMode: js.UndefOr[AutoExpansionMode | Null] = js.native
  /** EntityType displayName */
  var displayName: js.UndefOr[String | Null] = js.native
  /** EntityType enableFuzzyExtraction */
  var enableFuzzyExtraction: js.UndefOr[Boolean | Null] = js.native
  /** EntityType entities */
  var entities: js.UndefOr[js.Array[IEntity] | Null] = js.native
  /** EntityType kind */
  var kind: js.UndefOr[Kind | Null] = js.native
  /** EntityType name */
  var name: js.UndefOr[String | Null] = js.native
}

object IEntityType {
  @scala.inline
  def apply(): IEntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEntityType]
  }
  @scala.inline
  implicit class IEntityTypeOps[Self <: IEntityType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoExpansionMode(value: AutoExpansionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpansionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoExpansionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpansionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoExpansionModeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpansionMode")(null)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(null)
        ret
    }
    @scala.inline
    def withEnableFuzzyExtraction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFuzzyExtraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFuzzyExtraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFuzzyExtraction")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFuzzyExtractionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFuzzyExtraction")(null)
        ret
    }
    @scala.inline
    def withEntities(value: js.Array[IEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(js.undefined)
        ret
    }
    @scala.inline
    def withEntitiesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(null)
        ret
    }
    @scala.inline
    def withKind(value: Kind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withKindNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
  }
  
}

