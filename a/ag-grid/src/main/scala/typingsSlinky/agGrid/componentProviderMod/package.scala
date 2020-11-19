package typingsSlinky.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object componentProviderMod {
  
  type AgGridComponentFunctionInput = js.Function1[/* params */ js.Any, java.lang.String | org.scalajs.dom.raw.HTMLElement]
  
  type AgGridRegisteredComponentInput[A /* <: typingsSlinky.agGrid.iComponentMod.IComponent[_] */] = typingsSlinky.agGrid.componentProviderMod.AgGridComponentFunctionInput | typingsSlinky.agGrid.anon.InstantiableA[A]
  
  type RegisteredComponentInput[A /* <: typingsSlinky.agGrid.iComponentMod.IComponent[_] with B */, B] = typingsSlinky.agGrid.componentProviderMod.AgGridRegisteredComponentInput[A] | typingsSlinky.agGrid.anon.InstantiableB[B]
}
