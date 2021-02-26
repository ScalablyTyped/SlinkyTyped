package typingsSlinky.grommet.anon

import typingsSlinky.grommet.grommetStrings.`1Slash2`
import typingsSlinky.grommet.grommetStrings.`1Slash3`
import typingsSlinky.grommet.grommetStrings.`1Slash4`
import typingsSlinky.grommet.grommetStrings.`2Slash3`
import typingsSlinky.grommet.grommetStrings.`2Slash4`
import typingsSlinky.grommet.grommetStrings.`3Slash4`
import typingsSlinky.grommet.grommetStrings.auto
import typingsSlinky.grommet.grommetStrings.fill
import typingsSlinky.grommet.grommetStrings.fit
import typingsSlinky.grommet.grommetStrings.flex
import typingsSlinky.grommet.grommetStrings.full
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Count extends StObject {
  
  var count: js.UndefOr[fit | fill | Double] = js.native
  
  var size: js.UndefOr[
    xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String]
  ] = js.native
}
object Count {
  
  @scala.inline
  def apply(): Count = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Count]
  }
  
  @scala.inline
  implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: fit | fill | Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setSize(
      value: xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String]
    ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSizeVarargs(value: String*): Self = StObject.set(x, "size", js.Array(value :_*))
  }
}
