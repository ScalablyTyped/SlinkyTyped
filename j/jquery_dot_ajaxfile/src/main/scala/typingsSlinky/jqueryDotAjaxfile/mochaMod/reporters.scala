package typingsSlinky.jqueryDotAjaxfile.mochaMod

import typingsSlinky.jqueryDotAjaxfile.Anon_Close
import typingsSlinky.jqueryDotAjaxfile.Mocha.IRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha", "reporters")
@js.native
object reporters extends js.Object {
  @js.native
  class Base protected ()
    extends typingsSlinky.jqueryDotAjaxfile.Mocha.reporters.Base {
    def this(runner: IRunner) = this()
  }
  
  @js.native
  class Doc ()
    extends typingsSlinky.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class Dot ()
    extends typingsSlinky.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class HTML ()
    extends typingsSlinky.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class HTMLCov ()
    extends typingsSlinky.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class JSON ()
    extends typingsSlinky.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class JSONCov ()
    extends typingsSlinky.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class JSONStream ()
    extends typingsSlinky.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class Landing ()
    extends typingsSlinky.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class List ()
    extends typingsSlinky.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class Markdown ()
    extends typingsSlinky.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class Min ()
    extends typingsSlinky.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class Nyan ()
    extends typingsSlinky.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class Progress protected ()
    extends typingsSlinky.jqueryDotAjaxfile.Mocha.reporters.Progress {
    /**
      * @param options.open String used to indicate the start of the progress bar.
      * @param options.complete String used to indicate a complete test on the progress bar.
      * @param options.incomplete String used to indicate an incomplete test on the progress bar.
      * @param options.close String used to indicate the end of the progress bar.
      */
    def this(runner: IRunner) = this()
    def this(runner: IRunner, options: Anon_Close) = this()
  }
  
  @js.native
  class Spec ()
    extends typingsSlinky.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class TAP ()
    extends typingsSlinky.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class XUnit protected ()
    extends typingsSlinky.jqueryDotAjaxfile.Mocha.reporters.XUnit {
    def this(runner: IRunner) = this()
    def this(runner: IRunner, options: js.Any) = this()
  }
  
}

