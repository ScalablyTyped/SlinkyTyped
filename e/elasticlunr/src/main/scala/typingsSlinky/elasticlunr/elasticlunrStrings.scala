package typingsSlinky.elasticlunr

import typingsSlinky.elasticlunr.mod.Bool
import typingsSlinky.elasticlunr.mod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticlunrStrings {
  
  @scala.inline
  def AND: AND = "AND".asInstanceOf[AND]
  
  @scala.inline
  def FieldSearchConfig: FieldSearchConfig = "FieldSearchConfig".asInstanceOf[FieldSearchConfig]
  
  @scala.inline
  def Index: Index = "Index".asInstanceOf[Index]
  
  @scala.inline
  def OR: OR = "OR".asInstanceOf[OR]
  
  @scala.inline
  def SerialisedDocumentStore: SerialisedDocumentStore = "SerialisedDocumentStore".asInstanceOf[SerialisedDocumentStore]
  
  @scala.inline
  def SerialisedIndexData: SerialisedIndexData = "SerialisedIndexData".asInstanceOf[SerialisedIndexData]
  
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait AND extends Bool
  
  @js.native
  sealed trait FieldSearchConfig extends js.Object
  
  @js.native
  sealed trait Index extends js.Object
  
  @js.native
  sealed trait OR extends Bool
  
  @js.native
  sealed trait SerialisedDocumentStore extends js.Object
  
  @js.native
  sealed trait SerialisedIndexData extends js.Object
  
  @js.native
  sealed trait add extends EventType
  
  @js.native
  sealed trait remove extends EventType
  
  @js.native
  sealed trait update extends EventType
}
