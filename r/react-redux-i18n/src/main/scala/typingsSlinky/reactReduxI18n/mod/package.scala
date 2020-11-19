package typingsSlinky.reactReduxI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DispatchCallback[S /* <: typingsSlinky.redux.mod.Action[_] */] = js.Function2[
    /* dispatch */ js.UndefOr[typingsSlinky.redux.mod.Dispatch[S]], 
    /* getState */ js.UndefOr[js.Function0[S]], 
    js.Any
  ]
  
  type SubTranslationObject = java.lang.String | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-redux-i18n.react-redux-i18n.SubTranslationObject */ js.Object
  ])
  
  type TranslationObjects = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reactReduxI18n.mod.SubTranslationObject]
}
