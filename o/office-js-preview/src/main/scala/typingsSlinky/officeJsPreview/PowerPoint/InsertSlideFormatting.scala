package typingsSlinky.officeJsPreview.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InsertSlideFormatting extends js.Object
/**
  *
  * Specifies the formatting options for when slides are inserted.
  *
  * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("PowerPoint.InsertSlideFormatting")
@js.native
object InsertSlideFormatting extends js.Object {
  
  /**
    * Copy the source theme into the target presentation and use that theme.
    *
    */
  @js.native
  sealed trait keepSourceFormatting extends InsertSlideFormatting
  
  /**
    * Use the existing theme in the target presentation.
    *
    */
  @js.native
  sealed trait useDestinationTheme extends InsertSlideFormatting
}
