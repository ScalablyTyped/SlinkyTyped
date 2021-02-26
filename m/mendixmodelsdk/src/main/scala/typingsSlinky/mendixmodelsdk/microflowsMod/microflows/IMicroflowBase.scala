package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.datatypesMod.datatypes.IDataType
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMicroflowBase extends IDocument {
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.9.0: introduced
    */
  val microflowReturnType: IDataType = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  val returnType: String | Null = js.native
}
