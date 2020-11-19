package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UMLActivityFlow extends js.Object
@JSGlobal("ej.datavisualization.Diagram.UMLActivityFlow")
@js.native
object UMLActivityFlow extends js.Object {
  
  //Defines a activity flow as Control in UML Activity Diagram
  @js.native
  sealed trait Control extends UMLActivityFlow
  
  //Defines a activity flow as Exception in UML Activity Diagram
  @js.native
  sealed trait Exception extends UMLActivityFlow
  
  //Defines a activity flow as Object in UML Activity Diagram
  @js.native
  sealed trait Object extends UMLActivityFlow
}
