package typingsSlinky.autolinker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object autolinkerMod {
  type ReplaceFn = js.Function1[
    /* match */ typingsSlinky.autolinker.matchMatchMod.Match, 
    typingsSlinky.autolinker.autolinkerMod.ReplaceFnReturn
  ]
  type ReplaceFnReturn = js.UndefOr[
    scala.Boolean | java.lang.String | typingsSlinky.autolinker.htmlTagMod.HtmlTag | scala.Null | scala.Unit
  ]
  type StripPrefixConfig = scala.Boolean | typingsSlinky.autolinker.autolinkerMod.StripPrefixConfigObj
  type TruncateConfig = scala.Double | typingsSlinky.autolinker.autolinkerMod.TruncateConfigObj
  type UrlsConfig = scala.Boolean | typingsSlinky.autolinker.autolinkerMod.UrlsConfigObj
}
