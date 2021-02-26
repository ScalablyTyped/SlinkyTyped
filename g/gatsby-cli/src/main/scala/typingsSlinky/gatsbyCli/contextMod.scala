package typingsSlinky.gatsbyCli

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod extends Shortcut {
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/context", JSImport.Default)
  @js.native
  val default: Context[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IGatsbyState */ js.Any
  ] = js.native
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/context", "StoreStateProvider")
  @js.native
  val StoreStateProvider: ReactComponentClass[js.Object] = js.native
  
  type _To = Context[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IGatsbyState */ js.Any
  ]
  
  /* This means you don't have to write `default`, but can instead just say `contextMod.foo` */
  override def _to: Context[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IGatsbyState */ js.Any
  ] = default
}
