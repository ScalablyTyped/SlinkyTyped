package typingsSlinky.jqueryAjaxfile.global

import typingsSlinky.jqueryAjaxfile.Mocha
import typingsSlinky.jqueryAjaxfile.Mocha.IRunner
import typingsSlinky.jqueryAjaxfile.anon.Bail
import typingsSlinky.jqueryAjaxfile.anon.Close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Mocha")
@js.native
class Mocha_ () extends Mocha {
  def this(options: Bail) = this()
}
// merge the Mocha class declaration with a module
@JSGlobal("Mocha")
@js.native
object Mocha_ extends js.Object {
  
  @js.native
  object reporters extends js.Object {
    
    @js.native
    class Base protected ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base {
      def this(runner: IRunner) = this()
    }
    
    @js.native
    class Doc ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class Dot ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class HTML ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class HTMLCov ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class JSON ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class JSONCov ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class JSONStream ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class Landing ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class List ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class Markdown ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class Min ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class Nyan ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
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
    
    @js.native
    class Spec ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class TAP ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class XUnit protected ()
      extends typingsSlinky.jqueryAjaxfile.Mocha.reporters.Base {
      def this(runner: IRunner) = this()
      def this(runner: IRunner, options: js.Any) = this()
    }
  }
}
