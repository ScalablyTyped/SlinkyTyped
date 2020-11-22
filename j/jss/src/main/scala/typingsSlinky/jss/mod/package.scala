package typingsSlinky.jss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Classes[Name /* <: java.lang.String | scala.Double | js.Symbol */] = typingsSlinky.std.Record[Name, java.lang.String]
  
  type CreateGenerateId_ = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.jss.mod.CreateGenerateIdOptions], 
    typingsSlinky.jss.mod.GenerateId
  ]
  
  // TODO: Type data better, currently typed as any for allowing to override it
  type Func[R] = js.Function1[/* data */ js.Any, R]
  
  type GenerateId = js.Function2[
    /* rule */ typingsSlinky.jss.mod.Rule, 
    /* sheet */ js.UndefOr[typingsSlinky.jss.mod.StyleSheet[java.lang.String]], 
    java.lang.String
  ]
  
  type InsertionPoint = java.lang.String | org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.Comment
  
  type JssStyle = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof jss.jss.NormalCssProperties | string ]: jss.jss.NormalCssValues<K> | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jss.jss.JssStyle * / object | jss.jss.Func<jss.jss.NormalCssValues<K> | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jss.jss.JssStyle * / object | undefined> | indefinite-observable.indefinite-observable/dist/types.Observable<jss.jss.NormalCssValues<K> | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jss.jss.JssStyle * / object | undefined>}
    */ typingsSlinky.jss.jssStrings.JssStyle with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type JssValue = java.lang.String | scala.Double | (js.Array[
    java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double]) | typingsSlinky.jss.jssStrings.Exclamationmarkimportant
  ]) | scala.Null | typingsSlinky.jss.jssBooleans.`false`
  
  type Keyframes[Name /* <: java.lang.String */] = typingsSlinky.std.Record[Name, java.lang.String]
  
  type NormalCssProperties = typingsSlinky.csstype.mod.Properties[java.lang.String | scala.Double]
  
  type NormalCssValues[K] = typingsSlinky.jss.mod.JssValue | (/* import warning: importer.ImportType#apply Failed type conversion: jss.jss.NormalCssProperties[K] */ js.Any)
  
  type Styles[Name /* <: java.lang.String | scala.Double | js.Symbol */] = typingsSlinky.std.Record[
    Name, 
    typingsSlinky.jss.mod.JssStyle | java.lang.String | (typingsSlinky.jss.mod.Func[js.UndefOr[typingsSlinky.jss.mod.JssStyle | java.lang.String | scala.Null]]) | (typingsSlinky.indefiniteObservable.typesMod.Observable[js.UndefOr[typingsSlinky.jss.mod.JssStyle | java.lang.String | scala.Null]])
  ]
}
