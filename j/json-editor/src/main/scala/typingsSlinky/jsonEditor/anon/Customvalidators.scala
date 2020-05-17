package typingsSlinky.jsonEditor.anon

import typingsSlinky.jsonEditor.JSONEditorError
import typingsSlinky.jsonEditor.JSONEditorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Customvalidators extends js.Object {
  var custom_validators: js.Array[
    js.Function3[/* schema */ _, /* value */ String, /* path */ String, js.Array[JSONEditorError]]
  ] = js.native
  var editors: Array = js.native
  var language: String = js.native
  var languages: js.Any = js.native
  var options: JSONEditorOptions[_] = js.native
  var resolvers: js.Array[js.Function1[/* schema */ _, String]] = js.native
}

object Customvalidators {
  @scala.inline
  def apply(
    custom_validators: js.Array[
      js.Function3[/* schema */ _, /* value */ String, /* path */ String, js.Array[JSONEditorError]]
    ],
    editors: Array,
    language: String,
    languages: js.Any,
    options: JSONEditorOptions[_],
    resolvers: js.Array[js.Function1[/* schema */ _, String]]
  ): Customvalidators = {
    val __obj = js.Dynamic.literal(custom_validators = custom_validators.asInstanceOf[js.Any], editors = editors.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], resolvers = resolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customvalidators]
  }
  @scala.inline
  implicit class CustomvalidatorsOps[Self <: Customvalidators] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustom_validators(
      value: js.Array[
          js.Function3[/* schema */ _, /* value */ String, /* path */ String, js.Array[JSONEditorError]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_validators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditors(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguages(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: JSONEditorOptions[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvers(value: js.Array[js.Function1[/* schema */ _, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

