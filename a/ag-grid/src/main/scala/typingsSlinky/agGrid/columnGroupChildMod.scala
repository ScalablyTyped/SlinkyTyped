package typingsSlinky.agGrid

import typingsSlinky.agGrid.colDefMod.AbstractColDef
import typingsSlinky.agGrid.columnGroupMod.ColumnGroup
import typingsSlinky.agGrid.iEventEmitterMod.IEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnGroupChildMod {
  
  @js.native
  trait ColumnGroupChild extends IEventEmitter {
    
    def getActualWidth(): Double = js.native
    
    def getColumnGroupShow(): String = js.native
    
    def getDefinition(): AbstractColDef = js.native
    
    def getLeft(): Double = js.native
    
    def getMinWidth(): Double = js.native
    
    def getOldLeft(): Double = js.native
    
    def getParent(): ColumnGroupChild = js.native
    
    def getUniqueId(): String = js.native
    
    def isEmptyGroup(): Boolean = js.native
    
    def isMoving(): Boolean = js.native
    
    def isResizable(): Boolean = js.native
    
    def setParent(parent: ColumnGroup): Unit = js.native
  }
}
