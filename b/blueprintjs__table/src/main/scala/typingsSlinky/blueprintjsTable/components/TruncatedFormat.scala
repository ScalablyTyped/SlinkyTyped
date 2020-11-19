package typingsSlinky.blueprintjsTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.truncatedFormatMod.ITrucatedFormateMeasureByApproximateOptions
import typingsSlinky.blueprintjsTable.truncatedFormatMod.ITruncatedFormatProps
import typingsSlinky.blueprintjsTable.truncatedFormatMod.TruncatedPopoverMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TruncatedFormat {
  
  @JSImport("@blueprintjs/table", "TruncatedFormat")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.TruncatedFormat] {
    
    @scala.inline
    def children(value: String): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def detectTruncation(value: Boolean): this.type = set("detectTruncation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def measureByApproxOptions(value: ITrucatedFormateMeasureByApproximateOptions): this.type = set("measureByApproxOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def parentCellHeight(value: Double): this.type = set("parentCellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def parentCellWidth(value: Double): this.type = set("parentCellWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preformatted(value: Boolean): this.type = set("preformatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showPopover(value: TruncatedPopoverMode): this.type = set("showPopover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def truncateLength(value: Double): this.type = set("truncateLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def truncationSuffix(value: String): this.type = set("truncationSuffix", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITruncatedFormatProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TruncatedFormat.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
