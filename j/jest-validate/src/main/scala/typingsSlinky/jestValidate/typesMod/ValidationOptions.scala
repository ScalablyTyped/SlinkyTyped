package typingsSlinky.jestValidate.typesMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationOptions extends js.Object {
  var comment: js.UndefOr[String] = js.native
  var condition: js.UndefOr[js.Function2[/* option */ js.Any, /* validOption */ js.Any, Boolean]] = js.native
  var deprecate: js.UndefOr[
    js.Function4[
      /* config */ Record[String, _], 
      /* option */ String, 
      /* deprecatedOptions */ DeprecatedOptions, 
      /* options */ ValidationOptions, 
      Boolean
    ]
  ] = js.native
  var deprecatedConfig: js.UndefOr[DeprecatedOptions] = js.native
  var error: js.UndefOr[
    js.Function5[
      /* option */ String, 
      /* received */ js.Any, 
      /* defaultValue */ js.Any, 
      /* options */ ValidationOptions, 
      /* path */ js.UndefOr[js.Array[String]], 
      Unit
    ]
  ] = js.native
  var exampleConfig: Record[String, _] = js.native
  var recursive: js.UndefOr[Boolean] = js.native
  var recursiveBlacklist: js.UndefOr[js.Array[String]] = js.native
  var title: js.UndefOr[Title] = js.native
  var unknown: js.UndefOr[
    js.Function5[
      /* config */ Record[String, _], 
      /* exampleConfig */ Record[String, _], 
      /* option */ String, 
      /* options */ ValidationOptions, 
      /* path */ js.UndefOr[js.Array[String]], 
      Unit
    ]
  ] = js.native
}

object ValidationOptions {
  @scala.inline
  def apply(exampleConfig: Record[String, _]): ValidationOptions = {
    val __obj = js.Dynamic.literal(exampleConfig = exampleConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
  @scala.inline
  implicit class ValidationOptionsOps[Self <: ValidationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExampleConfig(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exampleConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withCondition(value: (/* option */ js.Any, /* validOption */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecate(
      value: (/* config */ Record[String, _], /* option */ String, /* deprecatedOptions */ DeprecatedOptions, /* options */ ValidationOptions) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutDeprecate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecatedConfig(value: DeprecatedOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecatedConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withError(
      value: (/* option */ String, /* received */ js.Any, /* defaultValue */ js.Any, /* options */ ValidationOptions, /* path */ js.UndefOr[js.Array[String]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursiveBlacklist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveBlacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursiveBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveBlacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: Title): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknown(
      value: (/* config */ Record[String, _], /* exampleConfig */ Record[String, _], /* option */ String, /* options */ ValidationOptions, /* path */ js.UndefOr[js.Array[String]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutUnknown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(js.undefined)
        ret
    }
  }
  
}

