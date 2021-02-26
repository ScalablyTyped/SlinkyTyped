package typingsSlinky.fitbitAsap

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.fitbitAsap.appMod.Asap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object app extends Shortcut {
    
    @JSImport("fitbit-asap", "app.default")
    @js.native
    val default: Asap = js.native
    
    type _To = Asap
    
    /* This means you don't have to write `default`, but can instead just say `app.foo` */
    override def _to: Asap = default
  }
  
  object companion extends Shortcut {
    
    @JSImport("fitbit-asap", "companion.default")
    @js.native
    val default: typingsSlinky.fitbitAsap.companionMod.Asap = js.native
    
    type _To = typingsSlinky.fitbitAsap.companionMod.Asap
    
    /* This means you don't have to write `default`, but can instead just say `companion.foo` */
    override def _to: typingsSlinky.fitbitAsap.companionMod.Asap = default
  }
}
