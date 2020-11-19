package typingsSlinky.fluentBundle

import typingsSlinky.fluentBundle.mod.FluentBundleConstructorOptions
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fluent/bundle/compat", JSImport.Namespace)
@js.native
object compatMod extends js.Object {
  
  @js.native
  class FluentBundle protected ()
    extends typingsSlinky.fluentBundle.mod.FluentBundle {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: FluentBundleConstructorOptions) = this()
    def this(locales: js.Array[String], options: FluentBundleConstructorOptions) = this()
  }
  
  @js.native
  class FluentDateTime protected ()
    extends typingsSlinky.fluentBundle.mod.FluentDateTime {
    /** Options passed to Intl.DateFormat. */
    def this(value: js.Any) = this()
    def this(value: js.Any, opts: js.Any) = this()
  }
  
  @js.native
  class FluentError () extends Error
  
  @js.native
  class FluentNumber protected ()
    extends typingsSlinky.fluentBundle.mod.FluentNumber {
    /** Options passed to Intl.NumberFormat. */
    def this(value: js.Any) = this()
    def this(value: js.Any, opts: js.Any) = this()
  }
  
  @js.native
  class FluentResource protected ()
    extends typingsSlinky.fluentBundle.mod.FluentResource {
    def this(source: String) = this()
  }
  
  @js.native
  class FluentType protected ()
    extends typingsSlinky.fluentBundle.mod.FluentType {
    def this(value: js.Any) = this()
  }
}
