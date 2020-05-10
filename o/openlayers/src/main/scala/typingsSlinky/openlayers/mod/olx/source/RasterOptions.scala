package typingsSlinky.openlayers.mod.olx.source

import org.scalajs.dom.raw.ImageData
import typingsSlinky.openlayers.mod.GlobalObject
import typingsSlinky.openlayers.mod.RasterOperation
import typingsSlinky.openlayers.mod.RasterOperationType
import typingsSlinky.openlayers.mod.source.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @api
  */
@js.native
trait RasterOptions extends js.Object {
  var lib: js.UndefOr[GlobalObject] = js.native
  var operation: js.UndefOr[RasterOperation] = js.native
  var operationType: js.UndefOr[RasterOperationType] = js.native
  var sources: js.Array[Source] = js.native
  var threads: js.UndefOr[Double] = js.native
}

object RasterOptions {
  @scala.inline
  def apply(sources: js.Array[Source]): RasterOptions = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterOptions]
  }
  @scala.inline
  implicit class RasterOptionsOps[Self <: RasterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSources(value: js.Array[Source]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLib(value: GlobalObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lib")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(
      value: (/* data */ js.Array[js.Array[Double] | ImageData], /* obj */ GlobalObject) => js.Array[Double] | ImageData
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationType(value: RasterOperationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(js.undefined)
        ret
    }
    @scala.inline
    def withThreads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(js.undefined)
        ret
    }
  }
  
}

