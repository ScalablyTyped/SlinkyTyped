package typingsSlinky.ol.rasterMod

import org.scalajs.dom.raw.ImageData
import typingsSlinky.ol.olStrings.image
import typingsSlinky.ol.olStrings.pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var lib: js.UndefOr[js.Any] = js.native
  var operation: js.UndefOr[Operation] = js.native
  var operationType: js.UndefOr[pixel | image] = js.native
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
    def withSources(
      value: js.Array[
          typingsSlinky.ol.sourceSourceMod.default | typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLib(value: js.Any): Self = {
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
      value: (/* p0 */ js.Array[js.Array[Double] | ImageData], /* p1 */ js.Object) => js.Array[Double] | ImageData
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
    def withOperationType(value: pixel | image): Self = {
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

