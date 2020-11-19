package typingsSlinky.factoryGirl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Attributes[T] = typingsSlinky.factoryGirl.mod.Definition[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: factory-girl.factory-girl.Definition<T[P]>}
    */ typingsSlinky.factoryGirl.factoryGirlStrings.Attributes with org.scalablytyped.runtime.TopLevel[T]
  ]
  
  type Definition[T] = T | typingsSlinky.factoryGirl.mod.Generator[T]
  
  type Generator[T] = js.Function0[T]
  
  type Hook[T] = js.Function3[/* model */ js.Any, /* attrs */ js.Array[T], /* options */ js.Any, scala.Unit]
}
