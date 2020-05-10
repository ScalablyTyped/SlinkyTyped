package typingsSlinky.hapiJoi.mod

import typingsSlinky.hapiJoi.AnonBuild
import typingsSlinky.hapiJoi.AnonTo
import typingsSlinky.std.Record
import typingsSlinky.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extension extends js.Object {
  var args: js.UndefOr[js.Function1[/* repeated */ SchemaLike, Schema]] = js.native
  var base: js.UndefOr[Schema] = js.native
  /**
    * undocumented options
    */
  var cast: js.UndefOr[Record[String, AnonTo]] = js.native
  var coerce: js.UndefOr[CoerceFunction | CoerceObject] = js.native
  var flags: js.UndefOr[Record[String, ExtensionFlag]] = js.native
  var manifest: js.UndefOr[AnonBuild] = js.native
  var messages: js.UndefOr[LanguageMessages | String] = js.native
  var modifiers: js.UndefOr[Record[String, js.Function2[/* rule */ _, /* enabled */ js.UndefOr[Boolean], _]]] = js.native
  var overrides: js.UndefOr[Record[String, js.Function1[/* value */ _, Schema]]] = js.native
  var prepare: js.UndefOr[js.Function2[/* value */ js.Any, /* helpers */ CustomHelpers[_], _]] = js.native
  var properties: js.UndefOr[Record[String, _]] = js.native
  var rebuild: js.UndefOr[js.Function1[/* schema */ ExtensionBoundSchema, Unit]] = js.native
  var rules: js.UndefOr[Record[String, ExtensionRule with ThisType[SchemaInternals]]] = js.native
  var terms: js.UndefOr[Record[String, ExtensionTerm]] = js.native
  var `type`: String = js.native
  var validate: js.UndefOr[js.Function2[/* value */ js.Any, /* helpers */ CustomHelpers[_], _]] = js.native
}

object Extension {
  @scala.inline
  def apply(`type`: String): Extension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  @scala.inline
  implicit class ExtensionOps[Self <: Extension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: /* repeated */ SchemaLike => Schema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
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
    def withCast(value: Record[String, AnonTo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(js.undefined)
        ret
    }
    @scala.inline
    def withCoerceFunction2(value: (/* value */ js.Any, /* helpers */ CustomHelpers[js.Any]) => CoerceResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerce")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCoerce(value: CoerceFunction | CoerceObject): Self = {
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
    def withFlags(value: Record[String, ExtensionFlag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withManifest(value: AnonBuild): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: LanguageMessages | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiers(value: Record[String, js.Function2[/* rule */ _, /* enabled */ js.UndefOr[Boolean], _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: Record[String, js.Function1[/* value */ _, Schema]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepare(value: (/* value */ js.Any, /* helpers */ CustomHelpers[_]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepare")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPrepare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepare")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withRebuild(value: /* schema */ ExtensionBoundSchema => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebuild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRebuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebuild")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: Record[String, ExtensionRule with ThisType[SchemaInternals]]): Self = {
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
    @scala.inline
    def withTerms(value: Record[String, ExtensionTerm]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: (/* value */ js.Any, /* helpers */ CustomHelpers[_]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction2(value))
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

