package typingsSlinky.commonTags.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("common-tags", "replaceStringTransformer")
@js.native
object replaceStringTransformer extends js.Object {
  
  def apply(replaceWhat: String, replaceWith: String): TemplateTransformer[StringDictionary[_]] = js.native
  def apply(
    replaceWhat: String,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): TemplateTransformer[StringDictionary[_]] = js.native
  def apply(replaceWhat: js.RegExp, replaceWith: String): TemplateTransformer[StringDictionary[_]] = js.native
  def apply(
    replaceWhat: js.RegExp,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): TemplateTransformer[StringDictionary[_]] = js.native
}
