package typingsSlinky.jqueryAjaxfile

import typingsSlinky.jqueryAjaxfile.Mocha.IRunner
import typingsSlinky.jqueryAjaxfile.anon.Bail
import typingsSlinky.jqueryAjaxfile.anon.Close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mochaMod {
  
  @JSImport("mocha", JSImport.Namespace)
  @js.native
  class ^ () extends Mocha {
    def this(options: Bail) = this()
  }
  
  object reporters {
    
    @JSImport("mocha", "reporters.Base")
    @js.native
    class Base protected ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base {
      def this(runner: IRunner) = this()
    }
    
    @JSImport("mocha", "reporters.Doc")
    @js.native
    class Doc ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.Dot")
    @js.native
    class Dot ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.HTML")
    @js.native
    class HTML ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.HTMLCov")
    @js.native
    class HTMLCov ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.JSON")
    @js.native
    class JSON ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.JSONCov")
    @js.native
    class JSONCov ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.JSONStream")
    @js.native
    class JSONStream ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.Landing")
    @js.native
    class Landing ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.List")
    @js.native
    class List ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.Markdown")
    @js.native
    class Markdown ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.Min")
    @js.native
    class Min ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.Nyan")
    @js.native
    class Nyan ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.Progress")
    @js.native
    class Progress protected ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base {
      /**
        * @param options.open String used to indicate the start of the progress bar.
        * @param options.complete String used to indicate a complete test on the progress bar.
        * @param options.incomplete String used to indicate an incomplete test on the progress bar.
        * @param options.close String used to indicate the end of the progress bar.
        */
      def this(runner: IRunner) = this()
      def this(runner: IRunner, options: Close) = this()
    }
    
    @JSImport("mocha", "reporters.Spec")
    @js.native
    class Spec ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.TAP")
    @js.native
    class TAP ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.XUnit")
    @js.native
    class XUnit protected ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base {
      def this(runner: IRunner) = this()
      def this(runner: IRunner, options: js.Any) = this()
    }
  }
}
