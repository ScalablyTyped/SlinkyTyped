package typingsSlinky.aphrodite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CSSInputTypes = typingsSlinky.aphrodite.mod.StyleDeclarationValue | typingsSlinky.aphrodite.aphroditeBooleans.`false` | scala.Null | scala.Unit
  
  type SelectorHandler = js.Function3[
    /* selector */ java.lang.String, 
    /* baseSelector */ java.lang.String, 
    /* callback */ js.Function1[/* selector */ java.lang.String, java.lang.String], 
    java.lang.String | scala.Null
  ]
  
  type StyleDeclaration[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: aphrodite.aphrodite/typings/css-properties.CSSProperties | aphrodite.aphrodite.StyleDeclarationMap}
    */ typingsSlinky.aphrodite.aphroditeStrings.StyleDeclaration with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type StyleDeclarationMap = typingsSlinky.std.Map[
    /* keyof aphrodite.aphrodite/typings/css-properties.CSSProperties */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 340 */ js.Any, 
    java.lang.String | scala.Double
  ]
  
  type StyleDeclarationValue = js.Object
}
