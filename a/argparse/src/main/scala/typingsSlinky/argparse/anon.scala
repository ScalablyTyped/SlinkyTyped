package typingsSlinky.argparse

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.argparse.mod.Action
import typingsSlinky.argparse.mod.ActionConstructorOptions
import typingsSlinky.argparse.mod.ArgumentDefaultsHelpFormatter
import typingsSlinky.argparse.mod.HelpFormatter
import typingsSlinky.argparse.mod.RawDescriptionHelpFormatter
import typingsSlinky.argparse.mod.RawTextHelpFormatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends Instantiable0[
          HelpFormatter | ArgumentDefaultsHelpFormatter | RawDescriptionHelpFormatter | RawTextHelpFormatter
        ]
  
  @js.native
  trait Instantiable
    extends Instantiable0[js.Any]
  
  @js.native
  trait InstantiableAction extends Instantiable1[/* options */ ActionConstructorOptions, Action]
  
  @js.native
  trait Required extends StObject {
    
    var required: Boolean = js.native
  }
  object Required {
    
    @scala.inline
    def apply(required: Boolean): Required = {
      val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
      __obj.asInstanceOf[Required]
    }
    
    @scala.inline
    implicit class RequiredMutableBuilder[Self <: Required] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait _empty extends StObject {
    
    @JSName("_")
    var _underscore: typingsSlinky.argparse.argparseStrings.ActionConstructorOptions = js.native
  }
  object _empty {
    
    @scala.inline
    def apply(_underscore: typingsSlinky.argparse.argparseStrings.ActionConstructorOptions): _empty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[_empty]
    }
    
    @scala.inline
    implicit class _emptyMutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_underscore(value: typingsSlinky.argparse.argparseStrings.ActionConstructorOptions): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
    }
  }
}
