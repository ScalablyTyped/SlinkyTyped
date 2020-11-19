package typingsSlinky.nivoSankey.mod

import typingsSlinky.nivoCore.mod.MotionProps
import typingsSlinky.nivoSankey.anon.Links
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedProps
  extends Data
     with MotionProps
     with SankeyProps
object SharedProps {
  
  @scala.inline
  def apply(data: Links): SharedProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedProps]
  }
}
