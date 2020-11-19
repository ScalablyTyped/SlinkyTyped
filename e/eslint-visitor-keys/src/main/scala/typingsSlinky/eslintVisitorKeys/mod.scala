package typingsSlinky.eslintVisitorKeys

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eslint-visitor-keys", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val KEYS: VisitorKeys = js.native
  
  def getKeys(node: js.Object): js.Array[String] = js.native
  
  def unionWith(keys: VisitorKeys): VisitorKeys = js.native
  
  type VisitorKeys = StringDictionary[js.UndefOr[js.Array[String]]]
}
