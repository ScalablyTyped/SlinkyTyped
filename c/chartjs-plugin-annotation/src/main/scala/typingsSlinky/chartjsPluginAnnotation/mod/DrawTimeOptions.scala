package typingsSlinky.chartjsPluginAnnotation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DrawTimeOptions extends js.Object
@JSImport("chartjs-plugin-annotation", "DrawTimeOptions")
@js.native
object DrawTimeOptions extends js.Object {
  
  @js.native
  sealed trait afterDatasetsDraw extends DrawTimeOptions
  
  @js.native
  sealed trait afterDraw extends DrawTimeOptions
  
  @js.native
  sealed trait beforeDatasetsDraw extends DrawTimeOptions
}
