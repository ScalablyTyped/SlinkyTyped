package typingsSlinky.favicoJs

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.favicoJs.favicojs.FavicoJsOptions
import typingsSlinky.favicoJs.favicojs.FavicoJsStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Favico ()
    extends typingsSlinky.favicoJs.favicojs.Favico {
    def this(opt: FavicoJsOptions) = this()
  }
  
  @js.native
  object Favico extends TopLevel[FavicoJsStatic]
  
}

