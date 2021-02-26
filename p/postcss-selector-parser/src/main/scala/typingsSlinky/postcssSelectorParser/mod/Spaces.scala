package typingsSlinky.postcssSelectorParser.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.postcssSelectorParser.anon.PartialSpaceAround
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spaces
  extends SpaceAround
     with /* spaceType */ StringDictionary[js.UndefOr[String | PartialSpaceAround]]
object Spaces {
  
  @scala.inline
  def apply(after: String, before: String): Spaces = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spaces]
  }
}
