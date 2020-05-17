package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSchema extends js.Object {
  /**
  	 * A list of field definitions specifying the schema of the data source.
  	 * Field objects description: {fieldName, [fieldDataType], [fieldXPath]}
  	 */
  def fields(): js.Array[_] = js.native
  /**
  	 * Specifies if the object is null, undefined, or an empty string
  	 *
  	 * @param o the object to check for being empty
  	 */
  def isEmpty(o: js.Object): js.Object = js.native
  /**
  	 * Specifies if the object has custom properties or not
  	 *
  	 * @param obj the object to check for presence or lack of custom properties
  	 */
  def isObjEmpty(obj: js.Object): js.Object = js.native
  /**
  	 * Performs a transformation on the schema so that the resulting data matches the schema
  	 *
  	 * @param data the data to transform
  	 */
  def transform(data: js.Object): js.Object = js.native
}

object DataSchema {
  @scala.inline
  def apply(
    fields: () => js.Array[_],
    isEmpty: js.Object => js.Object,
    isObjEmpty: js.Object => js.Object,
    transform: js.Object => js.Object
  ): DataSchema = {
    val __obj = js.Dynamic.literal(fields = js.Any.fromFunction0(fields), isEmpty = js.Any.fromFunction1(isEmpty), isObjEmpty = js.Any.fromFunction1(isObjEmpty), transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[DataSchema]
  }
  @scala.inline
  implicit class DataSchemaOps[Self <: DataSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsObjEmpty(value: js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isObjEmpty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransform(value: js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

