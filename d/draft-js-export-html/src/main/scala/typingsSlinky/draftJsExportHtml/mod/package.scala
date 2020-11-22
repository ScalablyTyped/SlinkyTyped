package typingsSlinky.draftJsExportHtml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BlockRenderer = js.Function1[/* block */ typingsSlinky.draftJs.mod.ContentBlock, java.lang.String]
  
  type BlockStyleFn = js.Function1[
    /* block */ typingsSlinky.draftJs.mod.ContentBlock, 
    js.UndefOr[typingsSlinky.draftJsExportHtml.mod.RenderConfig]
  ]
  
  type EntityStyleFn = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ js.Any, 
    js.UndefOr[typingsSlinky.draftJsExportHtml.mod.RenderConfig]
  ]
}
