package typingsSlinky.mendixmodelsdk.datatypesMod.datatypes

import typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.IEnumeration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.9.0: introduced
  */
@js.native
trait IEnumerationType extends IDataType {
  
  /**
    * This property is required and cannot be set to null.
    */
  val enumeration: IEnumeration = js.native
  
  val enumerationQualifiedName: String = js.native
}
