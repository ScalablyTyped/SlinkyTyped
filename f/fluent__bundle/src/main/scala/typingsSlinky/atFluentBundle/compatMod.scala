package typingsSlinky.atFluentBundle

import typingsSlinky.atFluentBundle.atFluentBundleMod.FluentBundleConstructorOptions
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fluent/bundle/compat", JSImport.Namespace)
@js.native
object compatMod extends js.Object {
  @js.native
  class FluentBundle protected ()
    extends typingsSlinky.atFluentBundle.atFluentBundleMod.FluentBundle {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: FluentBundleConstructorOptions) = this()
    def this(locales: js.Array[String], options: FluentBundleConstructorOptions) = this()
  }
  
  @js.native
  class FluentDateTime protected ()
    extends typingsSlinky.atFluentBundle.atFluentBundleMod.FluentDateTime {
    /** Options passed to Intl.DateFormat. */
    def this(value: js.Any) = this()
    def this(value: js.Any, opts: js.Any) = this()
  }
  
  @js.native
  class FluentError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class FluentNumber protected ()
    extends typingsSlinky.atFluentBundle.atFluentBundleMod.FluentNumber {
    /** Options passed to Intl.NumberFormat. */
    def this(value: js.Any) = this()
    def this(value: js.Any, opts: js.Any) = this()
  }
  
  @js.native
  class FluentResource protected ()
    extends typingsSlinky.atFluentBundle.atFluentBundleMod.FluentResource {
    def this(source: String) = this()
  }
  
  @js.native
  class FluentType protected ()
    extends typingsSlinky.atFluentBundle.atFluentBundleMod.FluentType {
    def this(value: js.Any) = this()
  }
  
}

