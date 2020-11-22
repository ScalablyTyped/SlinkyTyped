package typingsSlinky.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object helpersMod {
  
  type ArrayKeyType[TData] = js.Array[typingsSlinky.reactRelay.helpersMod.KeyType[js.Array[TData]] | scala.Null]
  
  type ArrayKeyTypeData[TKey /* <: typingsSlinky.reactRelay.helpersMod.ArrayKeyType[TData] */, TData] = typingsSlinky.reactRelay.helpersMod.KeyTypeData[
    typingsSlinky.std.NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: TKey[number] */ js.Any
    ], 
    js.Any
  ]
  
  type GetEntryPointComponentFromEntryPoint[TEntryPoint] = js.Any
  
  type GetEntryPointParamsFromEntryPoint[TEntryPoint] = js.Any
  
  type KeyTypeData[TKey /* <: typingsSlinky.reactRelay.helpersMod.KeyType[TData] */, TData] = /* import warning: importer.ImportType#apply Failed type conversion: std.Required<TKey>[' $data'] */ js.Any
}
