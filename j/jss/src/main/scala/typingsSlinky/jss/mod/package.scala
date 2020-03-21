package typingsSlinky.jss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Classes[Name /* <: java.lang.String | scala.Double | js.Symbol */] = typingsSlinky.std.Record[Name, java.lang.String]
  type CreateGenerateId_ = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.jss.mod.CreateGenerateIdOptions], 
    typingsSlinky.jss.mod.GenerateId
  ]
  // TODO: Type data better, currently typed as any for allowing to override it
  type FnValue[R] = R | (js.Function1[/* data */ js.Any, R])
  type GenerateId = js.Function2[
    /* rule */ typingsSlinky.jss.mod.Rule, 
    /* sheet */ js.UndefOr[typingsSlinky.jss.mod.StyleSheet[java.lang.String]], 
    java.lang.String
  ]
  type InsertionPoint = java.lang.String | org.scalajs.dom.raw.HTMLElement
  type JssValue = java.lang.String | scala.Double | (js.Array[
    java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double]) | typingsSlinky.jss.jssStrings.Exclamationmarkimportant
  ]) | scala.Null | typingsSlinky.jss.jssBooleans.`false`
  type Keyframes[Name /* <: java.lang.String */] = typingsSlinky.std.Record[Name, java.lang.String]
  type NormalCssProperties = typingsSlinky.csstype.mod.Properties[java.lang.String | scala.Double]
  type Styles[Name /* <: java.lang.String | scala.Double | js.Symbol */] = typingsSlinky.std.Record[Name, typingsSlinky.jss.mod.JssStyle | java.lang.String]
}
