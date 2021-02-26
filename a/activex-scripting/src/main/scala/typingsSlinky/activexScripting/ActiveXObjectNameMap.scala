package typingsSlinky.activexScripting

import typingsSlinky.activexScripting.Scripting.Dictionary
import typingsSlinky.activexScripting.Scripting.Encoder
import typingsSlinky.activexScripting.Scripting.FileSystemObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends StObject {
  
  /** Set or get the item for a given key */
  @JSName("Scripting.Dictionary")
  def ScriptingDotDictionary(Key: js.Any): js.Any = js.native
  @JSName("Scripting.Dictionary")
  var ScriptingDotDictionary_Original: Dictionary[_, _] = js.native
  
  /** Call the Encoder determined by szExt, passing bstrStreamIn and optional arguments */
  @JSName("Scripting.Encoder")
  def ScriptingDotEncoder(szExt: String, bstrStreamIn: String, cFlags: Double, bstrDefaultLang: String): String = js.native
  @JSName("Scripting.Encoder")
  var ScriptingDotEncoder_Original: Encoder = js.native
  
  @JSName("Scripting.FileSystemObject")
  var ScriptingDotFileSystemObject: FileSystemObject = js.native
}
