package typingsSlinky.nodelibFsWalk

import typingsSlinky.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Entry = typingsSlinky.nodelibFsScandir.typesMod.Entry
  
  type Errno = ErrnoException
  
  @js.native
  trait QueueItem extends StObject {
    
    var base: js.UndefOr[String] = js.native
    
    var directory: String = js.native
  }
  object QueueItem {
    
    @scala.inline
    def apply(directory: String): QueueItem = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueItem]
    }
    
    @scala.inline
    implicit class QueueItemMutableBuilder[Self <: QueueItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    }
  }
}
