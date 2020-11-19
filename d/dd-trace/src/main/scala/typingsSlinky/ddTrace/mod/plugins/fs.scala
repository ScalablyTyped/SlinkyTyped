package typingsSlinky.ddTrace.mod.plugins

import typingsSlinky.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [fs](https://nodejs.org/api/fs.html) module.
  */
@js.native
trait fs
  extends Integration
     with Analyzable
object fs {
  
  @scala.inline
  def apply(): fs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[fs]
  }
}
