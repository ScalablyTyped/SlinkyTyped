package typingsSlinky.blueprintjsTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderModeMod {
  
  @js.native
  sealed trait RenderMode extends StObject
  @JSImport("@blueprintjs/table/lib/esm/common/renderMode", "RenderMode")
  @js.native
  object RenderMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RenderMode with String] = js.native
    
    /**
      * Renders cells in batches across multiple animation frames. This improves
      * performance by spreading out work to keep a high FPS and avoid blocking
      * the UI, but it also introduces a noticeable scan-line rendering artifact
      * as successive batches of cells finish rendering.
      */
    @js.native
    sealed trait BATCH extends RenderMode
    /* "batch" */ val BATCH: typingsSlinky.blueprintjsTable.renderModeMod.RenderMode.BATCH with String = js.native
    
    /**
      * Renders all cells synchronously on initial mount, then renders cells in
      * batches on successive updates (e.g. during scrolling). This helps to
      * remove visual rendering artifacts when the table is first rendered,
      * wihout slowing scrolling performance to a crawl.
      */
    @js.native
    sealed trait BATCH_ON_UPDATE extends RenderMode
    /* "batch-on-update" */ val BATCH_ON_UPDATE: typingsSlinky.blueprintjsTable.renderModeMod.RenderMode.BATCH_ON_UPDATE with String = js.native
    
    /**
      * Disables the batch-rendering behavior, rendering all cells synchronously
      * at once. This may result in degraded performance on large tables and/or
      * on tables with complex cells.
      */
    @js.native
    sealed trait NONE extends RenderMode
    /* "none" */ val NONE: typingsSlinky.blueprintjsTable.renderModeMod.RenderMode.NONE with String = js.native
  }
}
