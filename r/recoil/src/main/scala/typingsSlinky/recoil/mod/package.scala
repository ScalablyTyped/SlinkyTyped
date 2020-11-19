package typingsSlinky.recoil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AtomValues = typingsSlinky.std.Map[typingsSlinky.recoil.mod.NodeKey, typingsSlinky.recoil.mod.Loadable[js.Any]]
  
  type ComponentCallback = js.Function1[/* state */ typingsSlinky.recoil.mod.TreeState, scala.Unit]
  
  type GetRecoilValue = js.Function1[/* recoilVal */ typingsSlinky.recoil.mod.RecoilValue[js.Any], js.Any]
  
  type LoadablePromise[T] = js.Promise[typingsSlinky.recoil.mod.ResolvedLoadablePromiseInfo[T]]
  
  type NodeKey = java.lang.String
  
  type Primitive = js.UndefOr[scala.Null | scala.Boolean | scala.Double | js.Symbol | java.lang.String]
  
  type ResetRecoilState = js.Function1[/* recoilVal */ typingsSlinky.recoil.mod.RecoilState[js.Any], scala.Unit]
  
  type Resetter = js.Function0[scala.Unit]
  
  type SerializableParam = typingsSlinky.recoil.mod.Primitive | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias recoil.recoil.SerializableParam */ js.Object
  ]) | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias recoil.recoil.SerializableParam */ js.Object
  ])
  
  type SetRecoilState = js.Function2[
    /* recoilVal */ typingsSlinky.recoil.mod.RecoilState[js.Any], 
    /* newVal */ js.Any | typingsSlinky.recoil.mod.DefaultValue | (js.Function1[/* prevValue */ js.Any, js.Any | typingsSlinky.recoil.mod.DefaultValue]), 
    scala.Unit
  ]
  
  type SetterOrUpdater[T] = js.Function1[/* valOrUpdater */ (js.Function1[/* currVal */ T, T]) | T, scala.Unit]
  
  type UnwrapRecoilValue[T] = js.Any
  
  type UnwrapRecoilValueLoadables[T /* <: js.Array[typingsSlinky.recoil.mod.RecoilValue[_]] | org.scalablytyped.runtime.StringDictionary[typingsSlinky.recoil.mod.RecoilValue[_]] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: recoil.recoil.Loadable<recoil.recoil.UnwrapRecoilValue<T[P]>>}
    */ typingsSlinky.recoil.recoilStrings.UnwrapRecoilValueLoadables with org.scalablytyped.runtime.TopLevel[T]
}
