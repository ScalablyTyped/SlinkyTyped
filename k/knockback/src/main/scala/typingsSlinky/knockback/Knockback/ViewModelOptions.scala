package typingsSlinky.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewModelOptions extends OptionsBase {
                // the path to the value (used to create related observables from the factory).
  var factories: js.UndefOr[js.Any] = js.native
  var internals: js.UndefOr[js.Array[String]] = js.native
          // an array of atttributes that will have kb.Observables created even if they do not exist on the Backbone.Model. Useful for binding Views that require specific observables to exist
  var keys: js.UndefOr[js.Array[String]] = js.native
         // an array of atttributes that should be scoped with an underscore, eg. name -> _name
  var requires: js.UndefOr[js.Array[String]] = js.native
              // restricts the keys used on a model. Useful for reducing the number of kb.Observables created from a limited set of Backbone.Model attributes
  def `if`(objOrArray: js.Any): js.Any = js.native
}

object ViewModelOptions {
  @scala.inline
  def apply(`if`: js.Any => js.Any): ViewModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("if")(js.Any.fromFunction1(`if`))
    __obj.asInstanceOf[ViewModelOptions]
  }
  @scala.inline
  implicit class ViewModelOptionsOps[Self <: ViewModelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIf(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("if")(js.Any.fromFunction1(value))
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
    def withInternals(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internals")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withRequires(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requires")(js.undefined)
        ret
    }
  }
  
}

