package typingsSlinky.loadableComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ComponentResolver[Props, Module] = js.Function2[/* module */ Module, /* props */ Props, slinky.core.ReactComponentClass[Props]]
  
  type DefaultComponent[Props] = slinky.core.ReactComponentClass[Props] | typingsSlinky.loadableComponent.mod.DefaultImportedComponent[Props]
  
  type LoadableComponent[Props] = (slinky.core.ReactComponentClass[Props with typingsSlinky.loadableComponent.anon.Fallback]) with typingsSlinky.loadableComponent.mod.LoadableComponentMethods[Props]
  
  type LoadableLibrary[Module] = slinky.core.ReactComponentClass[typingsSlinky.loadableComponent.anon.Children[Module]] with Module with typingsSlinky.loadableComponent.mod.LoadableComponentMethods[js.Object]
}
