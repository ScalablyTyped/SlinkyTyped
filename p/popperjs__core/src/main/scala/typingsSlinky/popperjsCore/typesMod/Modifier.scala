package typingsSlinky.popperjsCore.typesMod

import typingsSlinky.popperjsCore.enumsMod.ModifierPhases_
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modifier[Name, Options] extends StObject {
  
  var data: js.UndefOr[Obj] = js.native
  
  var effect: js.UndefOr[js.Function1[/* arg0 */ ModifierArguments[Options], js.Function0[Unit] | Unit]] = js.native
  
  var enabled: Boolean = js.native
  
  def fn(arg0: ModifierArguments[Options]): State | Unit = js.native
  
  var name: Name = js.native
  
  var options: js.UndefOr[Partial[Options]] = js.native
  
  var phase: ModifierPhases_ = js.native
  
  var requires: js.UndefOr[js.Array[String]] = js.native
  
  var requiresIfExists: js.UndefOr[js.Array[String]] = js.native
}
object Modifier {
  
  @scala.inline
  def apply[Name, Options](
    enabled: Boolean,
    fn: ModifierArguments[Options] => State | Unit,
    name: Name,
    phase: ModifierPhases_
  ): Modifier[Name, Options] = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn), name = name.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modifier[Name, Options]]
  }
  
  @scala.inline
  implicit class ModifierMutableBuilder[Self <: Modifier[_, _], Name, Options] (val x: Self with (Modifier[Name, Options])) extends AnyVal {
    
    @scala.inline
    def setData(value: Obj): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEffect(value: /* arg0 */ ModifierArguments[Options] => js.Function0[Unit] | Unit): Self = StObject.set(x, "effect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFn(value: ModifierArguments[Options] => State | Unit): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Partial[Options]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPhase(value: ModifierPhases_): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresIfExists(value: js.Array[String]): Self = StObject.set(x, "requiresIfExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresIfExistsUndefined: Self = StObject.set(x, "requiresIfExists", js.undefined)
    
    @scala.inline
    def setRequiresIfExistsVarargs(value: String*): Self = StObject.set(x, "requiresIfExists", js.Array(value :_*))
    
    @scala.inline
    def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
    
    @scala.inline
    def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value :_*))
  }
}
