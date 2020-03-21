package typingsSlinky.phenomnomnominalTsquery

import typingsSlinky.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryOptions
import typingsSlinky.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryStringTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phenomnomnominal/tsquery/dist/src/replace", JSImport.Namespace)
@js.native
object replaceMod extends js.Object {
  def replace(source: String, selector: String, stringTransformer: TSQueryStringTransformer): String = js.native
  def replace(
    source: String,
    selector: String,
    stringTransformer: TSQueryStringTransformer,
    options: TSQueryOptions
  ): String = js.native
}

