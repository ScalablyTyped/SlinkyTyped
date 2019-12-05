package typingsSlinky.autolinker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distCommonjsAutolinkerMod {
  import typingsSlinky.autolinker.distCommonjsHtmlDashTagMod.HtmlTag
  import typingsSlinky.autolinker.distCommonjsMatchMatchMod.Match

  type ReplaceFn = js.Function1[/* match */ Match, ReplaceFnReturn]
  type ReplaceFnReturn = js.UndefOr[Boolean | String | HtmlTag | Null | Unit]
  type StripPrefixConfig = Boolean | StripPrefixConfigObj
  type TruncateConfig = Double | TruncateConfigObj
  type UrlsConfig = Boolean | UrlsConfigObj
}
