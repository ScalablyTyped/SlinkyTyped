package typingsSlinky.hexoUtil.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.hexoUtil.anon.Segments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-util", "Permalink")
@js.native
class Permalink protected () extends js.Object {
  def this(rule: String) = this()
  def this(rule: String, options: Segments) = this()
  
  var params: js.Array[String] = js.native
  
  def parse(str: String): js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var regex: js.RegExp = js.native
  
  var rule: String = js.native
  
  def stringify(data: StringDictionary[String]): String = js.native
  
  def test(str: String): Boolean = js.native
}
