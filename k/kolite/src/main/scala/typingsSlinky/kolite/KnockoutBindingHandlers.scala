package typingsSlinky.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutBindingHandlers extends StObject {
  
  var activity: KoLiteActivityBindingHandler = js.native
  
  var command: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any = js.native
}
object KnockoutBindingHandlers {
  
  @scala.inline
  def apply(
    activity: KoLiteActivityBindingHandler,
    command: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
  
  @scala.inline
  implicit class KnockoutBindingHandlersMutableBuilder[Self <: KnockoutBindingHandlers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivity(value: KoLiteActivityBindingHandler): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
