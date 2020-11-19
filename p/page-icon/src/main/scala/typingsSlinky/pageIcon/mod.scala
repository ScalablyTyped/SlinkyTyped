package typingsSlinky.pageIcon

import typingsSlinky.pageIcon.PageIcon.FetchOptions
import typingsSlinky.pageIcon.PageIcon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("page-icon", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(url: String): js.Promise[Icon] = js.native
  def apply(url: String, opts: FetchOptions): js.Promise[Icon] = js.native
}
