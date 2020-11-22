package typingsSlinky.ol.rasterMod

import org.scalajs.dom.raw.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var lib: js.UndefOr[js.Any] = js.native
  
  var operation: js.UndefOr[Operation] = js.native
  
  var operationType: js.UndefOr[RasterOperationType] = js.native
  
  var sources: js.Array[
    typingsSlinky.ol.sourceSourceMod.default | typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]
  ] = js.native
  
  var threads: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(
    sources: js.Array[
      typingsSlinky.ol.sourceSourceMod.default | typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]
    ]
  ): Options = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSourcesVarargs(
      value: (typingsSlinky.ol.sourceSourceMod.default | typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default])*
    ): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(
      value: js.Array[
          typingsSlinky.ol.sourceSourceMod.default | typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]
        ]
    ): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLib(value: js.Any): Self = this.set("lib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLib: Self = this.set("lib", js.undefined)
    
    @scala.inline
    def setOperation(
      value: (/* p0 */ js.Array[js.Array[Double] | ImageData], /* p1 */ js.Object) => js.Array[Double] | ImageData
    ): Self = this.set("operation", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    
    @scala.inline
    def setOperationType(value: RasterOperationType): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    
    @scala.inline
    def setThreads(value: Double): Self = this.set("threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreads: Self = this.set("threads", js.undefined)
  }
}
