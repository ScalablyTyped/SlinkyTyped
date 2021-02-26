package typingsSlinky.jqueryAjaxfile

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object knockoutMod extends Shortcut {
  
  @JSImport("knockout", JSImport.Namespace)
  @js.native
  val ^ : KnockoutStatic = js.native
  
  /////////////////////////////////
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("knockout", "bindingProvider")
  @js.native
  class bindingProvider () extends KnockoutBindingProvider
  
  //////////////////////////////////
  // nativeTemplateEngine.js
  //////////////////////////////////
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("knockout", "nativeTemplateEngine")
  @js.native
  class nativeTemplateEngine () extends KnockoutNativeTemplateEngine
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("knockout", "subscribable")
  @js.native
  class subscribable[T] () extends KnockoutSubscribable[T]
  
  //////////////////////////////////
  // templateEngine.js
  //////////////////////////////////
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("knockout", "templateEngine")
  @js.native
  class templateEngine () extends KnockoutTemplateEngine
  
  type _To = KnockoutStatic
  
  /* This means you don't have to write `^`, but can instead just say `knockoutMod.foo` */
  override def _to: KnockoutStatic = ^
}
