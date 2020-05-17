package typingsSlinky.reactIntl

import typingsSlinky.formatjsIntlListformat.mod.default
import typingsSlinky.reactIntl.anon.PickIntlConfiglocaleonErr
import typingsSlinky.reactIntl.anon.TypeofIntlListFormat
import typingsSlinky.std.ConstructorParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/formatters/list", JSImport.Namespace)
@js.native
object listMod extends js.Object {
  @JSName("formatList")
  def formatList_1(
    hasLocaleOnError: PickIntlConfiglocaleonErr,
    getListFormat: js.Function1[/* args */ ConstructorParameters[TypeofIntlListFormat], default],
    values: js.Array[String],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCall>[1] */ js.Any
  ): String = js.native
}

