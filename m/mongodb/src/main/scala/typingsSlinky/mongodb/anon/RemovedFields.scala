package typingsSlinky.mongodb.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mongodb.mod.FieldUpdates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovedFields[TSchema /* <: StringDictionary[js.Any] */] extends js.Object {
  var removedFields: js.Array[/* keyof TSchema */ String] = js.native
  /**
    * This is an object with all changed fields; if they are nested,
    * the keys will be paths, e.g. 'question.answer.0.text': 'new text'
    */
  var updatedFields: FieldUpdates[TSchema] = js.native
}

object RemovedFields {
  @scala.inline
  def apply[TSchema](removedFields: js.Array[/* keyof TSchema */ String], updatedFields: FieldUpdates[TSchema]): RemovedFields[TSchema] = {
    val __obj = js.Dynamic.literal(removedFields = removedFields.asInstanceOf[js.Any], updatedFields = updatedFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovedFields[TSchema]]
  }
  @scala.inline
  implicit class RemovedFieldsOps[Self[tschema] <: RemovedFields[tschema], TSchema] (val x: Self[TSchema]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSchema] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSchema]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSchema] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSchema] with Other]
    @scala.inline
    def withRemovedFields(value: js.Array[/* keyof TSchema */ String]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedFields(value: FieldUpdates[TSchema]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedFields")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

