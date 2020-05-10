package typingsSlinky.dot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateSettings_ extends js.Object {
  var append: Boolean = js.native
  var conditional: js.RegExp = js.native
  var define: js.RegExp = js.native
  var defineParams: js.RegExp = js.native
  var encode: js.RegExp = js.native
  var evaluate: js.RegExp = js.native
  var interpolate: js.RegExp = js.native
  var iterate: js.RegExp = js.native
  var selfcontained: Boolean = js.native
  var strip: Boolean = js.native
  var use: js.RegExp = js.native
  var useParams: js.RegExp = js.native
  var varname: String = js.native
}

object TemplateSettings_ {
  @scala.inline
  def apply(
    append: Boolean,
    conditional: js.RegExp,
    define: js.RegExp,
    defineParams: js.RegExp,
    encode: js.RegExp,
    evaluate: js.RegExp,
    interpolate: js.RegExp,
    iterate: js.RegExp,
    selfcontained: Boolean,
    strip: Boolean,
    use: js.RegExp,
    useParams: js.RegExp,
    varname: String
  ): TemplateSettings_ = {
    val __obj = js.Dynamic.literal(append = append.asInstanceOf[js.Any], conditional = conditional.asInstanceOf[js.Any], define = define.asInstanceOf[js.Any], defineParams = defineParams.asInstanceOf[js.Any], encode = encode.asInstanceOf[js.Any], evaluate = evaluate.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], iterate = iterate.asInstanceOf[js.Any], selfcontained = selfcontained.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], useParams = useParams.asInstanceOf[js.Any], varname = varname.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateSettings_]
  }
  @scala.inline
  implicit class TemplateSettings_Ops[Self <: TemplateSettings_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditional(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefine(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("define")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefineParams(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defineParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncode(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvaluate(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterpolate(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterate(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfcontained(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfcontained")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUse(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseParams(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVarname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varname")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

