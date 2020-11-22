package typingsSlinky.ethersprojectContracts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ContractFunction[T] = js.Function1[/* repeated */ js.Any, js.Promise[T]]
  
  type ContractInterface = java.lang.String | (js.Array[
    typingsSlinky.ethersprojectAbi.mod.Fragment | typingsSlinky.ethersprojectAbi.fragmentsMod.JsonFragment | java.lang.String
  ]) | typingsSlinky.ethersprojectAbi.mod.Interface
}
