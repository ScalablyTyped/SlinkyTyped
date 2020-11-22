package typingsSlinky.nivoScales.mod

import typingsSlinky.nivoScales.nivoScalesStrings.linear
import typingsSlinky.nivoScales.nivoScalesStrings.log
import typingsSlinky.nivoScales.nivoScalesStrings.point
import typingsSlinky.nivoScales.nivoScalesStrings.symlog
import typingsSlinky.nivoScales.nivoScalesStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nivoScales.mod.LinearScale
  - typingsSlinky.nivoScales.mod.PointScale
  - typingsSlinky.nivoScales.mod.TimeScale
  - typingsSlinky.nivoScales.mod.TimeScaleFormatted
  - typingsSlinky.nivoScales.mod.LogScale
  - typingsSlinky.nivoScales.mod.SymlogScale
*/
trait Scale extends js.Object
object Scale {
  
  @scala.inline
  def LogScale(`type`: log): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def SymlogScale(`type`: symlog): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def TimeScaleFormatted(format: String, `type`: time): Scale = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def TimeScale(`type`: time): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def LinearScale(`type`: linear): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  def PointScale(`type`: point): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}
