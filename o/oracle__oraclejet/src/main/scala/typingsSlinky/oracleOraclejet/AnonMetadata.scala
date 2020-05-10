package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojcompositeMod.Metadata
import typingsSlinky.oracleOraclejet.ojcompositeMod.ViewModelContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMetadata extends js.Object {
  var metadata: Metadata = js.native
  var view: String = js.native
  def parseFunction(
    value: String,
    name: String,
    meta: js.Object,
    defaultParseFunction: js.Function1[/* value */ String, _]
  ): js.Any = js.native
  def viewModel(param0: ViewModelContext): Unit | js.Object = js.native
}

object AnonMetadata {
  @scala.inline
  def apply(
    metadata: Metadata,
    parseFunction: (String, String, js.Object, js.Function1[/* value */ String, _]) => js.Any,
    view: String,
    viewModel: ViewModelContext => Unit | js.Object
  ): AnonMetadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], parseFunction = js.Any.fromFunction4(parseFunction), view = view.asInstanceOf[js.Any], viewModel = js.Any.fromFunction1(viewModel))
    __obj.asInstanceOf[AnonMetadata]
  }
  @scala.inline
  implicit class AnonMetadataOps[Self <: AnonMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseFunction(value: (String, String, js.Object, js.Function1[/* value */ String, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseFunction")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewModel(value: ViewModelContext => Unit | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

