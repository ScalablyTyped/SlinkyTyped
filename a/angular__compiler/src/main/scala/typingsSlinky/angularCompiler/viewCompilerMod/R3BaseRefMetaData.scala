package typingsSlinky.angularCompiler.viewCompilerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.apiMod.R3HostMetadata
import typingsSlinky.angularCompiler.apiMod.R3QueryMetadata
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3BaseRefMetaData extends js.Object {
  var host: js.UndefOr[R3HostMetadata] = js.native
  var inputs: js.UndefOr[StringDictionary[String | (js.Tuple2[String, String])]] = js.native
  var name: String = js.native
  var outputs: js.UndefOr[StringDictionary[String]] = js.native
  var queries: js.UndefOr[js.Array[R3QueryMetadata]] = js.native
  var `type`: Expression = js.native
  var typeSourceSpan: ParseSourceSpan = js.native
  var viewQueries: js.UndefOr[js.Array[R3QueryMetadata]] = js.native
}

object R3BaseRefMetaData {
  @scala.inline
  def apply(name: String, `type`: Expression, typeSourceSpan: ParseSourceSpan): R3BaseRefMetaData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3BaseRefMetaData]
  }
  @scala.inline
  implicit class R3BaseRefMetaDataOps[Self <: R3BaseRefMetaData] (val x: Self) extends AnyVal {
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
    def withType(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeSourceSpan(value: ParseSourceSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeSourceSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: R3HostMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withInputs(value: StringDictionary[String | (js.Tuple2[String, String])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputs(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(js.undefined)
        ret
    }
    @scala.inline
    def withQueries(value: js.Array[R3QueryMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(js.undefined)
        ret
    }
    @scala.inline
    def withViewQueries(value: js.Array[R3QueryMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewQueries")(js.undefined)
        ret
    }
  }
  
}

