package typingsSlinky.graphqlToolsUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object loadersMod {
  
  type DocumentGlobPathPointer = java.lang.String
  
  type DocumentLoader[TOptions /* <: typingsSlinky.graphqlToolsUtils.loadersMod.SingleFileOptions */] = typingsSlinky.graphqlToolsUtils.loadersMod.Loader[typingsSlinky.graphqlToolsUtils.loadersMod.DocumentPointerSingle, TOptions]
  
  type DocumentPointer = typingsSlinky.graphqlToolsUtils.loadersMod.WithList[typingsSlinky.graphqlToolsUtils.loadersMod.DocumentGlobPathPointer]
  
  type DocumentPointerSingle = typingsSlinky.graphqlToolsUtils.loadersMod.ElementOf[typingsSlinky.graphqlToolsUtils.loadersMod.DocumentPointer]
  
  type ElementOf[TList] = js.Any
  
  type SchemaLoader[TOptions /* <: typingsSlinky.graphqlToolsUtils.loadersMod.SingleFileOptions */] = typingsSlinky.graphqlToolsUtils.loadersMod.Loader[typingsSlinky.graphqlToolsUtils.loadersMod.SchemaPointerSingle, TOptions]
  
  type SchemaPointer = typingsSlinky.graphqlToolsUtils.loadersMod.WithList[java.lang.String]
  
  type SchemaPointerSingle = typingsSlinky.graphqlToolsUtils.loadersMod.ElementOf[typingsSlinky.graphqlToolsUtils.loadersMod.SchemaPointer]
  
  type UniversalLoader[TOptions /* <: typingsSlinky.graphqlToolsUtils.loadersMod.SingleFileOptions */] = typingsSlinky.graphqlToolsUtils.loadersMod.Loader[
    typingsSlinky.graphqlToolsUtils.loadersMod.SchemaPointerSingle | typingsSlinky.graphqlToolsUtils.loadersMod.DocumentPointerSingle, 
    TOptions
  ]
  
  type WithList[T] = T | js.Array[T]
}
