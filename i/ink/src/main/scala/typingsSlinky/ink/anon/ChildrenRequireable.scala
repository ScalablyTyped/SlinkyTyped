package typingsSlinky.ink.anon

import typingsSlinky.propTypes.mod.ReactNodeLike
import typingsSlinky.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildrenRequireable extends StObject {
  
  var children: Requireable[ReactNodeLike] = js.native
}
object ChildrenRequireable {
  
  @scala.inline
  def apply(children: Requireable[ReactNodeLike]): ChildrenRequireable = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenRequireable]
  }
  
  @scala.inline
  implicit class ChildrenRequireableMutableBuilder[Self <: ChildrenRequireable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
