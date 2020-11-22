package typingsSlinky.rcFieldForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interfaceMod {
  
  type EventArgs = js.Array[js.Any]
  
  type InternalNamePath = js.Array[java.lang.String | scala.Double]
  
  type InternalValidateFields = js.Function2[
    /* nameList */ js.UndefOr[js.Array[typingsSlinky.rcFieldForm.interfaceMod.NamePath]], 
    /* options */ js.UndefOr[typingsSlinky.rcFieldForm.interfaceMod.ValidateOptions], 
    js.Promise[typingsSlinky.rcFieldForm.interfaceMod.Store]
  ]
  
  type NamePath = java.lang.String | scala.Double | typingsSlinky.rcFieldForm.interfaceMod.InternalNamePath
  
  /** Only return partial when type is not any */
  type RecursivePartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends std.Array<infer U>? std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias rc-field-form.rc-field-form/es/interface.RecursivePartial<U> * / object> : T[P] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias rc-field-form.rc-field-form/es/interface.RecursivePartial<T[P]> * / object : T[P]}
    */ typingsSlinky.rcFieldForm.rcFieldFormStrings.RecursivePartial with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type Rule = typingsSlinky.rcFieldForm.interfaceMod.RuleObject | typingsSlinky.rcFieldForm.interfaceMod.RuleRender
  
  type RuleRender = js.Function1[
    /* form */ typingsSlinky.rcFieldForm.interfaceMod.FormInstance[js.Any], 
    typingsSlinky.rcFieldForm.interfaceMod.RuleObject
  ]
  
  type Store = org.scalablytyped.runtime.StringDictionary[typingsSlinky.rcFieldForm.interfaceMod.StoreValue]
  
  type StoreValue = js.Any
  
  type ValidateFields = js.Function1[
    /* nameList */ js.UndefOr[js.Array[typingsSlinky.rcFieldForm.interfaceMod.NamePath]], 
    js.Promise[typingsSlinky.rcFieldForm.interfaceMod.Store]
  ]
  
  type ValidateMessage = java.lang.String | js.Function0[java.lang.String]
  
  type Validator = js.Function3[
    /* rule */ typingsSlinky.rcFieldForm.interfaceMod.RuleObject, 
    /* value */ typingsSlinky.rcFieldForm.interfaceMod.StoreValue, 
    /* callback */ js.Function1[/* error */ js.UndefOr[java.lang.String], scala.Unit], 
    (js.Promise[scala.Unit | js.Any]) | scala.Unit
  ]
  
  type ValuedNotifyInfo = typingsSlinky.rcFieldForm.interfaceMod.NotifyInfo with typingsSlinky.rcFieldForm.anon.Store
}
