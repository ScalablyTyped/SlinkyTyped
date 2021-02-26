package typingsSlinky.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsProvider extends StObject {
  
  def getOption(name: String): js.Any = js.native
  
  def getOptions(): StringDictionary[js.Any] = js.native
  def getOptions(optionNames: js.Array[String]): StringDictionary[js.Any] = js.native
  def getOptions(optionNames: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  
  def setOption(name: String, value: js.Any): Unit = js.native
  
  def setOptions(optList: StringDictionary[js.Any]): Unit = js.native
}
