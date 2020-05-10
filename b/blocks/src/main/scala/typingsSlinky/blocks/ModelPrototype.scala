package typingsSlinky.blocks

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPrototype
  extends /* propertyName */ StringDictionary[String | Boolean | js.Object | Validator] {
  /**
  	 * Extracts the raw(non observable) dataItem object values from the Model
  	 */
  var dataItem: js.UndefOr[js.Function0[js.Object]] = js.native
  /**
  	 * Override the init method to perform actions on creation for each Model instance
  	 */
  var init: js.UndefOr[js.Function] = js.native
  /**
  	 * Determines whether the instance is new. If true when syncing the item will send for insertion instead of updating it.
  	 * The check is determined by the idAttr value specified in the options. If idAttr is not specified the item will always be considered new.
  	 * 
  	 */
  var isNew: js.UndefOr[js.Function0[Boolean]] = js.native
  var options: js.UndefOr[AnonBaseUrl] = js.native
  /**
  	 * Applies new properties to the Model by providing an Object
  	 * 
  	 * @param dataItem The object from which the new values will be applied
  	 */
  var reset: js.UndefOr[js.Function1[/* dataItem */ this.type, this.type]] = js.native
  /**
  	 * Validates all observable properties that have validation and returns true if all values are valid otherwise returns false
  	 */
  var validate: js.UndefOr[js.Function0[Boolean]] = js.native
}

object ModelPrototype {
  @scala.inline
  def apply(): ModelPrototype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelPrototype]
  }
  @scala.inline
  implicit class ModelPrototypeOps[Self <: ModelPrototype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataItem(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDataItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataItem")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNew(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNew")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsNew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNew")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: AnonBaseUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: ModelPrototype => ModelPrototype): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

