package typingsSlinky.jss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jssMod {
  import org.scalablytyped.runtime.StringDictionary
  import org.scalajs.dom.raw.HTMLElement
  import typingsSlinky.csstype.csstypeMod.Properties
  import typingsSlinky.jss.jssBooleans.`false`
  import typingsSlinky.jss.jssStrings.Exclamationmarkimportant
  import typingsSlinky.std.Record

  type Classes[Name /* <: String | Double | js.Symbol */] = Record[Name, String]
  type CreateGenerateId = js.Function1[/* options */ js.UndefOr[CreateGenerateIdOptions], GenerateId]
  type CssProperties = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof jss.jss.NormalCssProperties ]: jss.jss.FnValue<jss.jss.NormalCssProperties[K]>}
    */ typingsSlinky.jss.jssStrings.CssProperties with NormalCssProperties
  // TODO: Type data better, currently typed as any for allowing to override it
  type FnValue[R] = R | (js.Function1[/* data */ js.Any, R])
  type GenerateId = js.Function2[/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]], String]
  type InsertionPoint = String | HTMLElement
  type JssStyle = JssStyleP[JssStyleP[JssStyleP[JssStyleP[JssStyleP[JssStyleP[JssStyleP[Unit]]]]]]]
  // Jss Style definitions
  type JssStyleP[S] = CssProperties with (StringDictionary[FnValue[JssValue | S]])
  type JssValue = String | Double | (js.Array[String | Double | (js.Array[String | Double]) | Exclamationmarkimportant]) | Null | `false`
  type Keyframes[Name /* <: String */] = Record[Name, String]
  type NormalCssProperties = Properties[String | Double]
  type Styles[Name /* <: String | Double | js.Symbol */] = Record[Name, JssStyle | String]
}
