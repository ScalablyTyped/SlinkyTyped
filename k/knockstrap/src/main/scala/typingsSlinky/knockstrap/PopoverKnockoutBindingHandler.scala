package typingsSlinky.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler * / any */ @js.native
trait PopoverKnockoutBindingHandler extends StObject {
  
  var init: js.UndefOr[
    js.Function5[
      /* element */ js.Any, 
      /* valueAccessor */ js.Function0[_], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutAllBindingsAccessor */ /* allBindingsAccessor */ js.Any, 
      /* viewModel */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ /* bindingContext */ js.Any, 
      KnockoutControlsDescendantBindings
    ]
  ] = js.native
}
object PopoverKnockoutBindingHandler {
  
  @scala.inline
  def apply(): PopoverKnockoutBindingHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverKnockoutBindingHandler]
  }
  
  @scala.inline
  implicit class PopoverKnockoutBindingHandlerMutableBuilder[Self <: PopoverKnockoutBindingHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(
      value: (/* element */ js.Any, /* valueAccessor */ js.Function0[_], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutAllBindingsAccessor */ /* allBindingsAccessor */ js.Any, /* viewModel */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ /* bindingContext */ js.Any) => KnockoutControlsDescendantBindings
    ): Self = StObject.set(x, "init", js.Any.fromFunction5(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
  }
}
