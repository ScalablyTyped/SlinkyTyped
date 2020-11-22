package typingsSlinky.reactDocgenTypescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object parserMod {
  
  type ComponentNameResolver = js.Function2[
    /* exp */ typingsSlinky.typescript.mod.Symbol, 
    /* source */ typingsSlinky.typescript.mod.SourceFile, 
    js.UndefOr[
      java.lang.String | scala.Null | typingsSlinky.reactDocgenTypescript.reactDocgenTypescriptBooleans.`false`
    ]
  ]
  
  type PropFilter = js.Function2[
    /* props */ typingsSlinky.reactDocgenTypescript.parserMod.PropItem, 
    /* component */ typingsSlinky.reactDocgenTypescript.parserMod.Component, 
    scala.Boolean
  ]
  
  type Props = typingsSlinky.reactDocgenTypescript.parserMod.StringIndexedObject[typingsSlinky.reactDocgenTypescript.parserMod.PropItem]
  
  type StringIndexedObject[T] = org.scalablytyped.runtime.StringDictionary[T]
}
