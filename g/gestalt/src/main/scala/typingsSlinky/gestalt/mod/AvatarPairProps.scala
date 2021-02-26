package typingsSlinky.gestalt.mod

import typingsSlinky.gestalt.anon.Name
import typingsSlinky.gestalt.gestaltStrings.fit
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvatarPairProps extends StObject {
  
  var collaborators: js.Array[Name] = js.native
  
  var size: js.UndefOr[md | lg | fit] = js.native
}
object AvatarPairProps {
  
  @scala.inline
  def apply(collaborators: js.Array[Name]): AvatarPairProps = {
    val __obj = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarPairProps]
  }
  
  @scala.inline
  implicit class AvatarPairPropsMutableBuilder[Self <: AvatarPairProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollaborators(value: js.Array[Name]): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollaboratorsVarargs(value: Name*): Self = StObject.set(x, "collaborators", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: md | lg | fit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
