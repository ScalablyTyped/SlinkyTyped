package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Layer holds metadata specific to a layer of a Docker image.
  */
@js.native
trait SchemaLayer extends js.Object {
  /**
    * The recovered arguments to the Dockerfile directive.
    */
  var arguments: js.UndefOr[String] = js.native
  /**
    * The recovered Dockerfile directive used to construct this layer.
    */
  var directive: js.UndefOr[String] = js.native
}

object SchemaLayer {
  @scala.inline
  def apply(): SchemaLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLayer]
  }
  @scala.inline
  implicit class SchemaLayerOps[Self <: SchemaLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(js.undefined)
        ret
    }
    @scala.inline
    def withDirective(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directive")(js.undefined)
        ret
    }
  }
  
}

