package typingsSlinky.keystonejsKeystone.mod

import typingsSlinky.keystonejsFields.mod.FieldType
import typingsSlinky.keystonejsKeystone.AnonResolvedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.keystonejsKeystone.mod.AllFieldsOptions because Already inherited */ @js.native
trait SlugOptions[FieldNames /* <: String */] extends BaseFieldOptions {
  var from: String = js.native
  // TODO: resolved data is of the same type as the current object list. Investigate if we can at least provide the available keys via a generic.
  def generate(opts: AnonResolvedData[FieldNames]): String = js.native
}

object SlugOptions {
  @scala.inline
  def apply[FieldNames](from: String, generate: AnonResolvedData[FieldNames] => String, `type`: FieldType): SlugOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], generate = js.Any.fromFunction1(generate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlugOptions[FieldNames]]
  }
  @scala.inline
  implicit class SlugOptionsOps[Self[fieldnames] <: SlugOptions[fieldnames], FieldNames] (val x: Self[FieldNames]) extends AnyVal {
    @scala.inline
    def duplicate: Self[FieldNames] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[FieldNames]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[FieldNames] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[FieldNames] with Other]
    @scala.inline
    def withFrom(value: String): Self[FieldNames] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerate(value: AnonResolvedData[FieldNames] => String): Self[FieldNames] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

