package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojcompositeMod.ViewModelContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  var metadata: typingsSlinky.oracleOraclejet.ojcompositeMod.Metadata = js.native
  var view: String = js.native
  def parseFunction(
    value: String,
    name: String,
    meta: js.Object,
    defaultParseFunction: js.Function1[/* value */ String, _]
  ): js.Any = js.native
  def viewModel(param0: ViewModelContext): Unit | js.Object = js.native
}

object Metadata {
  @scala.inline
  def apply(
    metadata: typingsSlinky.oracleOraclejet.ojcompositeMod.Metadata,
    parseFunction: (String, String, js.Object, js.Function1[/* value */ String, _]) => js.Any,
    view: String,
    viewModel: ViewModelContext => Unit | js.Object
  ): Metadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], parseFunction = js.Any.fromFunction4(parseFunction), view = view.asInstanceOf[js.Any], viewModel = js.Any.fromFunction1(viewModel))
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: typingsSlinky.oracleOraclejet.ojcompositeMod.Metadata): Self = {
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

