package typingsSlinky.jss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jssMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.csstype.csstypeMod.StandardProperties
  import typingsSlinky.jss.jssNumbers.`false`
  import typingsSlinky.jss.jssStrings.`!important`
  import typingsSlinky.std.HTMLElement
  import typingsSlinky.std.Record

  type Classes[Name /* <: String | Double | js.Symbol */] = Record[Name, String]
  type CreateGenerateId = js.Function1[/* options */ js.UndefOr[CreateGenerateIdOptions], GenerateId]
  type GenerateId = js.Function2[/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]], String]
  type InsertionPoint = String | HTMLElement
  type JssValue = String | Double | (js.Array[String | Double | (js.Array[String | Double]) | `!important`]) | Null | `false`
  type Keyframes[Name /* <: String */] = Record[Name, String]
  type Style = (StandardProperties[String | Double | (js.Function0[String | Double])]) with (StringDictionary[
    (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jss.jss.Style */ js.Object) | String | Double
  ])
  type Styles[Name /* <: String */] = Record[Name, Style | String]
}
