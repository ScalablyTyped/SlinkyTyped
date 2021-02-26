package typingsSlinky.jupyterlabObservables

import typingsSlinky.jupyterlabObservables.modeldbMod.ObservableType
import typingsSlinky.jupyterlabObservables.observablemapMod.IObservableMap.ChangeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterlabObservablesStrings {
  
  @js.native
  sealed trait List extends ObservableType
  @scala.inline
  def List: List = "List".asInstanceOf[List]
  
  @js.native
  sealed trait Map extends ObservableType
  @scala.inline
  def Map: Map = "Map".asInstanceOf[Map]
  
  @js.native
  sealed trait String extends ObservableType
  @scala.inline
  def String: String = "String".asInstanceOf[String]
  
  @js.native
  sealed trait Value extends ObservableType
  @scala.inline
  def Value: Value = "Value".asInstanceOf[Value]
  
  @js.native
  sealed trait add
    extends ChangeType
       with typingsSlinky.jupyterlabObservables.observablelistMod.IObservableList.ChangeType
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait change extends ChangeType
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait insert
    extends typingsSlinky.jupyterlabObservables.observablestringMod.IObservableString.ChangeType
  @scala.inline
  def insert: insert = "insert".asInstanceOf[insert]
  
  @js.native
  sealed trait move
    extends typingsSlinky.jupyterlabObservables.observablelistMod.IObservableList.ChangeType
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait remove
    extends ChangeType
       with typingsSlinky.jupyterlabObservables.observablelistMod.IObservableList.ChangeType
       with typingsSlinky.jupyterlabObservables.observablestringMod.IObservableString.ChangeType
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait set
    extends typingsSlinky.jupyterlabObservables.observablelistMod.IObservableList.ChangeType
       with typingsSlinky.jupyterlabObservables.observablestringMod.IObservableString.ChangeType
  @scala.inline
  def set: set = "set".asInstanceOf[set]
}
