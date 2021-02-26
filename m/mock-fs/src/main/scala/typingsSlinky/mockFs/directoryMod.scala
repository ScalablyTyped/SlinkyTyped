package typingsSlinky.mockFs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directoryMod {
  
  @JSImport("mock-fs/lib/directory", JSImport.Namespace)
  @js.native
  class ^ () extends Directory
  
  @js.native
  trait Directory
    extends typingsSlinky.mockFs.itemMod.^ {
    
    /**
      * Add an item to the directory.
      * @param name The name to give the item.
      * @param item The item to add.
      * @return The added item.
      */
    def addItem[T /* <: typingsSlinky.mockFs.itemMod.^ */](name: String, item: T): T = js.native
    
    /** Get a named item (or null if none). */
    def getItem(name: String): typingsSlinky.mockFs.itemMod.^ | Null = js.native
    
    /** Get sorted list of item names in this directory. */
    def list(): js.Array[String] = js.native
    
    /**
      * Remove an item. Will throw an error if not present.
      *
      * @param name Name of the item to remove.
      * @return The orphan item.
      */
    def removeItem(name: String): typingsSlinky.mockFs.itemMod.^ = js.native
  }
}
