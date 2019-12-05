package typingsSlinky.dot.dotMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateSettings extends js.Object {
  var append: Boolean
  var conditional: js.RegExp
  var define: js.RegExp
  var defineParams: js.RegExp
  var encode: js.RegExp
  var evaluate: js.RegExp
  var interpolate: js.RegExp
  var iterate: js.RegExp
  var selfcontained: Boolean
  var strip: Boolean
  var use: js.RegExp
  var useParams: js.RegExp
  var varname: String
}

object TemplateSettings {
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
  ): TemplateSettings = {
    val __obj = js.Dynamic.literal(append = append.asInstanceOf[js.Any], conditional = conditional.asInstanceOf[js.Any], define = define.asInstanceOf[js.Any], defineParams = defineParams.asInstanceOf[js.Any], encode = encode.asInstanceOf[js.Any], evaluate = evaluate.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], iterate = iterate.asInstanceOf[js.Any], selfcontained = selfcontained.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], useParams = useParams.asInstanceOf[js.Any], varname = varname.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TemplateSettings]
  }
}

@JSImport("dot", "templateSettings")
@js.native
object templateSettings extends TopLevel[TemplateSettings]

