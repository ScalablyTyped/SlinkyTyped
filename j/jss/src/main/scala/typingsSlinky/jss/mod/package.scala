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
  type GenerateId = js.Function2[
    /* rule */ typingsSlinky.jss.mod.Rule, 
    /* sheet */ js.UndefOr[typingsSlinky.jss.mod.StyleSheet[java.lang.String]], 
    java.lang.String
  ]
  type Keyframes[Name /* <: java.lang.String */] = typingsSlinky.std.Record[Name, java.lang.String]
  type NormalCssProperties = typingsSlinky.csstype.mod.Properties[java.lang.String | scala.Double]
  type Styles[Name /* <: java.lang.String | scala.Double | js.Symbol */] = typingsSlinky.std.Record[Name, typingsSlinky.jss.mod.JssStyle | java.lang.String]
}
