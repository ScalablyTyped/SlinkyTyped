package typingsSlinky.rdfjsExpressHandler.mod

import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.DatasetCoreFactory
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfjsExpressHandler.anon.Parsers
import typingsSlinky.rdfjsExpressHandler.mod.expressAugmentingMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RdfHandlerOptions extends js.Object {
  var baseIriFromRequest: js.UndefOr[Boolean | BaseIriFromRequest] = js.native
  var defaultMediaType: js.UndefOr[String] = js.native
  var factory: js.UndefOr[DatasetCoreFactory[Quad, Quad, DatasetCore[Quad, Quad]]] = js.native
  var formats: js.UndefOr[Parsers] = js.native
}

object RdfHandlerOptions {
  @scala.inline
  def apply(): RdfHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdfHandlerOptions]
  }
  @scala.inline
  implicit class RdfHandlerOptionsOps[Self <: RdfHandlerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseIriFromRequestFunction1(value: /* req */ Request => js.Promise[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseIriFromRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBaseIriFromRequest(value: Boolean | BaseIriFromRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseIriFromRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseIriFromRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseIriFromRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultMediaType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMediaType")(js.undefined)
        ret
    }
    @scala.inline
    def withFactory(value: DatasetCoreFactory[Quad, Quad, DatasetCore[Quad, Quad]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(js.undefined)
        ret
    }
    @scala.inline
    def withFormats(value: Parsers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(js.undefined)
        ret
    }
  }
  
}

