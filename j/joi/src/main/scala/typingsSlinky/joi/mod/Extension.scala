package typingsSlinky.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extension extends js.Object {
  var base: js.UndefOr[Schema] = js.native
  var coerce: js.UndefOr[
    js.ThisFunction3[
      /* this */ ExtensionBoundSchema, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ]
  ] = js.native
  var describe: js.UndefOr[
    js.ThisFunction1[/* this */ Schema, /* description */ Description_, Description_]
  ] = js.native
  var language: js.UndefOr[LanguageOptions] = js.native
  var name: String = js.native
  var pre: js.UndefOr[
    js.ThisFunction3[
      /* this */ ExtensionBoundSchema, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ]
  ] = js.native
  var rules: js.UndefOr[js.Array[Rules[_]]] = js.native
}

object Extension {
  @scala.inline
  def apply(name: String): Extension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  @scala.inline
  implicit class ExtensionOps[Self <: Extension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: Schema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withCoerce(
      value: js.ThisFunction3[
          /* this */ ExtensionBoundSchema, 
          /* value */ js.Any, 
          /* state */ State, 
          /* options */ ValidationOptions, 
          _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoerce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerce")(js.undefined)
        ret
    }
    @scala.inline
    def withDescribe(value: js.ThisFunction1[/* this */ Schema, /* description */ Description_, Description_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describe")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: LanguageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(null)
        ret
    }
    @scala.inline
    def withPre(
      value: js.ThisFunction3[
          /* this */ ExtensionBoundSchema, 
          /* value */ js.Any, 
          /* state */ State, 
          /* options */ ValidationOptions, 
          _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Array[Rules[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
  }
  
}

