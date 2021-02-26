package typingsSlinky

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object scratchEnv {
  
  /** The string name of a function which returns menu items. */
  type ExtensionDynamicMenu = java.lang.String
  
  /** A menu item for which the label and value are identical strings. */
  type ExtensionMenuItemSimple = java.lang.String
  
  /** Items in an extension menu. */
  type ExtensionMenuItems = js.Array[
    typingsSlinky.scratchEnv.ExtensionMenuItemSimple | typingsSlinky.scratchEnv.ExtensionMenuItemComplex
  ]
  
  /** All the metadata needed to register an extension drop-down menu. */
  type ExtensionMenuMetadata = typingsSlinky.scratchEnv.ExtensionDynamicMenu | typingsSlinky.scratchEnv.ExtensionMenuItems
  
  type ValueOf[ObjectType] = /* import warning: importer.ImportType#apply Failed type conversion: ObjectType[keyof ObjectType] */ js.Any
}
