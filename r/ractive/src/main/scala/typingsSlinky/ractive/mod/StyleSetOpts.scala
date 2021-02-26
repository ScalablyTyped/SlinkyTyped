package typingsSlinky.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleSetOpts extends SetOpts {
  
  /** Whether or not to apply the new styles immediately. Defaults to updating the Ractive-managed style tag (true) */
  @JSName("apply")
  var apply: js.UndefOr[Boolean] = js.native
}
object StyleSetOpts {
  
  @scala.inline
  def apply(): StyleSetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleSetOpts]
  }
  
  @scala.inline
  implicit class StyleSetOptsMutableBuilder[Self <: StyleSetOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: Boolean): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
  }
}
