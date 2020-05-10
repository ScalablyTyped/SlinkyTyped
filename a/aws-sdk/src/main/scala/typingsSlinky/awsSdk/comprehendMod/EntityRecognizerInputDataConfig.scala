package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityRecognizerInputDataConfig extends js.Object {
  /**
    * S3 location of the annotations file for an entity recognizer.
    */
  var Annotations: js.UndefOr[EntityRecognizerAnnotations] = js.native
  /**
    * S3 location of the documents folder for an entity recognizer
    */
  var Documents: EntityRecognizerDocuments = js.native
  /**
    * S3 location of the entity list for an entity recognizer.
    */
  var EntityList: js.UndefOr[EntityRecognizerEntityList] = js.native
  /**
    * The entity types in the input data for an entity recognizer. A maximum of 12 entity types can be used at one time to train an entity recognizer.
    */
  var EntityTypes: EntityTypesList = js.native
}

object EntityRecognizerInputDataConfig {
  @scala.inline
  def apply(Documents: EntityRecognizerDocuments, EntityTypes: EntityTypesList): EntityRecognizerInputDataConfig = {
    val __obj = js.Dynamic.literal(Documents = Documents.asInstanceOf[js.Any], EntityTypes = EntityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRecognizerInputDataConfig]
  }
  @scala.inline
  implicit class EntityRecognizerInputDataConfigOps[Self <: EntityRecognizerInputDataConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocuments(value: EntityRecognizerDocuments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Documents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityTypes(value: EntityTypesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotations(value: EntityRecognizerAnnotations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityList(value: EntityRecognizerEntityList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityList")(js.undefined)
        ret
    }
  }
  
}

