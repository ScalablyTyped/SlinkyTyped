package typingsSlinky.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionOptions extends OptionsBase {
              // a map of dot-deliminated paths; for example 'models.owner': kb.ViewModel to either constructors or create functions. Signature: 'some.path': function(object, options)
  var comparator: js.UndefOr[js.Any] = js.native
             // (Constructor) — the view model constructor used for models in the collection. Signature: constructor(model, options)
  var create: js.UndefOr[js.Any] = js.native
                 // a function used to create a view model for models in the collection. Signature: create(model, options)
  var factories: js.UndefOr[js.Any] = js.native
      // the name of an attribute. Default: resort on all changes to a model.
  var filters: js.UndefOr[js.Any] = js.native
  var models_only: js.UndefOr[Boolean] = js.native
             //a function that is used to sort an object. Signature: function(model_a, model_b) returns negative value for ascending, 0 for equal, and positive for descending
  var sort_attribute: js.UndefOr[String] = js.native
           // flag for skipping the creation of view models. The collection observable will be populated with (possibly sorted) models.
  var view_model: js.UndefOr[js.Any] = js.native
}

object CollectionOptions {
  @scala.inline
  def apply(): CollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionOptions]
  }
  @scala.inline
  implicit class CollectionOptionsOps[Self <: CollectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparator(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withFactories(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factories")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withModels_only(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models_only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModels_only: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models_only")(js.undefined)
        ret
    }
    @scala.inline
    def withSort_attribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort_attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort_attribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort_attribute")(js.undefined)
        ret
    }
    @scala.inline
    def withView_model(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView_model: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_model")(js.undefined)
        ret
    }
  }
  
}

