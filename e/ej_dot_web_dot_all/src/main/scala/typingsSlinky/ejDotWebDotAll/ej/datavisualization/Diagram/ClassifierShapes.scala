package typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClassifierShapes extends js.Object

@JSGlobal("ej.datavisualization.Diagram.ClassifierShapes")
@js.native
object ClassifierShapes extends js.Object {
  //Used to notate aggregation in a UML Class Diagram
  @js.native
  sealed trait Aggregation extends ClassifierShapes
  
  //Used to notate association in UML Class Diagram
  @js.native
  sealed trait Association extends ClassifierShapes
  
  //Used to define a Class
  @js.native
  sealed trait Class extends ClassifierShapes
  
  //Used to notate composition in a UML Class Diagram
  @js.native
  sealed trait Composition extends ClassifierShapes
  
  //Used to notate dependency in a UML Class Diagram
  @js.native
  sealed trait Dependency extends ClassifierShapes
  
  //Used to define an Enumeration
  @js.native
  sealed trait Enumeration extends ClassifierShapes
  
  //Used to notate inheritance in a UML Class Diagram
  @js.native
  sealed trait Inheritance extends ClassifierShapes
  
  //Used to define an Interface
  @js.native
  sealed trait Interface extends ClassifierShapes
  
  /* 4 */ val Aggregation: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.ClassifierShapes.Aggregation with Double = js.native
  /* 3 */ val Association: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.ClassifierShapes.Association with Double = js.native
  /* 0 */ val Class: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.ClassifierShapes.Class with Double = js.native
  /* 5 */ val Composition: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.ClassifierShapes.Composition with Double = js.native
  /* 6 */ val Dependency: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.ClassifierShapes.Dependency with Double = js.native
  /* 2 */ val Enumeration: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.ClassifierShapes.Enumeration with Double = js.native
  /* 7 */ val Inheritance: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.ClassifierShapes.Inheritance with Double = js.native
  /* 1 */ val Interface: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.ClassifierShapes.Interface with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClassifierShapes with Double] = js.native
}

