package typingsSlinky.classnames

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.classnames.anon.DefaultClassNamesFn
import typingsSlinky.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait ClassArray extends Array[ClassValue]
  
  type ClassDictionary = StringDictionary[js.Any]
  
  type ClassNamesExport = ClassNamesFn with DefaultClassNamesFn
  
  type ClassNamesFn = js.Function1[/* repeated */ ClassValue, String]
  
  type ClassValue = js.UndefOr[String | Double | ClassDictionary | ClassArray | Null | Boolean]
}
